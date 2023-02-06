package com.dh.clinicaodontologica.dao.impl;

import com.dh.clinicaodontologica.dao.ConfiguracaoJDBC;
import com.dh.clinicaodontologica.dao.IDao;
import com.dh.clinicaodontologica.model.Paciente;

public class PacienteDaoImpl implements IDao<Paciente> {

    private ConfiguracaoJDBC configuracaoJDBC;

    public PacienteDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Paciente adiconar(Paciente paciente) {
        return null;
    }
}
}
