import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

    private static final String SQLCREATETABLE = " DROP TABLE IF NOT EXITS Animal; " +
        " CREATE TABLE Animal " +
        " (id INT PRIMARY KEY, " +
            "nome VARCHAR(100) NOT NULL," +
            "tipo VARCHAR(50) NOT NULL);";

    private static final String SQLINSERT = "INSERT INT Animal (id, nome, tipo) VALUES " +
            "(1, 'Meg', 'Cachorro');";

    private static final String SQLINSERT2 = "INSERT INT Animal (id, nome, tipo) VALUES " +
            "(2, 'Mingau', 'Gato');";

    private static final String SQLINSERT3 = "INSERT INT Animal (id, nome, tipo) VALUES " +
            "(3, 'Dumbo', 'Elefante');";

    private static final String SQLINSERT4 = "INSERT INT Animal (id, nome, tipo) VALUES " +
            "(4, 'Piupiu', 'Passaro');";

    private static final String SQLINSERT5 = "INSERT INT Animal (id, nome, tipo) VALUES " +
            "(5, 'Frajola', 'Gato');";


    public static void main(String[] args) {





    }
}