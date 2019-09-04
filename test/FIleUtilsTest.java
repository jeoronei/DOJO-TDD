import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

import static org.junit.Assert.assertTrue;

public class FIleUtilsTest {

    public static final String MAURCIO_VELHO_PRA_CARAI = "Maurcio Velho pra carai";

    @Test
    public testConteudoArquivo() throws FileNotFoundException {
        FileUtils fileUtils = new FileUtils();
        File arquivo = new File("MauricioVelho.txt");
        assertTrue(Arrays.equals(MAURCIO_VELHO_PRA_CARAI.getBytes(), fileUtils.carregarArquivo(arquivo)));
    }
}
