import java.util.Scanner;

public class ArListMenu {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        java.util.ArrayList<String> nomes = new java.util.ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Cadastrar nome");
            System.out.println("2 - Listar nomes");
            System.out.println("3 - Alterar nome");
            System.out.println("4 - Remover nome");
            System.out.println("5 - Pesquisar nome");
            System.out.println("6 - Sair");
            System.out.print("Escolha: ");
            
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {

                case 1:
                    // CADASTRAR (igual seu jeito)
                    System.out.println("Digite um nome:");
                    nomes.add(sc.nextLine());
                    break;

                case 2:
                    // LISTAR (igual seu for)
                    if (nomes.size() == 0) {
                        System.out.println("Lista vazia");
                    } else {
                        for (int i = 0; i < nomes.size(); i++) {
                            System.out.println(i + " - " + nomes.get(i));
                        }
                    }
                    break;

                case 3:
                    // ALTERAR (igual seu do-while)
                    if (nomes.size() == 0) {
                        System.out.println("Lista vazia");
                        break;
                    }

                    int indiceAlterar;
                    do {
                        System.out.println("Informe o índice que deseja alterar:");
                        indiceAlterar = sc.nextInt();
                        sc.nextLine();

                        if (indiceAlterar < 0 || indiceAlterar >= nomes.size()) {
                            System.out.println("Índice inválido");
                        }

                    } while (indiceAlterar < 0 || indiceAlterar >= nomes.size());

                    System.out.println("Digite o novo nome:");
                    String novoNome = sc.nextLine();

                    nomes.set(indiceAlterar, novoNome);
                    System.out.println("Nome alterado!");
                    break;

                case 4:
                    // REMOVER (igual seu do-while)
                    if (nomes.size() == 0) {
                        System.out.println("Lista vazia");
                        break;
                    }

                    int indice;
                    do {
                        System.out.println("Informe o índice para remover:");
                        indice = sc.nextInt();

                        if (indice < 0 || indice >= nomes.size()) {
                            System.out.println("Índice inválido");
                        }

                    } while (indice < 0 || indice >= nomes.size());

                    nomes.remove(indice);
                    System.out.println("Nome removido!");
                    break;

                case 5:
                    // PESQUISAR (simples)
                    System.out.println("Digite o nome para pesquisar:");
                    String busca = sc.nextLine();

                    boolean achou = false;

                    for (int i = 0; i < nomes.size(); i++) {
                        if (nomes.get(i).equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado no índice: " + i);
                            achou = true;
                        }
                    }

                    if (!achou) {
                        System.out.println("Nome não encontrado");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }

        } while (opcao != 6);

        sc.close();
    }
}