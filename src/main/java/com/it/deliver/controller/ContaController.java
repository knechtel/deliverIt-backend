package com.it.deliver.controller;

import com.it.deliver.bean.Conta;
import com.it.deliver.bean.RegraJuros;
import com.it.deliver.dto.ContaDto;
import com.it.deliver.service.ContaService;
import com.it.deliver.service.RegraJurosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.time.temporal.ChronoUnit;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ContaController {
    @Autowired
    private ContaService contaService;
    @Autowired
    private RegraJurosService regraJurosService;

    @RequestMapping(value = "insereConta", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ContaDto insereConta(@RequestBody ContaDto contaDto) {
        Conta conta = contaService.insere(contaDto.build(contaDto));
        Long dias = ChronoUnit.DAYS.between(conta.getDataVencimento(), conta.getDataPagamento());
        RegraJuros regraJuros = regraJurosService.findByDays(dias);
        conta.setRegraJuros(regraJuros);
        conta = contaService.insere(conta);
        System.out.println("dias = " + dias);
        return contaDto;
    }

    @RequestMapping(value = "doValCorrigido", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public ContaDto calcValCorrigido(@RequestBody ContaDto contaDto) {
        Conta conta = contaService.findById(contaDto.getId());
        Long dias = ChronoUnit.DAYS.between(conta.getDataVencimento(), conta.getDataPagamento());
        contaDto.setValorCorrigido(contaService.getValorCorrigido(dias,conta.getId()));
        return contaDto;
    }

    @RequestMapping(value = "contas", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public List<Conta> findAll() {
        return contaService.findAll();
    }
}
