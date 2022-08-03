public class Contratado extends Funcionario {

    private double valorHora;
    private int horas;

    public Contratado(String nome, String sobrenome, String numConta, double valorHora, int horas) {
        super(nome, sobrenome, numConta);
        this.valorHora = valorHora;
        this.horas = horas;
    }

    @Override
    public double calcularSaldo() {
        return valorHora * horas;
    }

    @Override
    public void imprimirRecibo(double quantia) {
        System.out.println("Recibo Digital - Contratado - Valor: " + quantia);
    }

    @Override
    public void depositar(double quantia) {
        System.out.println("Depositado " + quantia + "na conta de " + super.getNome());

    }
}
