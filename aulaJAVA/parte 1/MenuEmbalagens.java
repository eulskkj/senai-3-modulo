import java.util.Scanner;

public class MenuEmbalagens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        while (op !=4) {
            System.out.println("=======MENU DE EMBALAGENS======");
            System.out.println("1- Caixa de papelão: Ideal para transporte e armazenamento  ");
            System.out.println("2-Sacola plástica: Leve e prática, mas pouco sustentável  ");
            System.out.println("3- Embalagem de vidro: Resistente e reutilizável.");
            System.out.println("4-Sair");
            System.out.println("Informe a opção desejada: ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Caixa de papelão selecionada.");
                    break;
                case 2:
                    System.out.println("Sacola plástica selecionada.");
                    break;
                case 3:
                    System.out.println("Embalagem de vidro selecionada.");
                    break;
                case 4:
                    System.out.println("Saindo do menu.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
        sc.close();
        
    }
}

