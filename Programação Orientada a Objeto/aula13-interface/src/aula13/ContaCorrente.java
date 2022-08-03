package aula13;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, double valorPermitido) {
        super(saldo);
        this.valorPermitido = valorPermitido;
    }

    private double valorPermitido;

    public double getValorPermitido() {
        return valorPermitido;
    }

    public void setValorPermitido(double valorPermitido) {
        this.valorPermitido = valorPermitido;
    }

    public double sacar (double valor){

        return valor;
    }

    public double imposto(double porc){

        return 0;
    };

}