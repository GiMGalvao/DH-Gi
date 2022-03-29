var tituloFilme = document.getElementById('titulo')
var descricaoFilme = document.getElementById('descricao')
var urlFilme = document.getElementById('urlcapa')
var botao = document.querySelector('#btnSub')
var elementoTitulo
var body = document.getElementById('body')

  botao.addEventListener('click', event => event.preventDefault())

function criarCard() {
  var txtTitulo = document.createElement('div') // criar elemento
  txtTitulo.classList.add('formulario') // copiando a formatação já existente
  txtTitulo.innerHTML = `<img src="${urlCapa.value}">
  <h2>${tituloFilme.value}</h2>
  <p> ${descricaoFilme.value}</p>` // Pegar a div e inserir elementos com a informação usuário

  body.appendChild(txtTitulo)
}

botao.addEventListener('click', () => criarCard())
