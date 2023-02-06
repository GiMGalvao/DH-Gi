package com.dh.junit;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class Pessoa {

    private String nome;
    private LocalDate idade;
    private String sobrenome;

    List<String> colecao = new ArrayList<>();

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public  void adicionarNome(Pessoa pessoa){

        int nomeTamanho = pessoa.getNome().length();
        int idade = pessoa.converteIdade();

        if(nomeTamanho>= 5 && idade>= 18){
            colecao.add(pessoa.getNome());
            System.out.println(colecao);
        }

    }

    public int converteIdade(){
        int idade = Period.between(this.idade, LocalDate.now()).getYears();
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getIdade() {
        return idade;
    }

    public void setIdade(LocalDate idade) {
        this.idade = idade;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public List<String> getColecao() {
        return colecao;
    }

    public void setColecao(List<String> colecao) {
        this.colecao = colecao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", idade=" + idade +
                '}';
    }

}
