public class Arvore {

    private int id;
    private double altura;
    private double largura;
    private String cor;
    private String tipoArvore;

    public Arvore(double altura, double largura, String cor, String tipoArvore) {
        this.altura = altura;
        this.largura = largura;
        this.cor = cor;
        this.tipoArvore = tipoArvore;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipoArvore() {
        return tipoArvore;
    }

    public void setTipoArvore(String tipoArvore) {
        this.tipoArvore = tipoArvore;
    }
}
