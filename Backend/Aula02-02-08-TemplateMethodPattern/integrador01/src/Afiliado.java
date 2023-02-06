public class Afiliado extends Vendedor {

    public Afiliado(java.lang.String nome, int pontosPorVenda) {
        super(nome);
        super.nome = nome;
        super.pontosPorVenda = 15;
    }

     @Override
    public int calcularPontos() {
        return this.vendas * pontosPorVenda;
    }


}
