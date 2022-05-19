const { app, BrowserWindow, ipcMain } = require("electron");
const path = require("path");
const ipc = ipcMain;
/*
    Oh boy, let's get this rolling...
*/
const createWindow = () => {
  const win = new BrowserWindow({
    width: 1920,
    height: 1080,
    // Blok resizing
    resizable: false,
    // disable awful frame 🤢
    frame: false,
    
    webPreferences: {
      nodeIntegration: true,
      contextIsolation: false,
      devTools: true,
    },
  });
  // center the window
  win.center();
  win.loadFile("./view/index.html");

  // close app
  ipc.on("close-app", () => {
    app.quit();
  });

  // capture keydown with param
  ipc.on("keydown", (event, keyCode) => {
    console.log(keyCode);
  });

  // minimize app
  ipc.on("minimize-app", () => {
    console.log("minimizing app");
    win.minimize();
  });
  ipc.on("reload-app", () => {
    console.log("refreshing...");
    win.reload();
  });
};

app.whenReady().then(() => {
  createWindow();

  app.on("activate", () => {
    // On macOS it's common to re-create a window in the app when the
    // dock icon is clicked and there are no other windows open.
    if (BrowserWindow.getAllWindows().length === 0) createWindow();
  });
});
