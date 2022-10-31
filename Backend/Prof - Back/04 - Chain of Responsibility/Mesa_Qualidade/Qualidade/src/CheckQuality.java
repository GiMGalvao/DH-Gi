public class CheckQuality
    {
    Manipulador inicial;

    public CheckQuality() {
        this.inicial = new ManipuladorLote();
        Manipulador peso = new ManipuladorPeso();
        Manipulador envase = new ManipuladorEmbalagem();
        Manipulador acepta = new ManipuladorAceitar();

        inicial.setSeguinte( peso );
        peso.setSeguinte( envase );
        envase.setSeguinte( acepta );
    }

    public void verificar(Artigo arti)
        {
            inicial.verificar( arti );
        }
    }
