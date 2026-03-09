import java.util.Scanner;

public class CadastroPessoa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] idades = new int[3];

        int qtd = 0; // controla quantos cadastros existem
        int opcao;

        while (true) {
            System.out.println("\n=== CADASTRO PESSOA (String + int) ===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Listar");
            System.out.println("3 - Pesquisar (por nome)");
            System.out.println("4 - Alterar (por nome)");
            System.out.println("5 - Remover (por nome)");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar buffer

            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            switch (opcao) {
                case 1: // CADASTRAR
                    if (qtd == nomes.length) {//VERIFICA SE A LISTA ESTÁ CHEIA
                        System.out.println("Lista cheia! Não é possível cadastrar.");
                        break;
                    }

                    System.out.print("Digite o nome: ");
                    nomes[qtd] = sc.nextLine();

                    System.out.print("Digite a idade: ");
                    idades[qtd] = sc.nextInt();
                    sc.nextLine();

                    qtd++;
                    System.out.println("Cadastrado com sucesso!");
                    break;

                case 2: // LISTAR
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.println("\nDados cadastrados:");
                    for (int i = 0; i < qtd; i++) {
                        System.out.println(i + " - " + nomes[i] + " - " + idades[i] + " anos");
                    }
                    break;

                case 3: // PESQUISAR
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para pesquisar: ");
                    String busca = sc.nextLine();

                    int posBusca = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(busca)) {
                            posBusca = i;
                            break;
                        }
                    }

                    if (posBusca == -1) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        System.out.println("Encontrado: " + nomes[posBusca] + " - " + idades[posBusca] + " anos");
                    }
                    break;

                case 4: // ALTERAR
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para alterar: ");
                    String nomeAlterar = sc.nextLine();

                    int posAlt = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeAlterar)) {
                            posAlt = i;
                            break;
                        }
                    }

                    if (posAlt == -1) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        System.out.print("Novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Nova idade: ");
                        int novaIdade = sc.nextInt();
                        sc.nextLine();

                        nomes[posAlt] = novoNome;
                        idades[posAlt] = novaIdade;

                        System.out.println("Alterado com sucesso!");
                    }
                    break;

                case 5: // REMOVER (DESLOCANDO)
                    if (qtd == 0) {
                        System.out.println("Nenhum cadastro.");
                        break;
                    }

                    System.out.print("Digite o nome para remover: ");
                    String nomeRemover = sc.nextLine();

                    int posRem = -1;
                    for (int i = 0; i < qtd; i++) {
                        if (nomes[i].equalsIgnoreCase(nomeRemover)) {
                            posRem = i;
                            break;
                        }
                    }

                    if (posRem == -1) {
                        System.out.println("Pessoa não encontrada.");
                    } else {
                        // desloca para a esquerda para não deixar buraco
                        for (int i = posRem; i < qtd - 1; i++) {
                            nomes[i] = nomes[i + 1];
                            idades[i] = idades[i + 1];
                        }

                        // limpa última posição (opcional)
                        nomes[qtd - 1] = null;
                        idades[qtd - 1] = 0;

                        qtd--;
                        System.out.println("Removido com sucesso!");
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }

        sc.close();
    }
}