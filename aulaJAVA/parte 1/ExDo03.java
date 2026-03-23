import java.util.Scanner;

public class ExDo03 {
    public static void main(String[] args) {
        int op = 0;
        Scanner sc =new Scanner(System.in);

        do{
            System.out.println("Menu");
            System.out.println("1- Cadastro");
            System.out.println("2- Listar");
            System.out.println("3- Excluir");
            System.out.println("0- Sair");
            System.out.println("Escolha uma opção: ");
            op = sc.nextInt();

        

        switch (op) {
            case 1:
                System.out.println("Você escolheu a opção 1.");
                break;
            case 2:
                System.out.println("Você escolheu a opção 2.");
                break;
            case 3:
                System.out.println("Você escolheu a opção 3.");
                break;
            case 0:
                System.out.println("Saindo do programa...");
                break;
        
            default:
                System.out.println("Opção inválida");
            }
        } while (op!= 0);
        sc.close();
    }
}

