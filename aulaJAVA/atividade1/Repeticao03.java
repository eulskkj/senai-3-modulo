import java.util.Scanner;

public class Repeticao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numero = 0;
        while (numero != 10) {
            System.out.println("Informe 10 para cancelar: ");
            numero = sc.nextInt();
        }
        System.out.println("Programa cancelado!");


        sc.close();
    }
}
