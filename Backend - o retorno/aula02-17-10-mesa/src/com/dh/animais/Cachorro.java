package com.dh.animais;

public class Cachorro extends Animal {


    public Cachorro(String cor) {
        super(cor);
    }

    @Override
    public void falar() {
        System.out.println("O cachorro late");

    }

    @Override
    public void andar() {
        System.out.println("O cachorro tem 4 patas e anda");

    }
}
