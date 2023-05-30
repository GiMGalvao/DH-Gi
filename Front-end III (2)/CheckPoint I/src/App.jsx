import { useState } from 'react';
import style from './App.css';
import CardComponent from './Components/Card/CardComponent';
import InputComponent from './Components/Input/InputComponent';


function App() {

  const [title, setTitle] = useState("");
  const [imgUrl, setImgUrl] = useState("");
  const [card, setCard] = useState({});


  const handleChangeTitle = (event) => {
    setTitle(event.target.value)
  }

  const handleChangeImgUrl = (event) => {
    setImgUrl(event.target.value)
  }

  const handleButtonClick = (event) => {

    event.preventDefault()

    setCard(
      {
        title: title,
        imgUrl: imgUrl
      }
    );

  }

  return (
    <>
      <h2>Coloque seu Santo de devoção aqui</h2>

      <form>

        <InputComponent
          title="Santo(a)"
          type="text"
          value={title}
          fnOnChange={handleChangeTitle}

        />

        <InputComponent
          title="Img URL"
          type="url"
          value={imgUrl}
          fnOnChange={handleChangeImgUrl}
        />

        <button className={style.button} onClick={handleButtonClick}>Salvar</button>

      </form>

      <CardComponent
        title={card.title}
        imgUrl={card.imgUrl}
      />

    </>
  )
}

export default App