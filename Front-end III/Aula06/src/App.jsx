import Card from "./Components/Card"


const usuarios= [

  {
    id: 1,
    name: "Giov",
    turma: "Front2",
    ativo: true
  },
  {
    id: 2,
    name: "Giova",
    turma: "Front3",
    ativo: false
  },
  {
    id: 3,
    name: "Giovan",
    turma: "Front4",
    ativo: true
  }


]

function App() {
 
  return (
   <div>

      <h1>Hello</h1>
      <ul>
      {usuarios.map((usuario) => (
        <Card key={usuario.id} usuario = {usuario} />

      ))}
      </ul>

    </div>
  )
}

export default App
