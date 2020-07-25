package com.it.deliver.bean;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class RegraJuros implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer dias;
    private Double multa;
    private Double porcentagemJurosPorDia;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Double getMulta() {
        return multa;
    }

    public void setMulta(Double multa) {
        this.multa = multa;
    }

    public Double getPorcentagemJurosPorDia() {
        return porcentagemJurosPorDia;
    }

    public void setPorcentagemJurosPorDia(Double porcentagemJurosPorDia) {
        this.porcentagemJurosPorDia = porcentagemJurosPorDia;
    }


}
