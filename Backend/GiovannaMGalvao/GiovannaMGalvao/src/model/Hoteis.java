package model;

public class Hoteis {

    private Integer id;
    private String nomeDaFilial;
    private String rua;
    private int numero;
    private String cidade;
    private String estado;
    private Boolean ehCincoEstrelas;

    public Hoteis(Integer id, String nomeDaFilial, String rua, int numero, String cidade, String estado, Boolean ehCincoEstrelas) {
        this.id = id;
        this.nomeDaFilial = nomeDaFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.ehCincoEstrelas = ehCincoEstrelas;
    }

    public Hoteis(String nomeDaFilial, String rua, int numero, String cidade, String estado, Boolean ehCincoEstrelas) {
        this.nomeDaFilial = nomeDaFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.ehCincoEstrelas = ehCincoEstrelas;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeDaFilial() {
        return nomeDaFilial;
    }

    public void setNomeDaFilial(String nomeDaFilial) {
        this.nomeDaFilial = nomeDaFilial;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getEhCincoEstrelas() {
        return ehCincoEstrelas;
    }

    public void setEhCincoEstrelas(Boolean ehCincoEstrelas) {
        this.ehCincoEstrelas = ehCincoEstrelas;
    }

    @Override
    public String toString() {
        return "Hoteis{" +
                "id=" + id +
                ", nomeDaFilial='" + nomeDaFilial + '\'' +
                ", rua='" + rua + '\'' +
                ", numero=" + numero +
                ", cidade='" + cidade + '\'' +
                ", estado='" + estado + '\'' +
                ", ehCincoEstrelas=" + ehCincoEstrelas +
                '}';
    }
}
