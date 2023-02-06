import com.dh.hoteis.model.Filial;
import com.dh.hoteis.service.FilialService;

public class Main {
    public static void main(String[] args) {

        FilialService filialService = new FilialService();

        Filial filial = new Filial("filial1", "rua", "1", "cidade1", "estado1", true);
        filialService.save(filial);

    }
}