package Produto;

import java.util.Scanner;

public class ProdutoApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o nome do produto: ");
        String nome = sc.nextLine();

        System.out.print("Digite o preço: ");
        double preco = sc.nextDouble();

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        // Criando objeto
        Produto p1 = new Produto(nome, preco, quantidade);

        // Exibindo
        System.out.println("\n--- Dados do Produto ---");
        p1.exibirInfo();

        sc.close();
    }
}