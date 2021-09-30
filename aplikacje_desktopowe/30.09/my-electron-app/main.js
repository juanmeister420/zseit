const { app, BrowserWindow } = require('electron')

function createWindow () {
    const win = new BrowserWindow({
      width: 368,
      height: 600
    })
  
    win.loadFile('index.html')
  }

  
  app.whenReady().then(() => {
    createWindow()
  })
  