function microondas (tempoComida){

  let tempoPipoca = 10;
  let tempoMacarrao = 8; 
  let tempoCarne = 15; 
  let tempoFeijao = 12; 
  let tempoBrigadeiro = 8;

  
  
  switch (tempoComida) {
  
      case 'pipoca' :

           if (tempoUsuario > (3*tempoPipoca)) {
              console.log("KABUUM!!");
          }    
      
          else if (tempoUsuario > (2*tempoPipoca)) {
              console.log("Queimou!");
          }

          else  if (tempoUsuario < tempoPipoca) {
              console.log("Tempo Insuficiente!");
          }
    
          else{ console.log("Comida Pronta!");}

      break;
  
      case 'macarrao' :

          if (tempoUsuario > (3*tempoMacarrao)) {
             console.log("KABUUM!!");
         }    
     
         else if (tempoUsuario > (2*tempoMacarrao)) {
             console.log("Queimou!");
         }

         else  if (tempoUsuario < tempoMacarrao) {
             console.log("Tempo Insuficiente!");
         }

          else{ console.log("Comida Pronta!");}

     break;    

     case 'carne' :

          if (tempoUsuario > (3*tempoCarne)) {
         console.log("KABUUM!!");
           }    
 
          else if (tempoUsuario > (2*tempoCarne)) {
          console.log("Queimou!");
          }

          else  if (tempoUsuario < tempoCarne) {
          console.log("Tempo Insuficiente!");
          }

          else{ console.log("Comida Pronta!");}

      break;     

      case 'feijao' :
      
          if (tempoUsuario > (3*tempoFeijao)) {
          console.log("KABUUM!!");
          }    

          else if (tempoUsuario > (2*tempoFeijao)) {
              console.log("Queimou!");
          }

          else  if (tempoUsuario < tempoFeijao) {
              console.log("Tempo Insuficiente!");
          }

          else{ console.log("Comida Pronta!");}

      break;    

      case 'brigadeiro' :

              if (tempoUsuario > (3*tempoBrigadeiro)) {
              console.log("KABUUM!!");
          }    

          else if (tempoUsuario > (2*tempoBrigadeiro)) {
              console.log("Queimou!");
          }

          else  if (tempoUsuario < tempoBrigadeiro) {
              console.log("Tempo Insuficiente!");
          }

          else{ console.log("Comida Pronta!");}

      break;    

      default:
            console.log("Comida Inexistente!!");
            break;


  }

  
  }

let tempoUsuario = 18;
microondas('pipoca')
microondas('macarrao')
microondas('carne')
microondas('feijao')
microondas('brigadeiro')
microondas('arroz')