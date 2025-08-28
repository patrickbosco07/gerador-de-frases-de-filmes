package br.com.funnycorporation.phrasemaker.service;

import br.com.funnycorporation.phrasemaker.dto.FraseDTO;
import br.com.funnycorporation.phrasemaker.model.Frase;
import br.com.funnycorporation.phrasemaker.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

@Service
public class FraseService {
    @Autowired
    private FraseRepository fraseRepository;
    private Random random = new Random();
    public FraseDTO obterFraseAleatoria(){
        List<Frase> listaRetornada = fraseRepository.findAll();

        var idAletorio = Integer.toUnsignedLong(random.nextInt(1, listaRetornada.size()));
        System.out.println(idAletorio);
        Optional<Frase> fraseRetornada = fraseRepository.findById(idAletorio);
        if (fraseRetornada.isPresent()){
            var frase = fraseRetornada.get();
             return new FraseDTO(frase.getTitulo(),frase.getFrase(),frase.getPersonagem(),frase.getPoster());
        }
        return null;
    }
}
