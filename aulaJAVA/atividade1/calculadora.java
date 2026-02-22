import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número:");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe outro número:");
        double n2 = sc.nextDouble();

        double soma = n1 + n2;
        double sub = n1 - n2;
        double div = n1 / n2;
        double mult = n1 * n2;

        System.out.println("Valor da soma: "+soma+", Subtração: "+sub+", Divisão: "+div+", Multiplicação "+mult+"");
        sc.close();
    }
}
