package pattern;


import org.junit.jupiter.api.Test;

class FuncionarioTest {

    @Test
    void executandoContratado(){
        Contratado contratado = new Contratado("Giovanna", "Galvao", "45654", "poupanca", 100,350);
    contratado.pagamentoSalario();
    }

    @Test
    void executandoEfetivo(){
        Efetivo efetivo = new Efetivo("Patrick", "Galvao", "45655", "corrente", 10000,4000, 3000);
        efetivo.pagamentoSalario();
    }

}