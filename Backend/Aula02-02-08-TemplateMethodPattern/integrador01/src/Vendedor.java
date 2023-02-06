public abstract class Vendedor {

    //validação que usa propriedades de subclasse apenas!!
//Classe abstrata Vendedor - aqui vai o Template Method


        protected String nome;
        protected int vendas = 0;
        protected int pontosPorVenda;


    public Vendedor(String nome) {
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

            if(calcularPontos() < 20){
                return "O " + nome + " esta na Categoria = NOVATO";
            } else if (calcularPontos()<31) {
                return "O " + nome + " esta na Categoria = APRENDIZ";
            } else if (calcularPontos()<41) {
                return "O " + nome + " esta na Categoria = BOM";
            }else if (calcularPontos()>=41) {
                return "O " + nome + " esta na Categoria = MESTRE";

            }
            return mostrarCategoria();
        }
}








