package universidade;

public class Aluno {

    private String nomeSobrenome;
    private int matricula;

    public Aluno(String nomeSobrenome, int matricula) {
        this.nomeSobrenome = nomeSobrenome;
        this.matricula = matricula;
    }

    public String getNomeSobrenome() {
        return nomeSobrenome;
    }

    public void setNomeSobrenome(String nomeSobrenome) {
        this.nomeSobrenome = nomeSobrenome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}
