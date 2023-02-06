

function mudaCor (){ 

    
    document.getElementById('informacao').style.backgroundColor = "#FFFFE0"

 
}


function validaCampo (){

       
var valor = document.getElementById('informacao').value


    if(valor.length <= 3){

        document.getElementById('informacao').style.background = '#E9967A'
    
    
    }else{ 
    
        document.getElementById('informacao').style.background = '#98FB98'
    
    }


}
   

 