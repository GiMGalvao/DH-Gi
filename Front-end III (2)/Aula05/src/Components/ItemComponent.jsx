function ItemComponent (bimestre, ano, disciplinas) {
    return ( 
    <div>
      <h1>Bimestre {bimestre} - Ano {ano}</h1>
      <h3>Disciplinas</h3>
      <p>{disciplinas}</p>
     </div>


     );
}

export default ItemComponent ;