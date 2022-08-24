package dao.impl;

import dao.ConfiguracaoJDBC;
import dao.IDao;
import model.Hoteis;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class HoteisDaoImpl implements IDao <Hoteis> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(HoteisDaoImpl.class);

    public HoteisDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Hoteis salvar(Hoteis hoteis) {
        log.debug("Salvando filiais de hoteis: " + hoteis.toString());

        Connection connection = configuracaoJDBC.conectarBD();
        Statement statement = null;
        String query = String.format("INSERT INTO hoteis(nomeDaFilial,rua, numero, cidade, estado, ehCincoEstrelas) " +
                        "VALUES('%s','%s','%s','%s','%s','%s')",
                hoteis.getNomeDaFilial(), hoteis.getRua(),hoteis.getNumero(), hoteis.getCidade(),
                hoteis.getEstado(), hoteis.getEhCincoEstrelas());
//
//
        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next())
                hoteis.setId(resultSet.getInt(1));

            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return hoteis;
    }
}
