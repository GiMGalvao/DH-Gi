import java.util.HashMap;
import java.util.Map;

public class ComputadorFactory {

    private static Map<String, Computador> computadorMap = new HashMap<>();

    public Computador getCOmputador(int ram, int hd){
        String id = "id: " + ram + " : " + hd;

        System.out.println(id);

        if(computadorMap.containsKey(id)){
            Computador computador = computadorMap.get(id);
            computador.setContador();

        }

    }


}
