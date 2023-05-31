import { useState } from 'react';
import style from './App.css';
import CardComponent from './Components/Card/CardComponent';
import InputComponent from './Components/Input/InputComponent';


function App() {

  const [title, setTitle] = useState("");
  const [imgUrl, setImgUrl] = useState("");
  const [card, setCard] = useState({});

  const [isFormValid, setIsFormValid] = useState(false);

  const handleChangeTitle = (event) => {
    setTitle(event.target.value)
  }

  const handleChangeImgUrl = (event) => {
    setImgUrl(event.target.value)
  }

  const formValidator = () => {
    
    if (title.length >= 3 && imgUrl.length >= 6) {
        setIsFormValid(true);
    } else {
        alert ("Por favor, verifique os dados inseridos no formulário");
    }
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
          fnOnKeyUp={formValidator}  

        />

        <InputComponent
          title="Img URL"
          type="url"
          value={imgUrl}
          fnOnChange={handleChangeImgUrl}
          fnOnKeyUp={formValidator}
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