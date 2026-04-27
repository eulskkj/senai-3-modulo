package Aula02;
import java.io.FileWriter;


public class Ex04 {
    public static void main(String[] args) {
        
        try {
            FileWriter fw = new FileWriter("dados.txt");
            fw.write("\n primeira linha");
            fw.write("\n segunda linha");
            fw.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
}