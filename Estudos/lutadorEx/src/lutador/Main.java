package lutador;

public class Main {


    public static void main(String[] args)
    {

        LutadorCadastro lutador1 = new LutadorCadastro("Pretty Boy", "Franca", 31,
                1.75, 68.9,  11, 2, 1);

        LutadorCadastro lutador2 = new LutadorCadastro("Putscript", "Brasil", 29,
                1.68, 57.8,  14, 2, 3);

        LutadorCadastro lutador3 = new LutadorCadastro("Snapshadow", "EUA", 35,
                1.65, 80.9,  12, 2, 1);

        LutadorCadastro lutador4 = new LutadorCadastro("Dead code", "Australia", 28,
                1.93, 81.6,  13, 0, 2);

        LutadorCadastro lutador5 = new LutadorCadastro("Nerdaard", "EUA", 30,
                1.81, 105.7,  12, 2, 4);

        lutador1.status();
        lutador2.status();
        lutador3.status();
        lutador4.status();
        lutador5.status();



    }
}