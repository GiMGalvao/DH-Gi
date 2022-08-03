package checkpoint;

public class Produto {
    private boolean apto;
    private String marca;
    private int anoVencimento;
    private int quantidade;
    private String tipo;

    public Produto(String marca, int venc, int quant, String tipo)
    {
        this.marca = marca;
        this.anoVencimento = venc;
        this.quantidade = quant;
        this.tipo = tipo;
    }

    public Produto aptoParaVenda()
    {
        if(this.anoVencimento < 2022 && (this.quantidade > 1))
        {
            this.apto = true;
            System.out.println("O produto " + produto.getNome() + " está apto para Venda");
        }
        else
        {
            this.apto = false;
            System.out.println("O produto " + produto.getNome() + " está apto para Venda")
        }

        return aptoParaVenda();
    }




}

