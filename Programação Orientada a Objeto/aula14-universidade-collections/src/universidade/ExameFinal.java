package universidade;

public class ExameFinal extends Exame implements Comparable{

    private double notaOral;
    private String descricaoMateria;

    public ExameFinal(String titulo, double nota, double notaOral, String descricaoMateria) {
        super(titulo, nota);
        this.notaOral = notaOral;
        this.descricaoMateria = descricaoMateria;
    }
}
