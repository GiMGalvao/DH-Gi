package com.dh.hoteis.tests;

import com.dh.hoteis.model.Filial;
import com.dh.hoteis.service.FilialService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {


    FilialService service = new FilialService();

    @Test
    void save() {
        Filial filial1 = new Filial("OneHotel", "RuaA", "101", "Cidade AB", "Estado I", true);
        Filial filial2 = new Filial ("TwoHotel", "RuaB", "202", "Cidade DE", "Estado II", false);
        Filial filial3 = new Filial ( "ThreeHotel", "RuaC", "303", "Cidade FG", "Estado III", true);
        Filial filial4 = new Filial ( "FourHotel", "RuaD", "404", "Cidade HI", "Estado IV", false);
        Filial filial5 = new Filial ( "FiveHotel", "RuaE", "505", "Cidade JK", "Estado V", true);

        Filial filialResult1 = service.save(filial1);
        Filial filialResult2 = service.save(filial2);
        Filial filialResult3 = service.save(filial3);
        Filial filialResult4 = service.save(filial4);
        Filial filialResult5 = service.save(filial5);

        assertEquals(filial1.getNomeFilial(), filialResult1.getNomeFilial());
        assertEquals(filial2.getEstado(), filialResult2.getEstado());
        assertTrue(filialResult3.getId() != filialResult4.getId());
        assertTrue(filialResult4.getId() != filialResult5.getId());
        assertTrue(filial1.isEhCincoEstrelas());
        assertTrue(filialResult1.isEhCincoEstrelas());
    }

}