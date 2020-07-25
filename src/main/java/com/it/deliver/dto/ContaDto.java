package com.it.deliver.dto;

import com.it.deliver.bean.Conta;
import com.it.deliver.util.Util;



public class ContaDto {
    private Integer id;
    private String nome;
    private Double valorOriginal;
    private String dataVencimento;
    private String dataPagamento;
    private Double valorCorrigido;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValorOriginal() {
        return valorOriginal;
    }

    public void setValorOriginal(Double valorOriginal) {
        this.valorOriginal = valorOriginal;
    }

    public String getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(String dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(String dataPagamento) {
        this.dataPagamento = dataPagamento;
    }

    public Double getValorCorrigido() {
        return valorCorrigido;
    }

    public void setValorCorrigido(Double valorCorrigido) {
        this.valorCorrigido = valorCorrigido;
    }

    public Conta build(ContaDto contaDto){
        Conta conta = new Conta();
        conta.setNome(contaDto.nome);
        conta.setDataPagamento(Util.stringToLocalDate(contaDto.dataPagamento));
        conta.setDataVencimento(Util.stringToLocalDate(contaDto.dataVencimento));
        conta.setValorOriginal(contaDto.valorOriginal);



        return conta;
    }
}
