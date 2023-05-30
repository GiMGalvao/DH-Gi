function Card(props) {
  
    return (
      <div>
        <h4>{props.dado.titulo}</h4>
        <p>{props.dado.subtitulo}</p>
        <img src={props.dado.url} />
      </div>
  
    )
  }
  
  export default Card
  