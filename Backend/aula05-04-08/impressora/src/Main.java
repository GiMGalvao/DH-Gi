import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) {
        Impressora imp1 = new Impressora("Epson",
                "USB");

        Impressora imp2 = new Impressora("HP",
                "Sem fio");

       imp1.imprimir("Olá");
       imp2.imprimir("Nao tem papel");

        System.out.println(imp1.getFolhas());
        }
}