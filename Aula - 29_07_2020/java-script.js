function parOuImpar (num) {
    if (num % 2 == 0) {
        console.log("O número " + num + " é par");
    }
    else {
        console.log("O número " + num + " é ímpar");
    }
}
// parOuImpar(0);

let ePrimo = (num) => {
    var primo = 1;
    for (i = 2; i < num; i++) {
        if (num % i == 0) {
            primo = 0;
            console.log("O número " + num + " não é primo");
            i = num;
        }
    }
    if (primo == 1) {
        console.log("O número " + num + " é primo");
    }
};
// ePrimo(16);

function contagem (callback) {
    for (i = 10; i > 0; i = i-1) {
        console.log(i);
    }
    setTimeout(callback, 5000);
}

function print () {
    console.log("Feliz Natal");
}
// contagem(print);

//const cont = new Promise((resolve, reject) => {
//    for (i = 10; i > 0; i = i-1) {
//        console.log(i);
//    }
//})

//const prin = new Promise ((resolve, reject) => {
//    setTimeout(function () {
//        console.log("Feliz Ano Novo");
//    }, 5000);
//})
// cont.then(prin);

const asyncFunction = async () => {
    try {
        var contar = await contagem;
        var imprimir = await print;
    }
    catch(err) {
        console.log(err);
    }
}
// asyncFunction();

var notas = [5.3,4.7,8.5,7.1,6.4,9.2,9.8,5.5,7.4,7.0];
function aprovados (notas) {
    for (let i = 0; i < notas.length; i++) {
        if (notas[i] > 7) {
            console.log(notas[i]);
        }
    }
}
//aprovados(notas);

var produto1 = {
    nome: "manga",
    valor: 4,
}
var produto2 = {
    nome: "chocolte",
    valor: 10,
}
var produto3 = {
    nome: "pão",
    valor: 5,
}
var lista = [produto1,produto2,produto3];

function somar (lista) {
    let soma = 0;
    for (i = 0; i < lista.length; i++) {
        soma = soma + lista[i].valor
    }
    console.log("O valor total da lista é " + soma);
}
// somar (lista);

aluno1 = {
    nome: "Maria",
    serie: 8,
    materia: "",
}
aluno2 = {
    nome: "João",
    serie: 9,
    materia: "",
}
aluno3 = {
    nome: "Lucas",
    serie: 9,
    materia: ","
}
aluno4 = {
    nome: "Carol",
    serie: 9,
    materia: "",
}
aluno5 = {
    nome: "Pedro",
    serie: 8,
    materia: "",
}
var alunos = [aluno1,aluno2,aluno3,aluno4,aluno5];

function aula(alunos) {
    for (i = 0; i < alunos.length; i++) {
        if (alunos[i].serie == 8) {
            alunos[i].materia = "História";
        }
        else {
            alunos[i].materia = "Física";
        }
    }
    for (i = 0; i < alunos.length; i++) {
        console.log(alunos[i].nome + " tem aula de " + alunos[i].materia);
    }
}
aula(alunos);