package integrador;

public abstract class Vendedor {

    //validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method


        protected String nome;
        protected int vendas = 0;
        protected int pontosPorVenda;


    public Vendedor(String nome, int vendas, int pontosPorVenda) {
        this.nome = nome;
        this.vendas = vendas;
        this.pontosPorVenda = pontosPorVenda;
    }

    public void vender(int qtdVendas){
            this.vendas += qtdVendas;
            System.out.println(this.nome + " realizou "+ qtdVendas + " vendas.");
        }

        /*Método que calcula os pontos do Vendedor de acordo com seus aspectos
        a serem considerados*/
        public abstract int calcularPontos();

        /*TEMPLATE METHOD - recebe o total de pontos calculados a partir
        da subclasse e valida cada item para retornar a categoria*/
        public String mostrarCategoria(){
            return "";
        }
}








