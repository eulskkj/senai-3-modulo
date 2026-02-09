import java.util.Scanner;

public class Cor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma cor (verde, azul, Amarelo, Vermelho): ");
        String cor = sc.nextLine();

        if (cor.equals("verde")) {
            System.out.println("Valor 10!");
        } else if (cor.equals("azul")) {
            System.out.println("Valor 20!");
        } else if (cor.equals("amarelo")) {
            System.out.println("Valor 30!");
        } else if (cor.equals("vermelho")) {
            System.out.println("Valor 40!");
        } else {
            System.out.println("Cor inválida!");
        }
        sc.close();
    }
}
