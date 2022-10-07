package SanjaValley.Persuance.Service;

import java.util.List;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import SanjaValley.Persuance.Entity.Palavra;
import SanjaValley.Persuance.Repository.PalavraRepository;

@Service

public class PalavraServiceImp implements PalavraService{

    @Autowired
    private PalavraRepository palavraRepository;


    @Override
    public Palavra novaPalavra(Palavra palavra) {

        return palavraRepository.save(palavra);
    }

    @Override
    public List<Palavra> buscaPorPalavra(String palavra){
        List<Palavra> teste = palavraRepository.findByPalavra(palavra);

        if(teste.isEmpty()){
            return teste;
        }
        return palavraRepository.findByPalavra(palavra);
    }


/*
    public List<Palavra> buscarPorPalavraNoTexto(String palavra){
        String[] arrOfStr = palavra.split(" ");

        for (String a : arrOfStr)
            palavraRepository.findByPalavra(a);

        return  null;
    }*/


}
