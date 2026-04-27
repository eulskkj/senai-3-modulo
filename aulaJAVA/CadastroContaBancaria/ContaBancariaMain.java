package CadastroContaBancaria;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaBancariaMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ContaBancaria> contas = new ArrayList<>();

        while (true) {
            try {
                System.out.println("\n--- MENU BANCÁRIO ---");
                System.out.println("1 - Cadastrar Conta");
                System.out.println("2 - Depositar");
                System.out.println("3 - Sacar");
                System.out.println("4 - Listar Contas");
                System.out.println("5 - Sair");
                System.out.print("Escolha uma opção: ");
                
                int opcao = sc.nextInt();
                sc.nextLine(); 

                switch (opcao) {
                    case 1:
                        System.out.print("Nome do titular: ");
                        String nome = sc.nextLine();
                        System.out.print("Saldo inicial: ");
                        double saldoIni = sc.nextDouble();
                        contas.add(new ContaBancaria(nome, saldoIni));
                        System.out.println("Conta cadastrada com sucesso!");
                        break;

                    case 2:
                        System.out.print("Nome do titular para depósito: ");
                        String buscaDep = sc.nextLine();
                        ContaBancaria contaDep = buscarConta(contas, buscaDep);
                        System.out.print("Valor do depósito: ");
                        contaDep.depositar(sc.nextDouble());
                        System.out.println("Depósito realizado!");
                        break;

                    case 3:
                        System.out.print("Nome do titular para saque: ");
                        String buscaSaq = sc.nextLine();
                        ContaBancaria contaSaq = buscarConta(contas, buscaSaq);
                        System.out.print("Valor do saque: ");
                        contaSaq.sacar(sc.nextDouble());
                        System.out.println("Saque realizado!");
                        break;

                    case 4:
                        if (contas.isEmpty()) System.out.println("Nenhuma conta cadastrada.");
                        for (ContaBancaria c : contas) {
                            c.exibirDados();
                        }
                        break;

                    case 5:
                        System.out.println("Encerrando sistema...");
                        sc.close();
                        return;

                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.err.println("Erro: Por favor, insira um valor numérico válido.");
                sc.nextLine();
            } catch (IllegalArgumentException e) {
                System.err.println("Erro de validação: " + e.getMessage());
            } catch (Exception e) {
                System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
            }
        }
    }

  
    private static ContaBancaria buscarConta(ArrayList<ContaBancaria> contas, String nome) {
        for (ContaBancaria c : contas) {
            if (c.getTitular().equalsIgnoreCase(nome)) {
                return c;
            }
        }
        throw new IllegalArgumentException("Conta não encontrada para o titular: " + nome);
    }
}