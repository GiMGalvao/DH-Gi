package checkpoint;

public class Pedido extends VendaLojaPets {

    private String dataPedido;
    private int qtdePeca;
    private String metodoPgto;

    public Pedido(int codigo, String descricaoOuNome, double valor,
                  String dataPedido, int qtdePeca, String metodoPgto){
        super(codigo, descricaoOuNome, valor);
        this.dataPedido = dataPedido;
        this.qtdePeca = qtdePeca;
        this.metodoPgto = metodoPgto;
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


    public double calcularValorTotal(){

        System.out.println("Metodo de Pagamento:" + getMetodoPgto());
          return this.getValor() *qtdePeca;

    }



}
