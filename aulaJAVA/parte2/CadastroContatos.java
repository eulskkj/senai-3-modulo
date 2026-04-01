import java.util.ArrayList;
import java.util.Scanner;

public class CadastroContatos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> contatos = new ArrayList<>();
        int op;

        do {
            System.out.println("\nEscolha a opção:");
            System.out.println("1- CADASTRAR CONTATO");
            System.out.println("2- LISTAR CONTATOS");
            System.out.println("3- EXCLUIR CONTATO");
            System.out.println("4- ALTERAR CONTATO");
            System.out.println("5- PESQUISAR CONTATO");
            System.out.println("6- SAIR");
            System.out.print("OPÇÃO: ");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {

                case 1:
                    System.out.print("Informe o nome: ");
                    String nome = sc.nextLine();

                    System.out.print("Informe o número: ");
                    String numero = sc.nextLine();

                    contatos.add(new Contato(nome, numero));
                    System.out.println("Cadastro realizado com sucesso!");
                    break;

                case 2:
                    if (contatos.size() == 0) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        System.out.println("\nContatos cadastrados:");
                        for (int i = 0; i < contatos.size(); i++) {
                            System.out.println((i + 1) + " - " + contatos.get(i));
                        }
                    }
                    break;

                case 3:
                    if (contatos.size() == 0) {
                        System.out.println("Lista vazia.");
                        break;
                    }

                    System.out.print("Informe o número para excluir: ");
                    int index = sc.nextInt();
                    sc.nextLine();

                    if (index > 0 && index <= contatos.size()) {
                        contatos.remove(index - 1);
                        System.out.println("Contato excluído com sucesso!");
                    } else {
                        System.out.println("Contato inválido.");
                    }
                    break;

                case 4:
                    if (contatos.size() == 0) {
                        System.out.println("Lista vazia.");
                        break;
                    }

                    System.out.print("Informe o número para alterar: ");
                    int pos = sc.nextInt();
                    sc.nextLine();

                    if (pos > 0 && pos <= contatos.size()) {
                        System.out.print("Digite o novo nome: ");
                        String novoNome = sc.nextLine();

                        System.out.print("Digite o novo número: ");
                        String novoNumero = sc.nextLine();

                        contatos.get(pos - 1).setNome(novoNome);
                        contatos.get(pos - 1).setNumero(novoNumero);

                        System.out.println("Contato alterado com sucesso!");
                    } else {
                        System.out.println("Contato inválido.");
                    }
                    break;

                case 5:
                    System.out.print("Informe o nome para pesquisar: ");
                    String busca = sc.nextLine();

                    boolean encontrado = false;

                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).getNome().equalsIgnoreCase(busca)) {
                            System.out.println("Encontrado: " + contatos.get(i));
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (op != 6);

        sc.close();
    }
}