package checkpoint;

public class Produto extends VendaLojaPets {
    private boolean apto;
    private String marca;
    private int anoVencimento;
    private int quantidade;
    private String tipo;

    public Produto (int codigo, String descricaoOuNome,
                    double valor, String marca, int venc, int qtde, String tipo){
        super(codigo, descricaoOuNome, valor);
        this.marca = marca;
        this.anoVencimento = venc;
        this.quantidade = qtde;
        this.tipo = tipo;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoVencimento() {
        return anoVencimento;
    }

    public void setAnoVencimento(int anoVencimento) {
        this.anoVencimento = anoVencimento;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean aptoParaVenda() {

        if(this.anoVencimento >= 2022 && (this.quantidade > 1))
        {
          this.apto = true;
            System.out.println("O produto " + getDescricaoOuNome() + " esta disponivel para venda");
//
        }else{
            this.apto = false;
            System.out.println("O produto " + getDescricaoOuNome() + " nao esta disponivel para venda");
//

        }

        return this.apto;
    }

    public String cadastrarProduto(){

        return ("Codigo: " + getCodigo() + "; Produto: " + getDescricaoOuNome() + "; Valor: " + getValor() + "; Marca: " + getMarca() +
                "; Ano de Vencimento: " + getAnoVencimento() + "; Quantidade em estoque: " + getQuantidade() + "; Tipo: " + getTipo());

    }

}




