package aula13;

public abstract class Conta{

    private double saldo;

    public double depositar (double valor){
        return valor;

    };

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double informarSaldo (){

        return 0;
    }

    public abstract double sacar(double valor);





}