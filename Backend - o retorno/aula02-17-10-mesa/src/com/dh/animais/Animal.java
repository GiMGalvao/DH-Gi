package com.dh.animais;

public abstract class Animal {

    private String cor;

    public Animal(String cor) {
        this.cor = cor;
    }

    public abstract void falar();
    public abstract void andar();

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
