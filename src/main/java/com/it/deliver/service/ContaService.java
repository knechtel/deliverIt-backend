package com.it.deliver.service;

import com.it.deliver.bean.Conta;
import com.it.deliver.dao.ContaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContaService {
    @Autowired
    private ContaDAO contaDAO;

    public Conta insere(Conta conta) {
        return contaDAO.save(conta);
    }

    public Conta byDias(Long dias,Integer id) {
        if (dias <= 3) {
            return contaDAO.findByContaAtrazoAte3Dias(id);
        } else if (dias > 3 && dias < 5) {
            return contaDAO.findByContaAtrazoMaior3Menor5Dias(id);
        } else if (dias > 5) {
            return contaDAO.findByContaAtrazoMaior5Dias(id);
        }
        return null;
    }

    public Double getValorCorrigido(Long dias,Integer id){
        Conta c  = byDias(dias,id);
        Double vlrOriginal = c.getValorOriginal();
        Double vlrMulta = c.getValorOriginal()*c.getRegraJuros().getMulta();
        Double vlrJuroDias = (vlrOriginal*c.getRegraJuros().getPorcentagemJurosPorDia())*dias;
        Double vlrCorrigido = vlrOriginal+vlrJuroDias+vlrMulta;
        return vlrCorrigido;
    }

    public Conta findById(Integer id){
        return contaDAO.findById(id).orElse(null);
    }
    public List<Conta> findAll(){
        return (List<Conta>) contaDAO.findAll();
    }
}
