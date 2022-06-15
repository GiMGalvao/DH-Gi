package conta;

public class ContaEspecial extends ContaBancaria{

    private double limite;

    public ContaEspecial(String nomeCliente, int numConta, double saldo, int valorDeposito, double limite) {
        super(nomeCliente, numConta, saldo, valorDeposito);
        this.limite = limite;
    }

    //sobrescrever com nova logica
    public double sacar(){
    return sacar();
        //nao pode ficar negativo
    }


}
