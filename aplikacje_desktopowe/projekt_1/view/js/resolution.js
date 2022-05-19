window.addEventListener("DOMContentLoaded", () => {
  const resolution_div = document.getElementById("resolution");
  setInterval(() => {
    resolution_div.innerHTML = `${window.innerWidth} x ${window.innerHeight}`;
  }, 1000);
});
