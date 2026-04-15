package EntradaDadosFuncionario;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class EntradaDadosFuncionarioApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n=== Cadastro de Funcionários ===");
            System.out.println("1 - Cadastrar Gerente");
            System.out.println("2 - Cadastrar Vendedor");
            System.out.println("3 - Listar Funcionários");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();

                switch (opcao) {
                    case 1:
                        cadastrarGerente(sc, funcionarios);
                        break;
                    case 2:
                        cadastrarVendedor(sc, funcionarios);
                        break;
                    case 3:
                        listarFuncionarios(funcionarios);
                        break;
                    case 0:
                        System.out.println("Encerrando o sistema.");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Erro de entrada: digite um valor válido.");
                sc.nextLine();
            }
        }

        sc.close();
    }

    private static void cadastrarGerente(Scanner sc, ArrayList<Funcionario> funcionarios) {
        try {
            System.out.print("Nome do gerente: ");
            String nome = sc.nextLine();
            System.out.print("Salário base: ");
            double salarioBase = sc.nextDouble();
            sc.nextLine();

            funcionarios.add(new Gerente(nome, salarioBase));
            System.out.println("Gerente cadastrado com sucesso.");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: digite um número válido para o salário.");
            sc.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void cadastrarVendedor(Scanner sc, ArrayList<Funcionario> funcionarios) {
        try {
            System.out.print("Nome do vendedor: ");
            String nome = sc.nextLine();
            System.out.print("Salário base: ");
            double salarioBase = sc.nextDouble();
            System.out.print("Comissão: ");
            double comissao = sc.nextDouble();
            sc.nextLine();

            funcionarios.add(new Vendedor(nome, salarioBase, comissao));
            System.out.println("Vendedor cadastrado com sucesso.");
        } catch (InputMismatchException e) {
            System.out.println("Erro de entrada: digite números válidos para salário e comissão.");
            sc.nextLine();
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void listarFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios.isEmpty()) {
            System.out.println("Nenhum funcionário cadastrado.");
            return;
        }

        System.out.println("\n--- Lista de Funcionários ---");
        for (Funcionario funcionario : funcionarios) {
            funcionario.exibirDados();
            System.out.println("----------------------------");
        }
    }
}
