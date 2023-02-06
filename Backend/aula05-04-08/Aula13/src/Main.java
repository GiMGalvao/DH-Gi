import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class Main {

    public static final String sqlCreateTable = "DROP TABLE IF EXISTS CONTA; CREATE TABLE CONTA "
            + "("
            + " ID INT PRIMARY KEY, "
            + " NOME varchar(100) NOT NULL, "
            + " NUMERO_CONTA INT NULL, "
            + " SALDO INT NULL "
            + ")";


    private static final String sqlInsert = "INSERT INTO CONTA (ID, NOME, NUMERO_CONTA, SALDO) VALUES (?, ?, ?, ?)";
    private static final String sqlUpdate = "UPDATE CONTA SET SALDO=? WHERE ID=?";



    public static void main(String[] args) throws Exception {

        Conta conta = new Conta(012345, "Gi", 10000);

        Connection connection = null;

        try{
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            insertConta(connection, conta);

            updateSaldoConta(connection, conta, 1000);

            connection.setAutoCommit(false);

            updateSaldoConta(connection, conta, 1500);
            int a =4/0;
            connection.commit();

            connection.setAutoCommit(true);

            consultaConta(connection);


        }catch (Exception e){
            e.printStackTrace();

        } finally {

            if (connection != null){
                connection.close();
            }
        }
        Connection connection1 = getConnection();
        consultaConta(connection1);
    }

    //manda as informações que pega do objeto e manda para os ?? la em cima)
    public static void insertConta (Connection connection, Conta conta) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sqlInsert);
        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, conta.getNome());
        preparedStatement.setInt(3, conta.getNumeroConta());
        preparedStatement.setDouble(4, conta.getSaldoConta());

        preparedStatement.execute();

    }

    public static void updateSaldoConta(Connection connection, Conta conta, int valor) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(sqlUpdate);
        preparedStatement.setDouble(1, conta.getSaldoConta() + valor);
        //saldo /\ e ID \/
        preparedStatement.setInt(2, 1);

        preparedStatement.execute();


    }

    public static void consultaConta(Connection connection) throws SQLException {

        String sqlQuery = "SELECT * FROM CONTA";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()){

            System.out.println(resultSet.getInt(1) + " - " +
                    resultSet.getInt(2) + " - " +
                    resultSet.getString(3) + " - " +
                    resultSet.getInt(4));


        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "GiMGalvao", "");
    }


}