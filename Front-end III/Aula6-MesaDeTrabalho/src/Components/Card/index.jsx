import styles from "./styles.module.css";

function Card (props){

  const {city}  = props;

  if(city.country === "BR"){
    return (
             <div>     
            <li>
            <h1>{city.country}</h1>
            <h3> {city.id} </h3>
            </li>
            </div>   

  )}

   
        
          
   

}

export default Card 