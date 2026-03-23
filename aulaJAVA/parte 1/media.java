import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe outro número:");
        double n2 = sc.nextDouble();

        double resultado = n1 + n2;
        double media = resultado / 2;

        System.out.println("Sua média é de: "+media+"");
        sc.close();
    }
}
