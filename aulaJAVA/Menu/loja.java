import java.util.Scanner;

public class loja {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] produtos = new String[5];
        double[] precos = new double[5];

        int qtd = 5;
        int opcao;

        while (true) {
            System.out.println("1 - Cadastrar produtos");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Pesquisar produto");
            System.out.println("4 - Alterar produto");
            System.out.println("5 - Remover produto");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    for (int i = 0; i < qtd; i++) {
                        System.out.print("Digite o nome do produto: ");
                        sc.nextLine();
                        produtos[i] = sc.nextLine();

                        System.out.print("Digite o preço do produto: ");
                        precos[i] = sc.nextDouble();
                    }
                    break;

                case 2:
                    System.out.println("Produtos cadastrados:");
                    for (int i = 0; i < qtd; i++) {
                        System.out.println((i + 1) + " - " + produtos[i] + " - R$ " + precos[i]);
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do produto para pesquisar: ");
                    sc.nextLine();
                    String nomePesquisa = sc.nextLine();
                    boolean encontrado = false;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i] != null && produtos[i].equalsIgnoreCase(nomePesquisa)) {
                            System.out.println("Produto encontrado: " + produtos[i] + " - R$ " + precos[i]);
                            encontrado = true;
                            break;
                        }
                    }
                    
                    if (!encontrado) {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do produto para alterar: ");
                    sc.nextLine();
                    String nomeAlterar = sc.nextLine();
                    boolean alterado = false;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i] != null && produtos[i].equalsIgnoreCase(nomeAlterar)) {
                            System.out.print("Digite o novo nome do produto: ");
                            produtos[i] = sc.nextLine();

                            System.out.print("Digite o novo preço do produto: ");
                            precos[i] = sc.nextDouble();
                            alterado = true;
                            break;
                        }
                    }

                    if (!alterado) {
                        System.out.println("Produto não encontrado para alteração.");
                    }
                    break;

                case 5:
                    System.out.print("Digite o nome do produto para remover: ");
                    sc.nextLine();
                    String nomeRemover = sc.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < qtd; i++) {
                        if (produtos[i] != null && produtos[i].equalsIgnoreCase(nomeRemover)) {
                            produtos[i] = null;
                            precos[i] = 0.0;
                            removido = true;
                            System.out.println("Produto removido.");
                            break;
                        }
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    sc.close();
                    return;
            }
        }
    }
}