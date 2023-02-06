
function imcCalculo(){

    
    var nome = document.getElementById('nome').value
    var sobrenome = document.getElementById('sobrenome').value
    var idade = document.getElementById('idade').value 
    var peso = document.getElementById('peso').value 
    var altura = document.getElementById('altura').value 
    var plano = document.getElementById('plano').value 
    var resultado = document.querySelectorAll('p')

    altura = altura / 100;

    var imc = peso / (altura * altura);


    resultado = document.write(nome + ' ' + sobrenome + 'com a idade de' + idade + 'anos, peso de ' + peso + 'kg e altura de ' + altura + 'cm. Possui índice de massa corporal igual a :' + imc + 'tendo seu plano de saúde: ' + plano); 


}