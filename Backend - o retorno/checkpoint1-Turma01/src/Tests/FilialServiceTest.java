package Tests;

import com.dh.hoteis.model.Filial;
import com.dh.hoteis.service.FilialService;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

class FilialServiceTest {

    FilialService service = new FilialService();

    @Test
    void save() throws SQLException, ClassNotFoundException {
        Filial filial1 = new Filial(1, "Filial 1", "RuaA", "101", "Cidade AB", "Estado I", true);
        Filial filial2 = new Filial (2, "Filial 2", "RuaB", "202", "Cidade DE", "Estado II", false);
        Filial filial3 = new Filial (3, "Filial 3", "RuaC", "303", "Cidade FG", "Estado III", true);
        Filial filial4 = new Filial (4, "Filial 4", "RuaD", "404", "Cidade HI", "Estado IV", false);
        Filial filial5 = new Filial (5, "Filial 5", "RuaE", "505", "Cidade JK", "Estado V", true);


        Filial filialResult1 = service.save(filial1);
        Filial filialResult2 = service.save(filial2);
        Filial filialResult3 = service.save(filial3);
        Filial filialResult4 = service.save(filial4);
        Filial filialResult5 = service.save(filial5);

        assertEquals(filial1.getNomeDaFilial(), filialResult1.getNomeDaFilial());
        assertEquals(filial2.getEstado(), filialResult2.getEstado());
        assertTrue(filialResult3.getId() != filialResult4.getId());
        assertTrue(filialResult4.getId() != filialResult5.getId());
        assertTrue(filial1.isEhCincoEstrelas());
        assertTrue(filialResult1.isEhCincoEstrelas());
    }


}