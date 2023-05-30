import styles from "./styles.module.css";

function Card (props){

  const {usuario}  = props;

    return (

        <li className = {usuario.ativo ? styles.rowGreen : styles.rowRed
        }>
        <h3> {usuario.name} </h3>
        <p> {usuario.turma} </p>
        </li>
    );

}

export default Card 