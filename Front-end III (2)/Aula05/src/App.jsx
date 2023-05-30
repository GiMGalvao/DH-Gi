
import ItemComponent from "./Components/ItemComponent";
import ctdEstrutura from "./ctd_estrutura";

function App() {
  return ( 

    <>
    <h1>CTD - Jornada do Aluno </h1>
    
 
    {ctdEstrutura.map(item => {
        return (
        <ItemComponent 
          bimestre={item.bimestre}
          ano={item.ano}
          disciplinas={item.disciplinas}
        
        />
        )
    })}

    </>

   );
}

export default App;