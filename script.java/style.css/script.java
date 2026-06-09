// ACCORDION

const botoes =
document.querySelectorAll(".accordion-btn");

botoes.forEach(botao => {

botao.addEventListener("click", () => {

const conteudo =
botao.nextElementSibling;

if(conteudo.style.display === "block"){

conteudo.style.display = "none";

}else{

conteudo.style.display = "block";

}

});

});

// MODO ESCURO

const modoTema =
document.getElementById("modoTema");

modoTema.addEventListener("click", () => {

document.body.classList.toggle("dark");

});

// TAMANHO DA FONTE

let tamanhoFonte = 100;

document
.getElementById("aumentarFonte")
.addEventListener("click", () => {

tamanhoFonte += 10;

document.body.style.fontSize =
tamanhoFonte + "%";

});

document
.getElementById("diminuirFonte")
.addEventListener("click", () => {

tamanhoFonte -= 10;

document.body.style.fontSize =
tamanhoFonte + "%";

});

// LEITURA POR VOZ

let fala;

document
.getElementById("lerPagina")
.addEventListener("click", () => {

speechSynthesis.cancel();

const texto =
document.getElementById("conteudo").innerText;

fala =
new SpeechSynthesisUtterance(texto);

fala.lang = "pt-BR";

speechSynthesis.speak(fala);

});

// PARAR LEITURA

document
.getElementById("pararLeitura")
.addEventListener("click", () => {

speechSynthesis.cancel();

});