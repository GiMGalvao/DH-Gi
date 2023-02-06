import java.sql.*;


public class Main {

    //3º
    public static final String sqlCreateTable = "DROP TABLE IF EXISTS Figura; CREATE TABLE Figura"
            +"("
            +" Id INT PRIMARY KEY, "
            +" Tipo VARCHAR(30) NOT NULL, "
            +" Cor VARCHAR(30) NOT NULL"
            +")";


    private static final String sqlInsert1 = "INSERT INTO Figura (Id, Tipo, Cor) VALUES (1, 'Circulo', 'Vermelho')";
    private static final String sqlInsert2 = "INSERT INTO Figura (Id, Tipo, Cor) VALUES (2, 'Circulo', 'Rosa')";
    private static final String sqlInsert3 = "INSERT INTO Figura (Id, Tipo, Cor) VALUES (3, 'Quadrado', 'Verde')";
    private static final String sqlInsert4 = "INSERT INTO Figura (Id, Tipo, Cor) VALUES (4, 'Quadrado', 'Vermelho')";
    private static final String sqlInsert5 = "INSERT INTO Figura (Id, Tipo, Cor) VALUES (5, 'Quadrado', 'Azul')";




//2º

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

        showFiguras(connection);

//
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }

    public static void showFiguras(Connection connection) throws SQLException {

        String sqlQuery =   "SELECT * FROM Figura WHERE Cor = 'Vermelho' AND Tipo = 'Circulo'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while(resultSet.next()){
            System.out.println(resultSet.getInt(1) + " - " + resultSet.getString(2) + " - " + resultSet.getString(3));
        }

    }
        //1º
        public static Connection getConnection() throws Exception{
            Class.forName("org.h2.Driver").newInstance();
            return DriverManager.getConnection("jdbc:h2:~/test", "GiMGalvao", "");

        }


}

