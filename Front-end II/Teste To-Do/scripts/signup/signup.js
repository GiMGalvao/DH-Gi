let nomeCriarConta = document.getElementById("nome");
let apelidoCriarConta = document.getElementById("apelido");
let emailCriarConta = document.getElementById("email");
let senhaCriarConta = document.getElementById("senha");
// let repetirSenhaCriarConta = getElementById("repetirSenha");
let botaoCadastro = document.getElementById("botaoCadastro")



botaoCadastro.addEventListener('click', function(event) {

    event.preventDefault();

    let dados = {
        "firstName": nomeCriarConta.value,
        "lastName": apelidoCriarConta.value,
        "email": emailCriarConta.value,
        "password": senhaCriarConta.value
      };

    
    fetch('https://ctd-todo-api.herokuapp.com/v1/users',    {
        method: 'POST',
        body: JSON.stringify(dados),
        headers: {
            'content-type':'application/json'

        }
    
    })

    .then(function(response){
        return response.json()

    })
    
 console.log(dados); 

})
