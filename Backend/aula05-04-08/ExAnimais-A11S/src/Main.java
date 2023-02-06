import lombok.extern.slf4j.Slf4j;

import java.sql.*;

public class Main {



    //tabela
    public static final String sqlCreateTable = "DROP TABLE IF EXISTS Animais; CREATE TABLE Animais"
            + "("
            + "Id INT PRIMARY KEY, "
            + " Tipo VARCHAR(20), "
            + "Nome VARCHAR (40) "
            + ")";

    private static final String sqlInsert1 = "INSERT INTO Animais (Id, Tipo, Nome) VALUES (1, 'Cachorro', 'Meg')";
    private static final String sqlInsert2 = "INSERT INTO Animais (Id, Tipo, Nome) VALUES (2, 'Gato', 'Chiquinho')";
    private static final String sqlInsert3 = "INSERT INTO Animais (Id, Tipo, Nome) VALUES (3, 'Cachorro', 'Meg')";
    private static final String sqlInsert4 = "INSERT INTO Animais (Id, Tipo, Nome) VALUES (4, 'Cobra', 'Snake')";
    private static final String sqlInsert5 = "INSERT INTO Animais (Id, Tipo, Nome) VALUES (5, 'Cavalo', 'Pegasus')";

    private static final String sqlDelete = "DELETE FROM Animais WHERE Id = 3";

    //Statement
    public static void main(String[] args) throws Exception {

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);

            statement.execute(sqlInsert1);
            statement.execute(sqlInsert2);
            statement.execute(sqlInsert3);
            statement.execute(sqlInsert4);
            statement.execute(sqlInsert5);

            showAnimais(connection);

            statement.execute(sqlDelete);

            showAnimais(connection);


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.close();

            }
        }
    }

    public static void showAnimais(Connection connection) throws SQLException {

        String sqlQuery = "SELECT * FROM Animais WHERE Tipo = 'Cachorro'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));

        }


    }


    //    Connection
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "GiMGalvao", "");

    }
}
