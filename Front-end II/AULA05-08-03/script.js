//se o usuario clicar em light modo claro, se ele clicar em dark, modo escuro


let escolhaUsuario = confirm("Deseja modo escuro?");

let body = document.querySelector('body');
let h1 = document.querySelector('h1');
let itemsList = document.querySelectorAll('.item');

if (escolhaUsuario){
    body.classList.add("body-dark");
    h1.classList.add("h1-dark");
    itemsList.forEach(item => {
        item.classList.add('items-dark');
        item.classList.add('items-text-dark');
    });


}else {
    body.classList.remove ("body-dark");
    alert("Já está no modo claro")  


};


