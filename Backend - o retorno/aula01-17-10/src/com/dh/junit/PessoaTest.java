package com.dh.junit;

import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class PessoaTest {

    Pessoa p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;

    List<String> colecao = new ArrayList<>();

    @BeforeEach
    void doBefore(){
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setIdade(LocalDate.of(2016,3,23));
        p2 = new Pessoa("Ana", "Musk");
        p2.setIdade(LocalDate.of(1966,1,03));
        p3 = new Pessoa("Joe", "Morello");
        p3.setIdade(LocalDate.of(2010, 12, 04));
        p4 = new Pessoa("Rob", "Johnson");
        p4.setIdade(LocalDate.of(1976, 10, 25));
        p5 = new Pessoa("Ted", "Trujillo");
        p5.setIdade(LocalDate.of(2014, 5, 14));
        p6 = new Pessoa("Robert", "Traids");
        p6.setIdade(LocalDate.of(2000, 3, 30));
        p7 = new Pessoa("Renata", "Castro");
        p7.setIdade(LocalDate.of(2010, 1, 18));
        p8 = new Pessoa("Murilo", "Bianch");
        p8.setIdade(LocalDate.of(2015, 7, 11));
        p9 = new Pessoa("Candido", "Silveira");
        p9.setIdade(LocalDate.of(1975, 9, 01));
        p10 = new Pessoa("Camila", "Porto");
        p10.setIdade(LocalDate.of(2014, 5, 25));



    }

//    @BeforeAll
//    static void doBeforeAll(){
//        System.out.println("Esta dentro do All");
//    }
//
//    @BeforeEach
//    void doBefore(){
//        System.out.println("Dentro do Before each");
//    }
//
//    @Test
//    void adicionarColecao(){
//        System.out.println("teste1");
//    }
//
//
//    @Test
//    void adicionarColecao2(){
//        System.out.println("teste2");
//    }
//
//    @Test
//    @Disabled("Teste 3 nao foi executado")
//    void adicionarColecao3(){
//        System.out.println("teste3");
//    }
//
//    @Test
//    void adicionarColecao4(){
//        System.out.println("teste4");
//    }
//
//    @AfterEach
//    void doAfter(){
//        System.out.println("esta dentro do after each");
//    }
//
//    @AfterAll
//    static void doAfterAll(){
//        System.out.println("Esta dentro do after all");
//    }
//

}