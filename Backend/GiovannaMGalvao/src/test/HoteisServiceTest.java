package test;

import dao.ConfiguracaoJDBC;
import dao.impl.HoteisDaoImpl;
import model.Hoteis;
import org.junit.jupiter.api.Test;
import service.HoteisService;

import static org.junit.jupiter.api.Assertions.*;

class HoteisServiceTest {

    private HoteisService hoteisService = new HoteisService(new HoteisDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarHoteis() {
        Hoteis hoteis1 = new Hoteis("DH", "Rua da DH", 63, "Rio de Janeiro", "RJ", true);
        Hoteis hoteis2 = new Hoteis("GMG", "Rua da GMG", 25, "Belo Horizonte", "BH", false);
        Hoteis hoteis3 = new Hoteis("HOTEL ST RITA", "Rua STA RITA DE CASSIA", 554, "Recife", "PE", true);
        Hoteis hoteis4 = new Hoteis("ID", "Rua Carmina Pasqui", 55, "São Paulo", "SP", true);
        Hoteis hoteis5 = new Hoteis("Hotel Vila Maria", "Rua Alberto Byngton", 853, "São Paulo", "SP", false);

        hoteisService.salvar(hoteis1);
        assertTrue(hoteis1.getId() != null);

        hoteisService.salvar(hoteis2);
        assertTrue(hoteis2.getId() != null);

        hoteisService.salvar(hoteis3);
        assertTrue(hoteis3.getId() != null);

        hoteisService.salvar(hoteis4);
        assertTrue(hoteis4.getId() != null);

        hoteisService.salvar(hoteis5);
        assertTrue(hoteis5.getId() != null);

    }



}