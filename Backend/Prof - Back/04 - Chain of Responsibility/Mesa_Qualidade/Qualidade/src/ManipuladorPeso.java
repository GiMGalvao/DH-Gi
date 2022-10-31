public class ManipuladorPeso extends Manipulador {

    public void verificar(Artigo arti)
    {
        if ((arti.getPeso() < 1200) || (arti.getPeso() > 1300))
        {
            System.out.println("Rejeitado por peso");
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

