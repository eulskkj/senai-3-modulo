package Aula02;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            File arquivo = new File("arquivo.txt");            
            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado: " + arquivo.getName());
            } else {
                System.out.println("Arquivo já existe.");
            }
        }catch (IOException e) {
            System.out.println("Ocorreu um erro: ");
            e.printStackTrace();
        }
        scanner.close();
    }
}