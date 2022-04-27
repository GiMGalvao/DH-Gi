var nome = prompt("Digite aqui seu nome")
var altura = prompt("Digite aqui sua altura em cm")
var peso = prompt("Digite aqui seu peso")

altura = parseFloat(altura)
peso = parseFloat(peso)

altura /=100 

var resultadoImc = peso / (altura * altura)

if (resultadoImc < 16){

    document.write("Baixo peso muito grave")

    
}else if (resultadoImc >= 16 && resultadoImc < 16,99){

    document.write("Baixo peso grave")

    
}else if (resultadoImc >= 17 && resultadoImc < 18,49){

    document.write("Baixo peso")

    
}else if (resultadoImc >= 18,50 && resultadoImc < 24,99){

    document.write("Peso Normal!!")

    
}else if (resultadoImc >= 25 && resultadoImc < 29,99){

    document.write("Sobrepeso")

    
}else if (resultadoImc >= 30 && resultadoImc < 34,99){

    document.write("Obesidade grau I")
    
}else if (resultadoImc >= 35 && resultadoImc < 39,99){

    document.write("Obesidade grau II")
    
}else{ 

    document.write("Obesidade grau III")

}

