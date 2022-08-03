package aula01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    @BeforeEach

    void doBefore() {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setDataNascimento(LocalDate.of(2016, 3, 23));
        p2 = new Pessoa("Ana", "Musk");
        p2.setDataNascimento(LocalDate.of(1966, 1, 03));
        p3 = new Pessoa("Joe", "Morello");
        p3.setDataNascimento(LocalDate.of(2010, 12, 04));
        p4 = new Pessoa("Rob", "Johnson");
        p4.setDataNascimento(LocalDate.of(1976, 10, 25));
        p5 = new Pessoa("Ted", "Trujillo");
        p5.setDataNascimento(LocalDate.of(2014, 5, 14));
        p6 = new Pessoa("Robert", "Traids");
        p6.setDataNascimento(LocalDate.of(2000, 3, 30));
        p7 = new Pessoa("Renata", "Castro");
        p7.setDataNascimento(LocalDate.of(2010, 1, 18));
        p8 = new Pessoa("Murilo", "Bianch");
        p8.setDataNascimento(LocalDate.of(2015, 7, 11));
        p9 = new Pessoa("Candido", "Silveira");
        p9.setDataNascimento(LocalDate.of(1975, 9, 01));
        p10 = new Pessoa("Camila", "Porto");
        p10.setDataNascimento(LocalDate.of(2014, 5, 25));
    }
        @Test
        void adicionarCollection(){
            p1.adicionarNomes(p1);
            p2.adicionarNomes(p2);
            p3.adicionarNomes(p3);
            p4.adicionarNomes(p4);
            p5.adicionarNomes(p5);
            p6.adicionarNomes(p6);
            p7.adicionarNomes(p7);
            p8.adicionarNomes(p8);
            p9.adicionarNomes(p9);
            p10.adicionarNomes(p10);
        }

}

