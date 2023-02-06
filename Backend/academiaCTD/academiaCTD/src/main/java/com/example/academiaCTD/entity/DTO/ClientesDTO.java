package com.example.academiaCTD.entity.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
public class ClientesDTO {

    private  int matricula;
    private Integer id;

    @NotEmpty(message = "{campo.nome.obrigatorio}")
    private String nome;
    @NotEmpty(message = "{campo.sobrenome.obrigatorio}")
    private String sobrenome;


    private double altura;
    private double peso;
    private String email;
    private String senha;


    public ClientesDTO(String nome, String sobrenome, Integer matricula, double altura, double peso) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.matricula = matricula;
        this.altura = altura;
        this.peso = peso;
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

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
