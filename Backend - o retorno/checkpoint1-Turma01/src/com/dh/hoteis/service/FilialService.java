package com.dh.hoteis.service;

import com.dh.hoteis.dao.IFilialDao;
import com.dh.hoteis.dao.impl.FilialDaoH2;
import com.dh.hoteis.model.Filial;

import java.sql.SQLException;

public class FilialService {

    FilialDaoH2 filialDao;

    public FilialService() {
        this.filialDao = new FilialDaoH2();
    }

    public Filial save(Filial filial) throws SQLException, ClassNotFoundException {
        return IFilialDao.save(filial);
    }
}


