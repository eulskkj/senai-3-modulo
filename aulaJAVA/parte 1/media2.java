import java.util.Scanner;

public class media2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe outro número:");
        double n2 = sc.nextDouble();
        
        System.out.println("Informe outro número:");
        double n3 = sc.nextDouble();
        
        double resultado = n1 + n2 + n3;
        double media = resultado / 3;

        System.out.println("Sua média é de: "+media+"");
        sc.close();
    }
}
