let nomeCriarConta = document.getElementById("nome");
let apelidoCriarConta = document.getElementById("apelido");
let emailCriarConta = document.getElementById("email");
let senhaCriarConta = document.getElementById("senha");
// let repetirSenhaCriarConta = getElementById("repetirSenha");
let botaoCadastro = document.getElementById("botaoCadastro")



botaoCadastro.addEventListener('click', function(event) {

    event.preventDefault();

    let dados = {
        "firstName": "string",
        "lastName": "string",
        "email": "string",
        "password": "string"
      };

    
    fetch('https://ctd-todo-api.herokuapp.com/v1/users',    {
        method: 'POST',
        body: dados,
        headers: {
            'content-type':'application/json'

        }
    
    })

    .then(function(response){
        return response.json()

    })
    
 console.log(dados); 

})