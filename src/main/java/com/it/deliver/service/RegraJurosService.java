package com.it.deliver.service;

import com.it.deliver.bean.RegraJuros;
import com.it.deliver.dao.RegraJurosDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegraJurosService {

    @Autowired
    private RegraJurosDAO regraJurosDAO;

    public RegraJuros insere(RegraJuros regraJuros){
        return regraJurosDAO.save(regraJuros);
    }

    public RegraJuros findByDays(Long dias){
        if (dias <= 3) {
            return regraJurosDAO.findByRegraJurosAteTresDias();
        } else if (dias > 3 && dias <= 5) {
            return regraJurosDAO.findByRegraJurosMaior3MenorIgual5();
        } else if (dias > 5) {
            return regraJurosDAO.findByRegraJurosMaior5Dias();
        }
        return null;
    }


}
