package universidade;

public class Main {
    public static void main(String[] args) {


        Exame exame01 = new Exame("Portugues", 2) {
        };

        System.out.println("Voce foi " + exame01.aprovadoReprovado() + " na materia de " + exame01.getTitulo());


    }

}