package com.dh.hoteis.dao.Impl;

import com.dh.hoteis.dao.configuracao.ConfigJDBC;
import com.dh.hoteis.dao.IFilialDao;
import com.dh.hoteis.model.Filial;
import org.apache.log4j.Logger;

import java.sql.*;

public class FilialDaoH2 implements IFilialDao<Filial> {
    private ConfigJDBC configuracaoJDBC;
    private Logger logger = Logger.getLogger(FilialDaoH2.class);

    public FilialDaoH2() {
        this.configuracaoJDBC = new ConfigJDBC();

    }

    @Override
    public Filial save(Filial filial) {
        Connection connection = configuracaoJDBC.conectarComBanco();
        logger.info("Conexão com o banco");
        PreparedStatement statement = null;
        String sqlInsert = "INSERT INTO FILIAL(nome, rua, numero, cidade, estado, ehCincoEstrelas) VALUES(?,?,?,?,?,?)";
        try {
            statement = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, filial.getNomeFilial());
            statement.setString(2, filial.getRua());
            statement.setString(3, filial.getNumero());
            statement.setString(4, filial.getCidade());
            statement.setString(5, filial.getEstado());
            statement.setBoolean(6, filial.isEhCincoEstrelas());
            statement.execute();
            logger.info("Filial " + filial.getNomeFilial() + " está no banco");

            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()){
                filial.setId(keys.getInt(1));
            }
            logger.debug("Filial " + filial.getNomeFilial() + " está cadastrada!");

        }catch (SQLException exception){
            logger.error(exception.getMessage());
        }
        return filial;
    }


}
