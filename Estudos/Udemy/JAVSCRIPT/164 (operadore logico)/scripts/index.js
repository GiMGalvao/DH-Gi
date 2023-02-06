// && (E) 
//
//var teste1 = 2
// var teste2 = 4
// var teste3 = 2


// if(teste1 <= teste2 && teste1 == teste3){

//     alert("YES")

// }else{

//     alert("NO")

// };

// || (OU)

// var teste1 = 7
// var teste2 = 4
// var teste3 = 6


// if(teste1 <= teste2 || teste1 == teste3){

//     alert("YES")

// }else{

//     alert("NO")

// }

// ! NEGAÇÃO> INVERTE O RESULTADO LOGICO

// var teste1 = 2
// var teste2 = 4
// var teste3 = 2


// if(!(teste1 <= teste2)){

//     alert("YES")

// }else{

//     alert("NO")

// }


var nota = prompt("Digite sua nota:")
var faltas = prompt("Quantidade de faltas:")
var media = 7
var faltasMax = 15


if (nota >= media && faltas <= faltasMax ){
document.write("APROVADO")

}else{
    document.write("REPROVADO")

}

