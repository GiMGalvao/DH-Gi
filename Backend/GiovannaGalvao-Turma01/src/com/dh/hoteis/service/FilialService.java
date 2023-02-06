package com.dh.hoteis.service;

import com.dh.hoteis.dao.Impl.FilialDaoH2;
import com.dh.hoteis.model.Filial;

public class FilialService {
    FilialDaoH2 filialDao;

    public FilialService() {
        this.filialDao = new FilialDaoH2();
    }

    public Filial save(Filial filial){
        return filialDao.save(filial);
    }
}
