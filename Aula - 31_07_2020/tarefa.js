function cumprimentar () {
    alert("Olá!");
}
function trocarFundo() {
    var fundo = document.getElementById("body");
    fundo.style.backgroundColor = "green";
}
function trocarFundo2() {
    var fundo = document.getElementById("body");
    fundo.style.backgroundColor = "white";
}
function vendoImagem (){
    console.log("Estou vendo a imagem")
}
function clicandoImagem() {
    var el = document.getElementById("neuronio");
    el.addEventListener("click",function () {
        console.log("Estou clicando na imagem");
    })
}
