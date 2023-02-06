package com.dh.hoteis.dao.impl;

import com.dh.hoteis.dao.IFilialDao;
import com.dh.hoteis.dao.configuracao.ConfiguracaoJDBC;
import com.dh.hoteis.model.Filial;

import java.sql.*;
import org.apache.log4j.Logger;

public class FilialDaoH2 implements IFilialDao<Filial> {

    private static ConfiguracaoJDBC configuracaoJDBC;

    private static Logger logger = Logger.getLogger(String.valueOf(FilialDaoH2.class));

    private Connection getConnection() throws SQLException, ClassNotFoundException {
        configuracaoJDBC = new ConfiguracaoJDBC("org.h2.Driver","jdbc:h2:~/filial;AUTO_SERVER=TRUE;INIT=RUNSCRIPT FROM 'create.sql'","sa","");
        return configuracaoJDBC.getConnection();
    }



    public Filial save(Filial filial) throws SQLException, ClassNotFoundException {
        Connection connection = configuracaoJDBC.getConnection();
        logger.info("Conectado");
        PreparedStatement statement = null;
        String query = "INSERT INTO FILIAL(NOME, RUA, NUMERO, CIDADE, ESTADO, ehCincoEstrela) VALUES(?,?,?,?,?,?)";
        try {
            try {
                Connection conexao = this.getConnection();
                Statement stmt = conexao.createStatement();
                stmt.execute(query, 1);
                ResultSet keys = stmt.getGeneratedKeys();
                if (keys.next()) {
                    filial.setId(keys.getInt(1));
                }

                stmt.close();
            } catch (SQLException var6) {
                var6.printStackTrace();
            }
            logger.info("Filial no banco: OK");

            ResultSet keys = statement.getGeneratedKeys();
            if (keys.next()){
                filial.setId(keys.getInt(1));
            }
            logger.debug("Filial " + filial + "adicionada!" );

        }catch (SQLException exception){
            logger.error(exception.getMessage());
        }
        return filial;
    }
}
