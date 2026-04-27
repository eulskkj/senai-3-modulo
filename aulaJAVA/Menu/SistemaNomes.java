package Menu;


import java.util.Scanner;
import java.util.ArrayList;

public class SistemaNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Alterar nome");
            System.out.println("4 - Remover nome");
            System.out.println("5 - Pesquisar nome");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    // Cadastrar
                    System.out.print("Digite um nome: ");
                    String nome = sc.nextLine();
                    nomes.add(nome);
                    System.out.println("Nome cadastrado!");
                    break;

                case 2:
                    // Listar
                    if (nomes.isEmpty()) {
                        System.out.println("Lista vazia!");
                    } else {
                        System.out.println("\nLista de nomes:");
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(i + " - " + nomes.get(i));
                        }
                    }
                    break;

                case 3:
                    // Alterar
                    if (nomes.isEmpty()) {
                        System.out.println("Lista vazia!");
                        break;
                    }

                    System.out.print("Digite o índice para alterar: ");
                    int indiceAlterar = sc.nextInt();
                    sc.nextLine();

                    if (indiceAlterar >= 0 && indiceAlterar < nomes.size()) {
                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();
                        nomes.set(indiceAlterar, novoNome);
                        System.out.println("Nome alterado!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 4:
                    // Remover
                    if (nomes.isEmpty()) {
                        System.out.println("Lista vazia!");
                        break;
                    }

                    System.out.print("Digite o índice para remover: ");
                    int indiceRemover = sc.nextInt();

                    if (indiceRemover >= 0 && indiceRemover < nomes.size()) {
                        nomes.remove(indiceRemover);
                        System.out.println("Nome removido!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;

                case 5:
                    // Pesquisar
                    System.out.print("Digite o nome para pesquisar: ");
                    String busca = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < nomes.size(); i++) {
                        if (nomes.get(i).equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado no índice: " + i);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Nome não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 6);

        sc.close();
    }
}