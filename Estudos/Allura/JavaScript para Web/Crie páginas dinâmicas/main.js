//função genérica
function tocaSom (seletorAudio) {
   const elemento = document.querySelector(seletorAudio);


   if (elemento /*!= null (IF entende que se o elemento tiver null não executa*/ && elemento.localName === 'audio'){
   
        elemento.play();

    }else{
        console.log('Elemento não encontrado ou seletor inválido'); 
    }

};

//querySelectorAll - uma lista de Todos elementos que tem aquele seletor
const listaDeTeclas = document.querySelectorAll('.tecla');

//numero do indice para chamar elemento dentro da lista
//listaDeTeclas[0].onclick = tocaSom;


/*
variável para contar as repetições
let contador =0;
enquanto - repeticao (condicao){ rotina o que vai fazer}>dentro uma funcao anonima
while (contador < listaDeTeclas.length){

    const tecla = listaDeTeclas[contador];
    const instrumento = tecla.classList[1];
    //template String ${}
    const idAudio = `#som_${instrumento}`;

   tecla.onclick = function(){
        tocaSom(idAudio);
    };

    contador = contador + 1;

}*/

for (let contador = 0; contador< listaDeTeclas.length; contador++ ){

    const tecla = listaDeTeclas[contador];
    const instrumento = tecla.classList[1];
    const idAudio = `#som_${instrumento}`;   //template String ${}

   tecla.onclick = function(){
        tocaSom(idAudio);
    };

    tecla.onkeydown = function (evento){
       
       if (evento.code === 'Space' || evento.code === 'Enter'){
        tecla.classList.add('ativa');
        }
    }

    tecla.onkeyup = function (){
        tecla.classList.remove('ativa');
    }

}
