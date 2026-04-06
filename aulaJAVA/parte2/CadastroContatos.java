// CRIE UM PROGRAMA EM JAVA QUE CADASTRE  CONTATOS TELEFÔNICOS: NOME E NÚMERO. O PROGRAMA DEVERÁ LISTAR OS CONTATOS CADASTRADOS E EXCLUIR.
// NO PROGRAMA DEVEM TER AS OPÇÕES PARA ESCOLHA:
// 1-CADASTRO
// 2-LISTAR
// 3-EXCLUIR
// 4-SAIR


import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> numeros = new ArrayList<>();
        
        while (true) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Excluir Contato");
            System.out.println("4 - Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer do teclado
            
            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome: ");
                    nomes.add(scanner.nextLine());
                    System.out.print("Digite o número: ");
                    numeros.add(scanner.nextLine());
                    System.out.println("Contato cadastrado com sucesso!");
                    break;
                case 2:
                    System.out.println("\nContatos cadastrados:");
                    for (int i = 0; i < nomes.size(); i++) {
                        System.out.println((i + 1) + ". " + nomes.get(i) + " - " + numeros.get(i));
                    }
                    break;
                case 3:
                    System.out.print("Digite o número do contato que deseja excluir: ");
                    int index = scanner.nextInt();
                    scanner.nextLine(); // Limpar buffer
                    if (index > 0 && index <= nomes.size()) {
                        nomes.remove(index - 1);
                        numeros.remove(index - 1);
                        System.out.println("Contato excluído com sucesso!");
                    } else {
                        System.out.println("Contato inválido!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }
}