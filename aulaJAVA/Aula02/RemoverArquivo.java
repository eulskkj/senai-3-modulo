package Aula02;
import java.io.File;

public class RemoverArquivo {
    public static void main(String[] args) {

        String caminho = "arquivo.txt";

        File arquivo = new File(caminho);

        if (arquivo.exists()) {
        if (arquivo.delete()) {
            System.out.println("O arquivo removido.");

        } else {
            System.out.println("Falha ao remover o arquivo.");

        }
    }else{
            System.out.println("Arquivo não existe.");

        }
    }
}
