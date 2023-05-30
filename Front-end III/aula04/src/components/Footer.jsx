function Footer(props){

    return(
        <footer>
 
         <center>{props.title ? props.title : "VALOR DEFAULT!"}</center>
         <center>{props.idade ? props.idade : "VALOR DEFAULT!"}</center>
       </footer>
    )



  /*   if(props.title){
        return(
            <footer>
     
             <center>{props.title}</center>
     
           </footer>
         )

    }else{
        return(
            <footer>
     
             <center>VALOR DEFAULT!</center>
     
           </footer>
         )    

    } */



    

}

export default Footer;
