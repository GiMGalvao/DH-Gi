<<<<<<< HEAD
//Capturando os campos do formulário
=======
>>>>>>> 10f92222dc242a7f0b998a207228ed2c1c096817
let campoEmailLogin = document.getElementById('inputEmail');
let campoSenhaLogin = document.getElementById('inputPassword');
let botaoSalvar = document.getElementById('botaoSalvar');

let campoEmailLoginNormalizado;
let campoSenhaLoginNormalizado;

let emailEValido = false;
<<<<<<< HEAD

//Desabilita o botão ao iniciar a página
botaoSalvar.setAttribute('disabled', true);
botaoSalvar.innerText = "Bloqueado"

//Cria o objeto que representa o login do usuário
=======
let senhaEValido = false;


botaoSalvar.setAttribute('disabled', true);
botaoSalvar.innerText = "Bloqueado"


>>>>>>> 10f92222dc242a7f0b998a207228ed2c1c096817
const usuarioObjeto = {
    email: "",
    senha: ""
}

<<<<<<< HEAD
//Executa ao clicar no botão de Acessar
botaoSalvar.addEventListener('click', function (evento) {

    //Se a validação passar, se for true o retorno da função....
    if (validaTelaDeLogin()) {
        //Normalizando - Retirando os espaços em branco
=======

botaoSalvar.addEventListener('click', function (evento) {

   
    if (validaTelaDeLogin()) {
    
>>>>>>> 10f92222dc242a7f0b998a207228ed2c1c096817
        campoEmailLoginNormalizado = retiraEspacosDeUmValorInformado(campoEmailLogin.value);
        campoSenhaLoginNormalizado = retiraEspacosDeUmValorInformado(campoSenhaLogin.value);

        campoEmailLoginNormalizado = converteValorRecebidoEmMinusculo(campoEmailLoginNormalizado);

<<<<<<< HEAD
        //Atribui as variáveis normalizadas ao objeto do login
=======
     
>>>>>>> 10f92222dc242a7f0b998a207228ed2c1c096817
        usuarioObjeto.email = campoEmailLoginNormalizado;
        usuarioObjeto.senha = campoSenhaLoginNormalizado;

        console.log(usuarioObjeto);

<<<<<<< HEAD
    //Se a validação NÃO passar, se for false o retorno da função....
=======

>>>>>>> 10f92222dc242a7f0b998a207228ed2c1c096817
    } else {
        evento.preventDefault();
        alert("Ambas as informações devem ser preenchidas");
    }

});

<<<<<<< HEAD
//Ao clicar e interagir com o campo de "email" no formulário
campoEmailLogin.addEventListener('blur', function () {
    //Capturando o elemento <Small> do html
    let emailValidacao = document.getElementById('emailValidacao');

    if (campoEmailLogin.value != "") {
        //Email tem informação
=======

campoEmailLogin.addEventListener('blur', function () {

    let emailValidacao = document.getElementById('emailValidacao');
    
    if (campoEmailLogin.value != "") {
        
>>>>>>> 10f92222dc242a7f0b998a207228ed2c1c096817
        emailValidacao.innerText = ""
        campoEmailLogin.style.border = ``
        emailEValido = true;
    } else {
<<<<<<< HEAD
        //Email está vazio
=======
       
>>>>>>> 10f92222dc242a7f0b998a207228ed2c1c096817
        emailValidacao.innerText = "Campo obrigatório"
        emailValidacao.style.color = "#E01E1E"
        emailValidacao.style.fontSize = "8"
        emailValidacao.style.fontWeight = "bold"
        campoEmailLogin.style.border = `1px solid #E01E1E`
        emailEValido = false;
    }
    validaTelaDeLogin();
});

function validaTelaDeLogin() {
    if (emailEValido) {
        botaoSalvar.removeAttribute('disabled')
        botaoSalvar.innerText = "Acessar"
        return true
    } else {
        botaoSalvar.setAttribute('disabled', true);
        botaoSalvar.innerText = "Bloqueado"
        return false
    }
}


<<<<<<< HEAD


=======
campoSenhaLogin.addEventListener('blur', function () {
    
    let senhaValidacao = document.getElementById('senhaValidacao');
    
    if (campoSenhaLogin.value != "") {
        
        senhaValidacao.innerText = ""
        campoSenhaLogin.style.border = ``
        emailEValido = true;
    } else {
        
        senhaValidacao.innerText = "Campo obrigatório"
        senhaValidacao.style.color = "#E01E1E"
        senhaValidacao.style.fontSize = "8"
        senhaValidacao.style.fontWeight = "bold"
        campoSenhaLogin.style.border = `1px solid #E01E1E`
        senhaEValido = false;
    }
    validaTelaDeLogin();
});
>>>>>>> 10f92222dc242a7f0b998a207228ed2c1c096817










