package SanjaValley.Persuance.Service;

import SanjaValley.Persuance.Entity.Palavra;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
@Rollback
public class PalavraServiceImpTest {

    @Autowired
    private PalavraService buscarPalavraTest;


    @Test
    public void instaciarPalavraTest(){
        Palavra palavra = new Palavra();
        palavra.setPalavra("ALEXIA");
        assertNotNull(palavra.getPalavra());
    }
    @Test
    public void buscarPalavraVaziaTest(){
        assertTrue(buscarPalavraTest.buscaPorPalavra("").isEmpty());
    }

}
