import model.Leao;
import model.Tigre;

public class Main {
    public static void main(String[] args) {
        Leao leao = new Leao("Simba",18,true);
        Tigre tigre = new Tigre("Pantro",5);

        leao.correr();
        try {
            leao.eMaiorQue10();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        tigre.correr();
        try {
            tigre.eMaiorQue10();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
