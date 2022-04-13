let nomeCriarConta = document.getElementById("nome");
let apelidoCriarConta = document.getElementById("apelido");
let emailCriarConta = document.getElementById("email");
let senhaCriarConta = document.getElementById("senha");
let botaoCadastro = document.getElementById("botaoCadastro")

let cadastro = false;

botaoCadastro.addEventListener('click', function(event) {

    event.preventDefault();

    let dados = {
        "firstName": nomeCriarConta.value,
        "lastName": apelidoCriarConta.value,
        "email": emailCriarConta.value,
        "password": senhaCriarConta.value
      };

    
    fetch(`https://ctd-todo-api.herokuapp.com/v1/users`,    {
        method: 'POST',
        headers: {
            "Content-type" : 'application/json'
        },
        body: JSON.stringify(dados)
    
    })

    .then(response => response.json())

       
 console.log(dados); 

})

