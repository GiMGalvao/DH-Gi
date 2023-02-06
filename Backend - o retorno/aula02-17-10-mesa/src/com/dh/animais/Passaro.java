package com.dh.animais;

public class Passaro extends Animal{


    public Passaro(String cor) {
        super(cor);
    }

    @Override
    public void falar() {
        System.out.println("O passaro pia");

    }

    @Override
    public void andar() {
        System.out.println("O passaro voa");
    }
}
