//evento(qual é o evento, o q faz)
//funcao anonima , só vai ser disparada quando acontecer o evento & funcao declarada > vc chama mais vezes

/*const robotron = document.querySelector('#robotron')
robotron.addEventListener("click", (evento) => {
    console.log(evento)
})

\admin\themes\function dizOi(nome){

    console.log("Oi " + nome)
    console.log("Bem vindo ao Robotron 2000!")
}

dizOi("Pedro");
*/


const controle = document.querySelectorAll("[data-controle]")

//qual elemento foi clicado
controle.forEach( (elemento ) => {
    elemento.addEventListener("click", (evento) =>{
        manipularDados(evento.target.dataset.controle , evento.target.parentNode)
    })

}) 

//parseINt > transforma a String em INT
 
function manipularDados(operacao, controle){

    const peca = controle.querySelector(".controle-contador");

    if(operacao == "-"){
        peca.value = parseInt(peca.value) - 1
    }else{ 
        peca.value = parseInt(peca.value) + 1
    }


}
