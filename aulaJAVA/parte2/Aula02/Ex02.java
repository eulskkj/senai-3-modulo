package Aula02;
import java.io.FileWriter;

public class Ex02 {
    public static void main(String[] args) {
        try {
            FileWriter escritor = new FileWriter("arquivo.txt", true);
            escritor.close();
            System.out.println("Texto escrito no arquivo com sucesso.");
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: ");
            e.printStackTrace();
        }
    }
    
}