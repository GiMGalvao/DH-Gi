public class ManipuladorLote extends Manipulador {
    public void verificar(Artigo arti)
    {
        if ((arti.getLote() < 1000) || (arti.getLote() > 2000))
        {
            System.out.println("Rejeitado por lote");
        }
        else
        {
            if( this.getSeguinte() != null )
            {
                // Chamamos ao método o seguinte objeto
                this.getSeguinte().verificar( arti );
            }
        }
    }

}
