package medicamentos.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//fazer a conexão
public class ConfiguracaoJDBC {

    private String jdbcDriver;
    private String dburl;
    private String nomeUsuario;
    private String senha;

    public ConfiguracaoJDBC(String jdbcDriver, String dburl, String nomeUsuario, String senha) {
        this.jdbcDriver = jdbcDriver;
        this.dburl = dburl;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
    }

    public ConfiguracaoJDBC() {
        this.jdbcDriver = jdbcDriver;
        this.dburl = "jdbc:h2:mem:medicamentos;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'create.sql'";;
        this.nomeUsuario = "GiMGalvao";
        this.senha = "";
    }

    public Connection conectarBD() {
        Connection connection = null;

        try {
            Class.forName(jdbcDriver).newInstance();
            connection = DriverManager.getConnection(dburl, nomeUsuario, senha);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return connection;


    }
}
