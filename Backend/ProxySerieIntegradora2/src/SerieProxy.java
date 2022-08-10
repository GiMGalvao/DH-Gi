import java.util.ArrayList;
import java.util.HashSet;

public class SerieProxy {
    Serie serie = new Serie();
    HashSet<String> qtdViews = new HashSet<String>();

    public SerieProxy(Serie serie) {
        this.serie = serie;
    }

    public String getSerie(String nome) throws SerieNaoHabilitadaException{
        if(qtdViews.contains(nome)){
            System.out.println("O " + nome + " já está na lista!");
            return serie.getSerie(nome);
        }
        else {
            if(qtdViews.size() < 6){
                qtdViews.add(nome);
                System.out.println("O " + nome + " foi adicionado!");
                return serie.getSerie(nome);
            }
            else{
                throw new SerieNaoHabilitadaException("Excede o número de reproduções permitidas!");
            }
        }
    }
}
