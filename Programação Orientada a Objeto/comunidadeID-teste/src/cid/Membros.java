package cid;

public class Membros {

    private String nome;
    private String dtNasc;
    private int idade;
    private String apostolado;

//    public Membros(String nome, String dtNasc, int idade, String apostolado) {
//        this.nome = nome;
//        this.dtNasc = dtNasc;
//        this.idade = idade;
//        this.apostolado = apostolado;



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(String dtNasc) {
        this.dtNasc = dtNasc;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getApostolado() {
        return apostolado;
    }

    public void setApostolado(String apostolado) {
        this.apostolado = apostolado;
    }

@Override
    public String toString(){

        return "Código: "+nome+ "" +
                "\n"+ "Nome: "+idade+"" +
                "\n"+"Endereço: "+dtNasc+"" ;
}



}




