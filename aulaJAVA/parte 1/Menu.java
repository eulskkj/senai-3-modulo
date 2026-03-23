import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Menu");
        System.out.println("1. Calcular tabuada");
        System.out.println("2. Realizar contagem regressiva");
        System.out.println("0. Sair");
        System.out.println("Selecione uma opção: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("Digite um número para calcular a tabuada: ");
                int num = sc.nextInt();
                System.out.println("Tabuada do " + num + ":");
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num + " x " + i + " = " + (num * i));
                }
                break;
            case 2:
                System.out.println("Digite um número para iniciar a contagem regressiva: ");
                int contagem = sc.nextInt();
                System.out.println("Contagem regressiva:");
                for (int i = contagem; i >= 0; i--) {
                    System.out.println(i);
                }
                break;
            case 0:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Opção inválida!");
        }



        sc.close();
    }
}
