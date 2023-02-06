package adotarDogs;

public class CachorrosParaAdocao {

    private String nome;
    private String raca;
    private double peso;
    private boolean ehApto;
    private boolean temChip;
    private boolean estaFerido;
    private int anoNasc;

    public CachorrosParaAdocao(boolean temChip, int anoNasc) {
        this.temChip = temChip;
        this.anoNasc = anoNasc;
    }



    public int CachorrosParaAdocao(int anoNasc){
        this.anoNasc = anoNasc;
        int idade = 2022 - anoNasc;
        return idade;

    }


    public boolean ehApto(){

        boolean dog = f;
        return dog;
    }

getters
}

public class DogsDogs {

    String nome;
    String raca;
    int anoNasc;
    double peso;
    boolean eApto;
    boolean possuiChip;
    boolean estaFerido;

    public DogsDogs(String nome, String raca, int anoNasc, double peso, boolean eApto, boolean possuiChip, boolean estaFerido)
    {
        this.nome = nome;
        this.raca = raca;
        this.anoNasc = anoNasc;
        this.peso = peso;
        this.eApto = eApto;
        this.possuiChip = possuiChip;
        this.estaFerido = estaFerido;
    }

}
