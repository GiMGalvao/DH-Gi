package checkpoint;

public class Estoque{
    private int qtdeMinima;
    private int qtdeAtual;

    private int qtdeNoPedido;



    public Estoque ( int qtdeMinima, int qtdeAtual, int qtdeNoPedido) {
        this.qtdeMinima = qtdeMinima;
        this.qtdeAtual = qtdeAtual;
        this.qtdeNoPedido = qtdeNoPedido;
    }



    public int getQtdeMinima() {
        return qtdeMinima;
    }

    public void setQtdeMinima(int qtdeMinima) {
        this.qtdeMinima = qtdeMinima;
    }

    public int getQtdeAtual() {
        return qtdeAtual;
    }

    public void setQtdeAtual(int qtdeAtual) {
        this.qtdeAtual = qtdeAtual;
    }

    public int calcularEstoque()
    {
        return qtdeAtual - qtdeNoPedido;

    }


}
