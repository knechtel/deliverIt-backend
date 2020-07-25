package com.it.deliver.dto;

import com.it.deliver.bean.RegraJuros;

public class RegraJurosDto {
    private Integer id;
    private Integer dias;
    private  Double multa;
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

    public Double getPorcentagemJuros() {
        return porcentagemJurosPorDia;
    }

    public void setPorcentagemJurosPorDia(Double porcentagemJurosPorDia) {
        this.porcentagemJurosPorDia = porcentagemJurosPorDia;
    }



    public RegraJuros build(RegraJurosDto regraJuroDto){
        RegraJuros r = new RegraJuros();
        r.setMulta(regraJuroDto.multa);
        r.setDias(regraJuroDto.dias);
        r.setPorcentagemJurosPorDia(regraJuroDto.porcentagemJurosPorDia);
        return r;
    }
}
