public class SerieProxy implements ISerie{

    Serie serie = new Serie();
   private int qtdViews;

    public SerieProxy() {
//
    }

//    public SerieProxy(Serie serie) {
//        this.serie = serie;
//    }

    public int getQtdViews(int i) {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }


    public int contadorViews(){

       serie = this.qtdViews =+ 1;

        return qtdViews;
    }

    @Override
    public String getSerie(String nome) throws SerieNaoHabilitadoException {

       if (contadorViews() <= 5){

       return "A Série " + nome + "já vai começar!" ;
    }else{
           throw new SerieNaoHabilitadoException("Máximo de series assistidas atingido!");
       }

       }

}
