package Aula02;
import java.io.FileReader;
public class Ex05 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("dados.txt");
            int caracter;

            while ((caracter = fr.read()) != -1) {
                System.out.print((char) caracter);
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao ler o arquivo.");
            e.printStackTrace();
        }
         
    
}
}