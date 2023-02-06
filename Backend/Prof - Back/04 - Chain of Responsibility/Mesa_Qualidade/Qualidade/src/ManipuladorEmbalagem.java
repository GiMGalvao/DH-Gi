public class ManipuladorEmbalagem extends Manipulador {

    public void verificar(Artigo arti)
    {
        if (!arti.getEmbalagem().equalsIgnoreCase("saudável") &&
            !arti.getEmbalagem().equalsIgnoreCase("quase saudável"))
        {
            System.out.println("Rejeitado por embalagem");
        } else {
            if( this.getSeguinte() != null )
            {
                // Chamamos ao método o seguinte objeto
                this.getSeguinte().verificar( arti );
            }
        }
    }

}

