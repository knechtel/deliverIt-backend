package com.it.deliver.controller;


import com.it.deliver.dto.RegraJurosDto;
import com.it.deliver.service.RegraJurosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegraJurosController {

    @Autowired
    private RegraJurosService regraJurosService;

    @RequestMapping(value = "insereJuros", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public RegraJurosDto insereJuros(@RequestBody RegraJurosDto regraJurosDto){
        regraJurosService.insere(regraJurosDto.build(regraJurosDto));
        return regraJurosDto;
    }
}
