//permite q o js acesse todos os elementos da pagina
//é atraves dele que vamos alterar o html através das tags
// tags encapsula 
//arvore de elemento  



// console.log(document.getElementById('nome_usuario'))
// console.log(document.getElementsByName('nome'))

//192. PARTE 3

function distribuiCaracter(){

    var caracter = document.getElementById('entrada').value
    document.getElementById('entrada').value = ""

    //limpar espaços em branco nas estremidades 

    caracter.trim()

    switch(caracter){
        case '0': //string pq vem como string o valor
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':

         //nao tem break pq vamos tomar uma unica decisão
        //adc caracter no campo referente a numeros

        document.getElementById('numeros').value = caracter
       

        break;

        default:
            //se nao for letra vai para numero

            document.getElementById('letras'). value = caracter
    }

}