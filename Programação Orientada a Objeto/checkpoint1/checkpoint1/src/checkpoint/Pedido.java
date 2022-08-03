package checkpoint;

public class Pedido {

    private String dataPedido;
    private int qtdePeca;
    private String metodoPgto;

    private Produto produto;


    public Pedido(String dataPedido, int qtdePeca, String metodoPgto, Produto produto) {
        this.dataPedido = dataPedido;
        this.qtdePeca = qtdePeca;
        this.metodoPgto = metodoPgto;
        this.produto = produto;
    }

    public Pedido(String dataPedido, int qtdePeca, String metodoPgto, int i, int i1, int i2) {
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public int getQtdePeca() {
        return qtdePeca;
    }

    public void setQtdePeca(int qtdePeca) {
        this.qtdePeca = qtdePeca;
    }

    public String getMetodoPgto() {
        return metodoPgto;
    }

    public void setMetodoPgto(String metodoPgto) {
        this.metodoPgto = metodoPgto;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double calcularValorTotal(){

        double total = getQtdePeca() * produto.getValor();

        return total;

    }



}
