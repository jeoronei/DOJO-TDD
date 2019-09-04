import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class Teste {

    String base64;
    Comparador comparador;

    @Test
    public void comprararArquivo(){
        comparador = new Comparador();
        File arquivo1 = new File("MauricioVelho.txt");
        File arquivo2 = new File("MauricioVelho2.txt");

        assertTrue(comparador.comparar(arquivo1,arquivo2));
    }

    @Test
    public void compararArquivosDiferentes(){
        comparador = new Comparador();
        File arquivo1 = new File("MauricioNovo.txt");
        File arquivo2 = new File("MauricioVelho.txt");

        assertFalse(comparador.comparar(arquivo1,arquivo2));
    }
}

