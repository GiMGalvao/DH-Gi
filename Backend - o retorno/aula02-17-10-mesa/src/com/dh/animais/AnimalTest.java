package com.dh.animais;

import org.testng.annotations.Test;

public class AnimalTest {

    @Test
    void verificandoCachorro(){
        Cachorro cao = new Cachorro("amarelo");
        cao.andar();
        cao.falar();

    }

    @Test
    void verificandoPassaro(){
        Passaro passarinho = new Passaro("amarelo");
        passarinho.andar();
        passarinho.falar();

    }


}