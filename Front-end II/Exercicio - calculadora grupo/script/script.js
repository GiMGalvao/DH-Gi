alert("OLÁ VISITANTE");
alert("VAMOS COMEÇAR A UTILIZAR A NOSSA CALCULADORA BÁSICA!");
let numero1 = prompt("DIGITE O PRIMEIRO NÚMERO PARA EFETUAR O CÁLCULO", "digite um número inteiro ou decimal");
let numero2 = prompt("DIGITE O SEGUNDO NÚMERO PARA EFETUAR O CÁLCULO", "digite um número inteiro ou decimal");
// alert("POR FAVOR EFETUAR O CLICK NO BOTÃO REFERENTE A PROPRIEDADE MATEMÁTICA QUE DESEJA EFETUAR ");

let resultado = parseFloat(numero1);
let resultado2 = parseFloat(numero2);



document.querySelector('.adicao').onclick = function adicionar(numero1, numero2) {
    return alert("O resultado é =" + "   " + (resultado + resultado2));
}


// /*propriedade de subtração*/

document.querySelector('.subtracao').onclick = function subtracao() {
    return alert("O resultado é =" + "   " + (resultado - resultado2));
}


// /*propriedade de multiplicação*/

document.querySelector('.multiplicacao').onclick = function multiplicacao() {
    return alert("O resultado é =" + "   " + (resultado * resultado2));
}


// /*propriedade de divisão*/

// document.querySelector('.divisao').onclick = function divisao() {
//     return alert("O resultado da operação desejada é =", dividir)
// }
// let dividir = function divisao(numero1, numero2) {
//     return alert(numero1 / numero2);
// }



// /*
// function QuadradodoNumero(a) {
//     return multiplicacao(a, a);
// }
// console.log(QuadradodoNumero(5), " é o Quadrado do número informado");

// function mediaDeTresNumeros(a, b, c) {
//     return [adicionar(a, b, c)] / 3;

// }
// console.log(mediaDeTresNumeros(8, 6, 10), "é a média dos três números informados");

// function calculaPorcentagem(a, b) {
//     return [multiplicacao(a, b)] / 100;

// }
// console.log(calculaPorcentagem(300, 15), "%");

// function geradorDePorcentagem(a, b) {
//     return [divisao(a, b)] * 100;

// }
// console.log(geradorDePorcentagem(2, 100), "%");*/

// // let adicao = require('./scripts/adicao.js');
// // let multiplicar = require('./scripts/multiplicacao.js');
// // let divisao = require('./scripts/divisao.js');
// // let subtracao = require('./scripts/subtracao.js');

// // console.log(adicao.somar(10, 21));
// // console.log(multiplicar.multiplicacao(5, 2));
// // console.log(divisao.dividir(21, 3));
// // console.log(subtracao.subtrair(100, 45));


// switch(resultado){

//     case adicao:
//         document.querySelector('.adicao').onclick = function adicionar() {
//             return alert("O resultado da operação desejada é =" + somar);}
        
//         let somar = function adicionar(numero1, numero2) {
//             return alert(numero1 + numero2);

//         }; 
//     break;

//     case sub: 
//         document.querySelector('.sub').onclick = function subtracao() {
//             return alert("O resultado da operação desejada é =", subtrair);}
        
//         let subtrair = function subtrair(numero1, numero2) {
//             return (numero1 - numero2);
//         };
//     break;

// }