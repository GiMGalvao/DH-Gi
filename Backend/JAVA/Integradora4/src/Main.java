import java.sql.*;
import java.util.logging.Logger;

public class Main {

    private static final Logger logger = Logger.getLogger(String.valueOf(Main.class));

    public static String sqlCreateTable = "DROP TABLE IF EXISTS Funcionarios; CREATE TABLE Funcionarios"
            + "("
            + " Id INT PRIMARY KEY, "
            + " Nome VARCHAR(20), "
            + " Sobrenome VARCHAR(30), "
            + " Idade CHAR(2), "
            + " Sexo CHAR(2) "
            + ")";

    private static final String sqlInsert1 = "INSERT INTO Funcionarios (Id, Nome, Sobrenome, Idade, Sexo) VALUES (1, 'Giovanna', 'Munoz', 28, 'F')";
    private static final String sqlInsert2 = "INSERT INTO Funcionarios (Id, Nome, Sobrenome, Idade, Sexo) VALUES (2, 'Cristiane', 'Rodrigues', 28, 'F')";
    private static final String sqlInsert3 = "INSERT INTO Funcionarios (Id, Nome, Sobrenome, Idade, Sexo) VALUES (2, 'Bruno', 'Munoz', 30, 'M')";

    private static final String sqlUpdate = "UPDATE Funcionarios SET Id = 3 WHERE Nome = 'Bruno'";

    public static void main(String[] args) throws Exception{

    Connection connection = null;

    try{
        connection = getConnection();
        Statement statement = connection.createStatement();

        statement.execute(sqlCreateTable);

        statement.execute(sqlInsert1);
        statement.execute(sqlInsert2);
        statement.execute(sqlInsert3);

        showFuncionarios(connection);

        statement.execute(sqlUpdate);

        showFuncionarios(connection);


    } catch (Exception e) {

        logger.info("ID repetido");

    }finally {
        if(connection!= null){
          connection.close();
        }
    }

    }

    public static void showFuncionarios(Connection connection) throws SQLException {

        String sqlQuery = "SELECT * FROM Funcionarios";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            logger.info(resultSet.getInt(1) +
                    " - " + resultSet.getString(2) +
                    " - " + resultSet.getString(3) +
                    " - " + resultSet.getString(4) +
                    " - " + resultSet.getString(5));


        }


    }

    public static Connection getConnection() throws Exception {
    Class.forName("org.h2.Driver").newInstance();
    return DriverManager.getConnection("jdbc:h2:~/test", "GiMGalvao", "");
    }

}