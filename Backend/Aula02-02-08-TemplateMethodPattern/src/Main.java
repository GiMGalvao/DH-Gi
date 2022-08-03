public class Main {
    public static void main(String[] args) {

        Efetivo efetivo = new Efetivo("Gigi", "MG", 123456, 200.0);

        Contratado contratado = new Contratado("Gigiw", "MGw", 1234563, 5200.0);

        efetivo.pagamentoSalario();
        contratado.pagamentoSalario();
    }
}