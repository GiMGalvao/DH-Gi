package checkpoint;

public class VendaLojaPets {

    private int codigo;
    private String descricaoOuNome;
    private double valor;

    public VendaLojaPets(int codigo, String descricaoOuNome, double valor) {
        this.codigo = codigo;
        this.descricaoOuNome = descricaoOuNome;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricaoOuNome() {
        return descricaoOuNome;
    }

    public void setDescricaoOuNome(String descricaoOuNome) {
        this.descricaoOuNome = descricaoOuNome;
    }

    public double getValor() {
        return valor;
    }

    public int setValor() {
        this.valor = valor;
        return 0;
    }



}
