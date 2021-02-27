let idGuy = document.querySelector("#id-collector");
let modalGuy = document.querySelector(".my-modal");
let val = idGuy.textContent;

modalGuy.setAttribute("href", `/delete/${val}`);
modalGuy.addEventListener("click", ()=> alert(val));
idGuy.remove();