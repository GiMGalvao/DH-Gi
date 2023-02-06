//comando alert, segura a execução da pagina 
//alert (); > sintaxe 

// //confirm ()
// let resultado = confirm("deseja realmente excluir esse cliente"); 
// console.log(resultado)

//prompt 
// let nome = prompt("digite seu  nome: ")

// alert ("Olá" + nome);

// += > concatena e atribui 


let tratamentoPersonalizado = confirm("Deseja um tratamento personalizado?")

if(tratamentoPersonalizado) {
  let nome = prompt("Por favor, digite seu nome");
   alert("Bem-vindo ao nosso site "+ nome +". Muito obrigado pela sua visita, estamos à sua disposição! ?");
   document.querySelector('h1').innerText += '  ' + nome;

} else {
   alert("Obrigado por conectar.")

}
    

