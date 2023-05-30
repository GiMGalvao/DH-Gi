/* 
    FILTRO
const numeros = [1,2,3,4,5]

const result = numeros.filter((item)=> item>4)

console.log(result)*/

/*
    SOMA VALORES DA ARRAY
const numeros = [1,2,3,4,5]

const total = numeros.reduce((numero, soma) => numero+soma)

console.log(total)*/

/*
    MAP
const numeros = [1,2,3,4,5,10]

const numerosAoQuadrado = numeros.map((numero)=> numero*numero)

console.log(numerosAoQuadrado)*/

/*
    OBJETOS
const usuarios =[
    {
        nome: "Gi",
        idade: 28
    },
    {
        nome: "Ana",
        idade: 289    
    },
    {
        nome: "Mary",
        idade: 29    
    },
    {
        nome: "José",
        idade: 15    
    },

]

const result = usuarios.reduce((soma, usuario) => usuario.idade + soma,0)
console.log(result) */

const usuarios =[
    {
        nome: "Gi",
        idade: 28
    },
    {
        nome: "Ana",
        idade: 289    
    },
    {
        nome: "Mary",
        idade: 29    
    },
    {
        nome: "José",
        idade: 15    
    },

]

const result = usuarios.map((usuario) => usuario.idade*usuario.idade)
console.log(result)