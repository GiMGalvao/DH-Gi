package universidade;

public abstract class Exame {

    private String titulo;
    private double nota;

    public Exame(String titulo, double nota) {
        this.titulo = titulo;
        this.nota = nota;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public boolean aprovado() {


        if (this.getNota() >= 4) {
            return true;

        } else {

            return false;
        }

    }

    public String aprovadoReprovado() {
        if (aprovado() == true) {
            return "AProvado";
        } else {
            return "Reprovado";
        }

    }

}