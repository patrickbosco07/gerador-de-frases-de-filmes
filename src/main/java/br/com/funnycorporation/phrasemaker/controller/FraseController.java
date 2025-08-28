package br.com.funnycorporation.phrasemaker.controller;

import br.com.funnycorporation.phrasemaker.dto.FraseDTO;
import br.com.funnycorporation.phrasemaker.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series")
public class FraseController {
    @Autowired
    private FraseService fraseService;

    @GetMapping("/frases")
    public FraseDTO obterFraseAleatoriaDoBanco(){
        return fraseService.obterFraseAleatoria();
    }
}
