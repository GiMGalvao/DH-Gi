function Card(props){

const {title, img} = props;

    return(
        <div style={{ width: 80, border: "1px solid black"}}>
            <img width={40} src={props.img} alt={props.title} />
            <span>{props.title}</span>
      </div>
    )   
}

export default Card;