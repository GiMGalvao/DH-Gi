package com.dh.hoteis.model;

public class Filial {
        private int id;
        private String nomeDaFilial;
        private String rua;
        private String numero;
        private String cidade;
        private String estado;
        private boolean ehCincoEstrelas;


    public Filial(int id, String nomeDaFilial, String rua, String numero, String cidade, String estado, boolean ehCincoEstrelas) {
        this.id = id;
        this.nomeDaFilial = nomeDaFilial;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.ehCincoEstrelas = ehCincoEstrelas;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
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

    public boolean isEhCincoEstrelas() {
        return ehCincoEstrelas;
    }

    public void setEhCincoEstrelas(boolean ehCincoEstrelas) {
        this.ehCincoEstrelas = ehCincoEstrelas;
    }

    @Override
        public String toString() {
            return "Filial{" +
                    "id=" + id +
                    ", nomeFilial='" + nomeDaFilial + '\'' +
                    ", rua='" + rua + '\'' +
                    ", numero='" + numero + '\'' +
                    ", cidade='" + cidade + '\'' +
                    ", estado='" + estado + '\'' +
                    ", cincoEstrelas=" + ehCincoEstrelas +
                    '}';
        }
}

