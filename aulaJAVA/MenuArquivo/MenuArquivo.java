
package MenuArquivo;
import java.io.*;
import java.util.Scanner;

public class MenuArquivo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String caminho = "arquivo.txt";
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Criar arquivo");
            System.out.println("2 - Escrever no arquivo");
            System.out.println("3 - Ler arquivo");
            System.out.println("4 - Alterar arquivo");
            System.out.println("5 - Remover arquivo");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    criarArquivo(caminho);
                    break;

                case 2:
                    System.out.print("Digite o texto: ");
                    String texto = sc.nextLine();
                    escreverArquivo(caminho, texto);
                    break;

                case 3:
                    lerArquivo(caminho);
                    break;

                case 4:
                    System.out.print("Digite o novo conteúdo: ");
                    String novoTexto = sc.nextLine();
                    alterarArquivo(caminho, novoTexto);
                    break;

                case 5:
                    removerArquivo(caminho);
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

    // =========================
    // MÉTODOS
    // =========================

    public static void criarArquivo(String caminho) {
        try {
            File arquivo = new File(caminho);

            if (arquivo.createNewFile()) {
                System.out.println("Arquivo criado com sucesso!");
            } else {
                System.out.println("Arquivo já existe.");
            }

        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + e.getMessage());
        }
    }

    public static void escreverArquivo(String caminho, String texto) {
        try {
            FileWriter writer = new FileWriter(caminho, true); // append
            writer.write(texto + "\n");
            writer.close();

            System.out.println("Texto adicionado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao escrever: " + e.getMessage());
        }
    }

    public static void lerArquivo(String caminho) {
        try {
            File arquivo = new File(caminho);

            if (!arquivo.exists()) {
                System.out.println("Arquivo não existe.");
                return;
            }

            BufferedReader reader = new BufferedReader(new FileReader(caminho));
            String linha;

            System.out.println("\nConteúdo do arquivo:");
            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler: " + e.getMessage());
        }
    }

    public static void alterarArquivo(String caminho, String texto) {
        try {
            FileWriter writer = new FileWriter(caminho); // sobrescreve
            writer.write(texto);
            writer.close();

            System.out.println("Arquivo alterado com sucesso!");

        } catch (IOException e) {
            System.out.println("Erro ao alterar: " + e.getMessage());
        }
    }

    public static void removerArquivo(String caminho) {
        File arquivo = new File(caminho);

        if (arquivo.exists()) {
            if (arquivo.delete()) {
                System.out.println("Arquivo removido com sucesso!");
            } else {
                System.out.println("Erro ao remover o arquivo.");
            }
        } else {
            System.out.println("Arquivo não existe.");
        }
    }
}