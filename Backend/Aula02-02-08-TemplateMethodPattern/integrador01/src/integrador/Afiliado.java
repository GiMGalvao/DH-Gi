package integrador;

public class Afiliado extends Vendedor {

    public Afiliado(java.lang.String nome, int vendas, int pontosPorVenda) {
        super(nome, vendas, pontosPorVenda);
    }

     @Override
    public int calcularPontos() {
        return this.vendas * pontosPorVenda;
    }

    private class String {
    }
}
