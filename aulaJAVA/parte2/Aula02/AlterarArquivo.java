package Aula02;
import java.io.FileWriter;

public class AlterarArquivo {
    public static void main(String[] args) {
        String caminho = "dados.txt";
        try {
            FileWriter writer = new FileWriter(caminho);
            writer.write("Novo conteúdo do arquivo");
            writer.write("Este texto substituirá o anterior");

            writer.close();
            System.out.println("Arquivo alterado com sucesso!");
        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao alterar o arquivo.");
            e.printStackTrace();
        }
    }
    
}