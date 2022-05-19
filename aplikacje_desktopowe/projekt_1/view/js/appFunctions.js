const { ipcRenderer } = require("electron");
const ipc = ipcRenderer;
const closeBtn = document.getElementById("closeBtn");
const minimizeBtn = document.getElementById("minimizeBtn");
const refreshBtn = document.getElementById("refreshBtn");


const polish_keyCode_list = {
  8: "Backspace",
  9: "Tab",
  13: "Enter",
  16: "Shift",
  17: "Ctrl",
  18: "Alt",
  19: "Pause/Break",
  20: "Caps Lock",
  27: "Escape",
  32: "Space",
  33: "Page Up",
  34: "Page Down",
  35: "End",
  36: "Home",
  37: "Left Arrow",
  38: "Up Arrow",
  39: "Right Arrow",
  40: "Down Arrow",
  45: "Insert",
  46: "Delete",
  48: "0",
  49: "1",
  50: "2",
  51: "3",
  52: "4",
  53: "5",
  54: "6",
  55: "7",
  56: "8",
  57: "9",
  65: "A",
  66: "B",
  67: "C",
  68: "D",
  69: "E",
  70: "F",
  71: "G",
  72: "H",
  73: "I",
  74: "J",
  75: "K",
  76: "L",
  77: "M",
  78: "N",
  79: "O",
  80: "P",
  81: "Q",
  82: "R",
  83: "S",
  84: "T",
  85: "U",
  86: "V",
  87: "W",
  88: "X",
  89: "Y",
  90: "Z",
  91: "Windows",
  93: "Right Click",
}



// on keydown
document.onkeydown = function (e) {
  // send ipc with e.keyCode as param
  ipc.send("keydown", polish_keyCode_list[e.keyCode]);
};


// closing app
closeBtn.addEventListener("click", () => {
  console.log("Bye Bye 😥");
  ipc.send("close-app");
});

// minimize
minimizeBtn.addEventListener("click", () => {
  ipc.send("minimize-app");
});

// refreshing
refreshBtn.addEventListener("click", () => {
  ipc.send("reload-app");
});
