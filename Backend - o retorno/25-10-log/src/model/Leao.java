package model;

import inter.IFelino;
import org.apache.log4j.Logger;


public class Leao implements IFelino {
    private static final Logger logger = Logger.getLogger(String.valueOf(Leao.class));

    private String nome;
    private int idade;

    private boolean alpha;

    public Leao(String nome, int idade, boolean alpha) {
        this.nome = nome;
        this.idade = idade;
        this.alpha = alpha;
    }

    public Leao(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isAlpha() {
        return alpha;
    }

    public void setAlpha(boolean alpha) {
        this.alpha = alpha;
    }

    @Override
    public void correr() {
        logger.info("The Lion " + nome + "its running");
    }
}
