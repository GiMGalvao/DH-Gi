import InputComponent from "./Components/InputComponent"
import FormComponent from "./Components/FormComponent"

function App (){
  return ( 
    <>

    <FormComponent> 

    <InputComponent 
      label="Titulo"
      type ="text"
    /> 

      <br />
      <br />
      
      <InputComponent 
        label="Descrição"
        type="text"
      /> 

      <br />
      <br />

      <InputComponent 
        label="Valor"
        type="number"
      /> 

      <br />
      <br />

      <InputComponent 
        label="Img Url" 
        type="url"
      /> 

      <br />
      <br />

      <button>Salvar</button>

    </FormComponent>   
   
        
    </>

  )

}

export default App