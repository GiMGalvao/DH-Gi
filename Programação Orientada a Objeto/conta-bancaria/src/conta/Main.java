package conta;

public class Main {
    public static void main(String[] args) {

        ContaBancaria conta01 = new ContaBancaria("Giovanna", 1506, 50, 0);
        ContaPoupanca conta02 = new ContaPoupanca("Ana", 1500, 48, 0, "3");
        conta01.sacar();
        conta01.depositar();
        conta02.calcularNovoSaldo();




    }
}