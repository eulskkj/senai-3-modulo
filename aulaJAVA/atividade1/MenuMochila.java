import java.util.Scanner;

public class MenuMochila {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while (op !=4) {
            System.out.println("1- Mochila Escolar: Compacta e ideal para estudantes ");
            System.out.println("2- Mochila de Viagem: Espaçosa, ideal para longas jornadas ");
            System.out.println("3- Mochila Esportiva: Leve, resistente e ergonômica");
            System.out.println("4- Sair");
            System.out.println("Informe a opção desejada: ");
            op = sc.nextInt();
         
            switch (op) {
                case 1:
                    System.out.println("Mochila Escolar selecionada.");
                    break;
                case 2:
                    System.out.println("Mochila de Viagem selecionada.");
                    break;
                case 3:
                    System.out.println("Mochila Esportiva selecionada.");
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
