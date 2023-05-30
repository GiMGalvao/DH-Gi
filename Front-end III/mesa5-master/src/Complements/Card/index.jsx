import "./styles.module.css"

function Card (props){

const {produto} = props;

return(

    <li className="card">
    <h3> {produto.nome} </h3>
    <img src={produto.image}  />
    <p> {produto.preco} </p>
    </li>

)


}

export default Card