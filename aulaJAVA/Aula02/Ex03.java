package Aula02;
import java.io.File;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        try {
            File arquivo = new File("Exemplo.txt");
            Scanner sc = new Scanner(arquivo);

            while (sc.hasNextLine()) {
                String linha = sc.nextLine();
                System.out.println(linha);
            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
    }

    
}