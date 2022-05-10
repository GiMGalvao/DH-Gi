function calcular (tipo, valor){

if(tipo === 'acao'){

    if(valor === 'c'){
        document.getElementById('resultado').value = "";

    }else if(valor === '+' || valor == '-' || valor === '*' || valor === '/' || valor === '.'){
       
        document.getElementById('resultado').value +=  valor

    }else if(valor === '='){

        var valorCampo = eval(document.getElementById('resultado').value) //eval converte string em uma operação que o js pode realizar
        document.getElementById('resultado').value = valorCampo

    }


}else if (tipo === 'valor'){

     document.getElementById('resultado').value +=  valor //ele pega o valor do resultado e concatena com ele mesmo
}


}