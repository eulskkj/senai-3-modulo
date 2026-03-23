import java.util.Scanner;

public class MenuCanetas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op !=4) {
            System.out.println("1- Caneta Esferográfica: Econômica e de longa duração ");
            System.out.println("2- Caneta Gel: Tinta mais pigmentada e escrita suave ");
            System.out.println("3- Caneta Tinteiro: Clássica e elegante, usada para caligrafia ");
            System.out.println("4- Sair");
            System.out.println("Informe a opção desejada: ");
            op = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("Caneta Esferográfica selecionada.");
                break;
            case 2:
                System.out.println("Caneta Gel selecionada.");
                break;
            case 3:
                System.out.println("Caneta Tinteiro selecionada.");
                break;
            case 4:
                System.out.println("Saindo do programa.");
                break;
            default:
                System.out.println("Opção inválida. Tente novamente.");
                break;
        }
        }
        sc.close();
    }
}
