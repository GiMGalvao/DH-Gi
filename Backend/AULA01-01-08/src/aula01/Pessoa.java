package aula01;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    List<String> collection;

    public Pessoa(String nome, String sobrenome, LocalDate dataNascimento) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNascimento = dataNascimento;
    }

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int calcularIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();

    }

    public List<String> adicionarNomes(Pessoa pessoa){

        int tamanhoNome = pessoa.getNome().length();
        int idade = pessoa.calcularIdade();

        if(tamanhoNome > 4 && idade > 17){
            collection.add(pessoa.getNome());
            System.out.println(collection);

        }
        return null;
    }

}
