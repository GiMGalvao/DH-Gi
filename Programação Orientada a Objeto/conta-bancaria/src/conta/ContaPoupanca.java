package conta;

public class ContaPoupanca extends ContaBancaria{

    private String diaRendimento;

    public ContaPoupanca(String nomeCliente, int numConta, double saldo, int valorDeposito, String diaRendimento) {
        super(nomeCliente, numConta, saldo, valorDeposito);
        this.diaRendimento = diaRendimento;
    }

    public String getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(String diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    public double calcularNovoSaldo(){

        //taxa = 3%
         double poupanca = (getSaldo() * 0.03) + getSaldo();

        System.out.println(poupanca);
         return poupanca;

        //recebe taxa de rendimento da poupanca e atualiza o saldo;

    }

}
