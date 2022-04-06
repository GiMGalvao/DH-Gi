'use strict';

const preencherFormulario = (endereco) => {

    document.getElementById("endereco").value = endereco.logradouro; 
    document.getElementById("bairro").value = endereco.bairro; 

}

const cepValido = (cep) => cep.lenght == 8; 


const pesquisarCep = async() => {
    const cep = document.getElementById("cep").value;
    const url = `https://viacep.com.br/ws/${cep}/json/`;

    if (cepValido(cep)){

        const dados = await fetch(url);
        const endereco = await dados.json();
        preencherFormulario(endereco);

    } else{

        document.getElementById("endereco").value = "CEP INCORRETO!";
    }

 
    
}

document.getElementById("cep")
    .addEventListener("focusout", pesquisarCep);

