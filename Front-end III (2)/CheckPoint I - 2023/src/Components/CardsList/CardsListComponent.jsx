import style from "./CardsListComponent.module.css";
import CardComponent from "../Card/CardComponent";

function CardsListComponent({ cards }) {
    return (
        <div className={style.div}>
            {
                cards.length > 0 ?
                    cards.map(cards => {
                        return (
                            <CardComponent
                                key={cards.title}
                                title={cards.title}
                                img={cards.imageUrl}
                            />
                        )
                    })
                    : <CardComponent />
            }
        </div>
    );
}

export default CardsListComponent;