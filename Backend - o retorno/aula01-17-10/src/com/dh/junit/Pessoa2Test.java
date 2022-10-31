package com.dh.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class Pessoa2Test {

    Pessoa2 p1, p2, p3;


    @Test
    void maioridade(){
        p1 = new Pessoa2(20);
        p1.verificaMaioridade(20);

    }




}