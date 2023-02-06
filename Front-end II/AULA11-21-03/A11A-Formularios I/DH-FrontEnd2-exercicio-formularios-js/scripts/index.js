const registerBtn = document.querySelector(".register-btn");

registerBtn.addEventListener("click", () => {

  
  // 1. Obter o valor introduzido no input do e-mail.
var email = document.getElementById("email-input").value;
console.log(email)


  // 2. Obter o valor introduzido no input de senha.
var senha = document.getElementById("password-input").value;
console.log(senha)

  // 3. Obter o valor do input de rádio.
  // 5. Validar se o utilizador for maior de idade. Caso contrário, mostramos
  // uma mensagem de erro: "Tem de ser maior de idade para se registar no site". SEM SUCESSO
  
var maiorIdade = document.getElementsByName("legalAge");

let maiorIdadeObrigatorio; 

maiorIdade.forEach(function(maiorIdade){

if (maiorIdade.checked){

  maiorIdadeObrigatorio = maiorIdade;

  console.log(maiorIdadeObrigatorio.value)

}

})

 // 4. Obter o valor do input com o checkbox.
var termos = document.getElementById(`tyc-input`); 
console.log(termos.value);
console.log(termos.checked);

  
  // 6. Validamos se o utilizador aceitou os termos e condições. Caso contrário, exibimos
  // uma mensagem de erro: "Deve aceitar os termos e condições para se registar no site".

  // 7. Por fim, se tudo estiver correto, exibimos um objeto no console com as informações definidas pelo utilizador. 
});
