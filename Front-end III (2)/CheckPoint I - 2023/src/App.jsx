import { useState } from 'react';
import './App.css';
import InputComponent from './Components/Input/InputComponent';
import CardComponent from './Components/Card/CardComponent';
import CardsListComponent from './Components/CardsList/CardsListComponent';

function App() {

  const [title, setTitle] = useState("");
  const [imgUrl, setImgUrl] = useState("");
  const [card, setCard] = useState([]);

  const [inputTitleSend, setInputTitleSend] = useState(false);
  const [inputImgUrlSend, setInputImgUrlSend] = useState(false);
  const [formIsSend, setFormIsSend] = useState(undefined); 



  const handleChangeTitle = (event) => {
    setTitle(event.target.value)
     
    const inputNormalized = normalizeInputData(event.target.value);

    if (inputNormalized.length >= 3) {
      setInputTitleSend(true);
    } else {
      setInputTitleSend(false);
    }
}

const handleChangeImgUrl = (event) => {
  setImgUrl(event.target.value)

       if (event.target.value.length >= 6 && /\d/.test(event.target.value)) { 
        setInputImgUrlSend(true);
    } else {
      setInputImgUrlSend(false);
    }


}

const handleSaveForm = () => {

   if (inputTitleSend && inputImgUrlSend) {

    setFormIsSend(true);

     setCard(
      [
        ...card,
        {
          title: title,
          imgUrl: imgUrl
        }
      ]
    )

  
    setTitle("");
    setImgUrl("");
    setFormIsSend(undefined); 

  } else {
    setFormIsSend(false);
  }

}


  return (
    <>
      <h2>Coloque seu Santo de devoção aqui</h2>

        
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

      <h5 style={{
        color: "red"
      }}> {
          (!formIsSend && formIsSend != undefined) ?
            "Dados inseridos incorretamente"
            : ""
        }</h5>

      <button  className='{style.button}'
      
        onClick={handleSaveForm}>
        Salvar
      </button>


    
      <CardsListComponent
        cards = {card}
      />


    </>
  )
}

export default App