public class Main {
    public static void main(String[] args) throws SerieNaoHabilitadoException {

        SerieProxy serie = new SerieProxy();

        try {

            System.out.println(serie.getSerie("GOT "));
            System.out.println(serie.getSerie("Bull "));
            System.out.println(serie.getSerie("Friends "));
            System.out.println(serie.getSerie("Stranger Things "));
            System.out.println(serie.getSerie("Criminal Minds "));
            System.out.println(serie.getSerie("Chicago Med "));



        }
        catch (SerieNaoHabilitadoException naoHabilitadoException){
            System.out.println(naoHabilitadoException);
        }
    }
}