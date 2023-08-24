import style from "./CardComponent.module.css";

function CardComponent(props) {

    const imgUrlDefault = "https://catequistasbrasil.com.br/wp-content/uploads/2020/04/santa-rita-de-cassia-catequistasbrasil.jpg";

    return (
        <div className={style.div}>
            <h2 className={style.title}>{props.title ?? "Santo não enviado"}</h2>
            <img className={style.img} src={props.imgUrl ?? imgUrlDefault} alt="img" />
        </div>
    );
}

export default CardComponent;