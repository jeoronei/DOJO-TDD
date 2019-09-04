import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileUtils {

    public byte[] carregarArquivo(File arquivo) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(arquivo);
        byte[] conteudo = new byte[(int) arquivo.length()];
        fis.read(conteudo);
        return conteudo;
    }
}
