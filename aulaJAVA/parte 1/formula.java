import java.util.Scanner;

public class formula {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a força utilizada:");
        double f1 = sc.nextDouble();
        
        System.out.println("Informe a distância utilizada:");
        double d1 = sc.nextDouble();

        Double trabalho = f1 *d1;
        System.out.println("O trabalho realizado é de: "+trabalho+"");

        sc.close();
    }
}
