import Card from "./Components/Card"

/*const titulos = ["Card1", "Card2", "Card3", "Card4"];*/

const dados = [
  {
    id: 1,
    titulo: "titulo 1",
    subtitulo: "Subtitulo1",
    url: "https://media.swncdn.com/via/11629-istockgetty-images-plusarkira.jpg"

  },
  {
    id: 2,
    titulo: "titulo 2",
    subtitulo: "Subtitulo1",
    url: "https://media.swncdn.com/via/11629-istockgetty-images-plusarkira.jpg"


  },
  {
    id: 3,
    titulo: "titulo 3",
    subtitulo: "Subtitulo1",
    url: "https://media.swncdn.com/via/11629-istockgetty-images-plusarkira.jpg"


  }


]


function App() {
  

  return (
    <div>
      <h1>APP</h1>

      {dados.map((dado) => (
        <Card 
        key={dado.id} 
        dado={dado}
        /*title={dado.titulo}  
        subtitulo={dado.subtitulo}
        */
        />
      ))}


      {/*<Card title="Card1" />
      <Card title="Card2" />
      <Card title="Card3" />*/}

    </div>

  )
}

export default App
