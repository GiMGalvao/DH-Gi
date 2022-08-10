import java.lang.constant.Constable;

public class SerieProxy implements ISerie {

   private int qtdViews;

   public SerieProxy(int qtdViews) {
      this.qtdViews = qtdViews;
   }

    public int getQtdViews() {
        return qtdViews;
    }

    public void setQtdViews(int qtdViews) {
        this.qtdViews = qtdViews;
    }



    @Override
   public int getSerie(String nomeSerie) throws SerieNaoHabilitadoException {
    int serie = qtdViews;

    if(getQtdViews() < 5 ){
       throw new SerieNaoHabilitadoException(nomeSerie + " nao disponivel, pois tem qtde de views = " + qtdViews );

    }

      return serie;
   }
}
