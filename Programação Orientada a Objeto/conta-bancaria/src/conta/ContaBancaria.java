package conta;

public class ContaBancaria {

    private String nomeCliente;
    private int numConta;
    private double saldo;
    private int valorDeposito;
    public ContaBancaria(String nomeCliente, int numConta, double saldo, int valorDeposito) {
        this.nomeCliente = nomeCliente;
        this.numConta = numConta;
        this.saldo = saldo;
        this.valorDeposito = valorDeposito;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getValorDeposito() {
        return valorDeposito;
    }

    public void setValorDeposito(int valorDeposito) {
        this.valorDeposito = valorDeposito;
    }

    public double sacar(){

        if(getSaldo() > 0 ){
            System.out.println("Pode Sacar");

        }else{
            System.out.println("Sem dinheiro na conta");
        }
        return getSaldo();
        //nao pode ficar negativo
    }

    public double depositar(){

    double deposito = getSaldo() + getValorDeposito();
        System.out.println("O Saldo final eh de: " + deposito + " reais.");
        return deposito;

    }


}
