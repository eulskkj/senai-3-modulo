package CadastroProdutos;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        int opcao = 0;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); 

                switch (opcao) {

                    case 1:
                        try {
                            System.out.print("Nome: ");
                            String nome = sc.nextLine();

                            System.out.print("Preço: ");
                            double preco = sc.nextDouble();

                            System.out.print("Quantidade: ");
                            int quantidade = sc.nextInt();

                            Produto p = new Produto(nome, preco, quantidade);
                            listaProdutos.add(p);

                            System.out.println("Produto cadastrado com sucesso!");

                        } catch (IllegalArgumentException e) {
                            System.out.println("Erro: " + e.getMessage());
                        } catch (InputMismatchException e) {
                            System.out.println("Erro: Digite valores numéricos válidos!");
                            sc.nextLine(); // limpar erro
                        }
                        break;

                    case 2:
                        if (listaProdutos.isEmpty()) {
                            System.out.println("Nenhum produto cadastrado.");
                        } else {
                            for (Produto p : listaProdutos) {
                                p.exibirProduto();
                            }
                        }
                        break;

                    case 3:
                        System.out.println("Saindo...");
                        break;

                    default:
                        System.out.println("Opção inválida!");
                }

            } catch (InputMismatchException e) {
                System.out.println("Erro: Digite um número válido!");
                sc.nextLine(); 
            }

        } while (opcao != 3);

        sc.close();
    }
}