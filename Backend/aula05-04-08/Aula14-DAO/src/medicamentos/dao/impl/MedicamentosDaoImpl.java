package medicamentos.dao.impl;

import medicamentos.dao.ConfiguracaoJDBC;
import medicamentos.dao.IDao;
import medicamentos.model.Medicamentos;
import org.apache.log4j;

import java.util.logging.Logger;

public class MedicamentosDaoImpl implements IDao<Medicamentos> {
    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(String.valueOf(MedicamentosDaoImpl.class));



    @Override
    public Medicamentos saltar(Medicamentos medicamentos) {
        return null;
    }
}
