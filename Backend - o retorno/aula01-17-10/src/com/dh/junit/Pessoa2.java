package com.dh.junit;

public class Pessoa2{

    private int idade;

    public Pessoa2(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean verificaMaioridade(int idade){
        return idade >= 18;
    }
    public boolean validaIgualdadeNumeros(int n1, int n2){
        return n1 == n2;
    }

    public int retorna20(){
        return 20;
    }


}
