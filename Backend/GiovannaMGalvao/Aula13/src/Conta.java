public class Conta {

    private Long Id;
    private int numeroConta;
    private String nome;
    private double saldoConta;

    public Conta(int numeroConta, String nome, double saldoConta) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldoConta = saldoConta;
    }

    public Long getId() {
        return Id;
    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }
}
