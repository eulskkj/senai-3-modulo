import java.util.Scanner;

public class Repeticao05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op!=4) {
        System.out.println("=======MENU INTERATIVO======");
        System.out.println("1-CADRASTAR");
        System.out.println("2- LISTAR");
        System.out.println("3- REMOVER");
        System.out.println("4- SAIR");
        System.out.println("Informe a opção desejada: ");
        op = sc.nextInt();
        
        switch (op) {
            case 1:
                System.out.println("CADRASTAR");
                break;
        
            case 2:
                System.out.println("LISTAR");
                break;
        
            case 3:
                System.out.println("REMOVER");
                break;
        
            case 4:
                System.out.println("SAIR");
                break;
            default:
                System.out.println("OPÇÃO INVÁLIDA!");
                break;
        }
    }
        sc.close();
    }
}
