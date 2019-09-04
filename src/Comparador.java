import java.io.*;
import java.util.Arrays;

public class Comparador {
    public boolean comparar(File arquivo1, File arquivo2) {
        try {
            return Arrays.equals(carregarArquivo(arquivo1), carregarArquivo(arquivo2));
        } catch (IOException e) {
            throw new RuntimeException("Não deu boa", e);
        }
    }
}
