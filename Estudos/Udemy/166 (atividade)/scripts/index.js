idade = prompt("Digite sua idade:");
idade = parseInt(idade)

if(idade >= 0 && idade < 15){
    document.write("Bambino")

}else if(idade >= 15 && idade < 30){
    document.write("Giovane")


}else if(idade >= 30 && idade < 60){
    document.write("Adulto")


}else{
    document.write("Vecchio ")

}