import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número:");
        double n1 = sc.nextDouble();
        
        System.out.println("Informe outro número:");
        double n2 = sc.nextDouble();
        
        System.out.println("Informe um operador aritimético:");
        char aritimetico = sc.next().charAt(0);

        if (aritimetico == '+') {
            double soma = n1 + n2;
            System.out.println("Resultado da soma: " + soma);
        } else if (aritimetico == '-') {
            double sub = n1 - n2;   
            System.out.println("Resultado da subtração: " + sub);
        } else if (aritimetico == '/') {
            double div = n1 / n2;
            System.out.println("Resultado da divisão: " + div);
        } else if (aritimetico == '*') {
            double mult = n1 * n2;
            System.out.println("Resultado da multiplicação: " + mult);
        } else {
            System.out.println("Operador aritimético inválido!");
        }
       
        
        sc.close();
    }
}