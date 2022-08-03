package checkpoint;

public class Produto {
    private boolean apto;
    private String marca;
    private int anoVencimento;
    private String tipo;

    private double valor;

    public Produto(boolean apto, String marca, int anoVencimento, String tipo, double valor) {
        this.apto = apto;
        this.marca = marca;
        this.anoVencimento = anoVencimento;
        this.tipo = tipo;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }





