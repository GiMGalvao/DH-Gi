function liturgiaHoras() {

var laudes = window.document.getElementById('laudes')
var laudesTxt = window.document.getElementById('laudes-txt') 
var completas = window.document.getElementById('completas')
var completasTxt = window.document.getElementById('completas-txt') 
var data = new Date()
// var hora = data.getHours()
var hora = 20



if (hora >= 0 && hora < 12){

laudesTxt.classList.add = ("laudes-txt");
laudes.innerHTML = `São ${hora}h. Vamos rezar as laudes`

// }else if (hora >= 12 && hora < 18){
//     laudesTxt.classList.remove =("laudes-txt")
//     completasTxt.classList.add = ("completas-txt");
    // laudes.innerHTML = `São ${hora}h. Vamos rezar as completas`

} else {
    laudesTxt.classList.remove =("laudes-txt")
        laudesTxt.innerHTML = "Completas as ";
}

}