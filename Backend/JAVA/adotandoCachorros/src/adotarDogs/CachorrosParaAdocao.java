package adotarDogs;

import jdk.swing.interop.SwingInterOpUtils;

public class CachorrosParaAdocao {

    //atributos
    private String nome;
    private String raca;
    private double peso;
    private boolean ehApto;
    private boolean temChip;
    private boolean estaFerido;
    private int anoNasc;

    //construtor


    public CachorrosParaAdocao(String nome, String raca, double peso, boolean estaFerido, int anoNasc, boolean temChip) {
        this.nome = nome;
        this.raca = raca;
        this.peso = peso;
        this.estaFerido = estaFerido;
        this.anoNasc = anoNasc;
        this.temChip = temChip;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public String getRaca() {

        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getPeso() {

        return peso;
    }

    public void setPeso(double peso) {

        this.peso = peso;
    }

    public boolean isEhApto() {

        return isEhApto();
    }

    public void setEhApto(boolean ehApto) {

        this.ehApto = ehApto;
    }

    public boolean isTemChip() {

        return temChip;
    }

    public void setTemChip(boolean temChip) {

        this.temChip = temChip;
    }

    public boolean isEstaFerido() {

        return estaFerido;
    }

    public void setEstaFerido(boolean estaFerido) {

        this.estaFerido = estaFerido;
    }

    public int getAnoNasc() {

        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }


    public boolean podeAdotar() {

        if (!this.estaFerido && this.peso > 5) {
            this.ehApto = true;

        }else{
            this.ehApto = false;
        }

    return ehApto;
    }

    public void resultado (){

        System.out.println("*Informacoes sobre o(a) cachorro (a) " + this.getNome() + " da raca " + this.getRaca() + ":");

        System.out.println("Quantos anos ela tem?");

        System.out.println(2022 - this.anoNasc);

        System.out.println("Possui chip?");

        if(temChip == true){
            System.out.println("Sim");
        }else{
            System.out.println("Nao");

        }

        System.out.println("O(A) " + this.nome + ", pode ser adotado(a)?");

        if(podeAdotar() == true){
            System.out.println("Pode sim");
        }else{
            System.out.println("Nao pode nao");

        }

    }

}



