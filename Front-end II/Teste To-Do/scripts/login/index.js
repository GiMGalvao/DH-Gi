let campoEmailLogin = document.getElementById('inputEmail');
let campoSenhaLogin = document.getElementById('inputPassword');
let botaoSalvar = document.getElementById('botaoSalvar');

let campoEmailLoginNormalizado;
let campoSenhaLoginNormalizado;

let emailEValido = false;
let senhaEValido = false;


botaoSalvar.setAttribute('disabled', true);
botaoSalvar.innerText = "Bloqueado"


const usuarioObjeto = {
    email: "",
    senha: ""
}


botaoSalvar.addEventListener('click', function (evento) {

   
    if (validaTelaDeLogin()) {
    
        campoEmailLoginNormalizado = retiraEspacosDeUmValorInformado(campoEmailLogin.value);
        campoSenhaLoginNormalizado = retiraEspacosDeUmValorInformado(campoSenhaLogin.value);

        campoEmailLoginNormalizado = converteValorRecebidoEmMinusculo(campoEmailLoginNormalizado);

     
        usuarioObjeto.email = campoEmailLoginNormalizado;
        usuarioObjeto.senha = campoSenhaLoginNormalizado;

        console.log(usuarioObjeto);

    } else {
        evento.preventDefault();
        
    }

});


campoEmailLogin.addEventListener('blur', function () {

    let emailValidacao = document.getElementById('emailValidacao');
    
    if (campoEmailLogin.value != "") {
        
        emailValidacao.innerText = ""
        campoEmailLogin.style.border = ``
        emailEValido = true;
    } else {
       
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










