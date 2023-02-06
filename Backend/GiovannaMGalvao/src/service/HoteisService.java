package service;

import dao.IDao;
import model.Hoteis;

public class HoteisService {

          private IDao<Hoteis> hoteisIDao;

        public HoteisService(IDao<Hoteis> hoteisIDao) {
            this.hoteisIDao = hoteisIDao;
        }

        public Hoteis salvar(Hoteis hoteis) {
            return hoteisIDao.salvar(hoteis);
        }

}



