//encapsular um bloco de códigos com objetivo definido

var lar = prompt('Largura')
var alt = prompt('Altura')


function calcularAreaTerreno (lar, alt){

//logica da funcao 
    var area = lar * alt
       return area
}

document.write('o terreno possui' + area)

//Aula180
//propriedade length > qtde de caracteres
// chartAt > document.write('Giovanna'.chartAt(8) ) > retorna a letra que esta na posiação 
//replace > troca o texto procurado para o texto indicado

//Aula 181
//funcoes matematicas 

var x = Math.ceil(10.380) //arredondar para cima 
var x = Math.floor(10.380) //numero inteiro
var x = Math.round(10.380) //se for ate 4 arredonda pra baixo, se for 6 arredonda pra cima
var x = Math.random() //aleatorio
 

//Aula 182
//funcoes com datas

var data = new Date()
 
data.getDate()
// > dia do sistema operacional na hora da criacao
data.getMonth() +1 
// (o 1 soma pq o codigo entende 0 como primeiro numero)
data.getFullYear()
//ano

data.toString()
//muda para uma String 

data.setDate(data.getDate()+1)
//setar um valor novo > pegar a data e somar 1 dia (trocar dia)

data.setMonth(data.getMonth()-1)//
//troca o mes + ou -

data.setFullYear(data.getFullYear() -1)
//adciona ou remove um ano 

//diferença de dias nas datas baiaox:
var data1 = new Date(2017, 0, 15)
var data2 = new Date(2017, 1, 23)

//converter num valor que eu cosiga calcular, no caso abaixo para ms

data1.getTime()
data2.getTime()
//subtraia a diferenca entre as duas datas e colocasr abs para deixar no positivo
Math.abs(data1.getTime() - data2.getTime())

//calcular esse resultado em dias 
(1*24*60*60*1000)//essa conta é quantos milissegundos em cada dia 

// resultado da qtde de ms e divido pelo resultado da multiplicação acima 