package Aula02;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Ex06 {
    public static void main(String[] args) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("dados.txt"));
            bw.newLine();
            bw.write("Terceira linha");
            bw.newLine();
            bw.write("Quarta linha");

            bw.close();
            System.out.println("Texto escrito no arquivo com sucesso!");
        } catch (IOException e) {
            e.printStackTrace();

        }
    }
}