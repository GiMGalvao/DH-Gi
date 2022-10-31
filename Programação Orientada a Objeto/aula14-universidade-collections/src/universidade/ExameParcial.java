package universidade;

public class ExameParcial extends Exame {

    private int numUnidades;
    private int numTentativas;

    public ExameParcial(String titulo, double nota, int numUnidades, int numTentativas) {
        super(titulo, nota);
        this.numUnidades = numUnidades;
        this.numTentativas = numTentativas;
    }

    public boolean maxTentativas(){

    return true;

    }

}
