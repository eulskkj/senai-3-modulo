package CadastroPessoas;

import java.util.ArrayList;
import java.util.Scanner;



public class CadastroPessoasApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Professor> listaProfessores = new ArrayList<>();

        while (true) {
            try {
                System.out.println("\n========= MENU SISTEMA =========");
                System.out.println("1- Cadastrar Aluno | 2- Cadastrar Professor | 3- Listar Alunos");
                System.out.println("4- Listar Profs | 5- Listar Todos | 6- Pesquisar");
                System.out.println("7- Remover Aluno | 8- Remover Professor | 9- Sair");
                System.out.print("Escolha: ");

                if (!sc.hasNextInt()) { // Se não for número na opção
                    System.out.println("ERRO: Digite apenas o número da opção!");
                    sc.nextLine(); // Limpa a porcaria que digitaram
                    continue;
                }

                int opcao = sc.nextInt();
                sc.nextLine(); // Limpa o "Enter"

                if (opcao == 9) break;

                switch (opcao) {
                    case 1: // ALUNO
                        System.out.print("Nome: ");
                        String nA = sc.nextLine();
                        if (!nA.matches("[a-zA-ZÀ-ú ]+") || nA.trim().isEmpty()) {
                            System.out.println("ERRO: Nome inválido (apenas letras)!");
                            break;
                        }
                        System.out.print("Idade: ");
                        int iA = lerNumeroPositivo(sc);
                        System.out.print("Matrícula: ");
                        int mA = lerNumeroPositivo(sc);
                        
                        if (iA != -1 && mA != -1) {
                            listaAlunos.add(new Aluno(nA, iA, mA));
                            System.out.println("Cadastrado!");
                        }
                        break;

                    case 2: // PROFESSOR
                        System.out.print("Nome: ");
                        String nP = sc.nextLine();
                        if (!nP.matches("[a-zA-ZÀ-ú ]+") || nP.trim().isEmpty()) {
                            System.out.println("ERRO: Nome inválido!");
                            break;
                        }
                        System.out.print("Idade: ");
                        int iP = lerNumeroPositivo(sc);
                        System.out.print("Disciplina: ");
                        String dP = sc.nextLine();
                        
                        if (iP != -1 && !dP.trim().isEmpty()) {
                            listaProfessores.add(new Professor(nP, iP, dP));
                            System.out.println("Cadastrado!");
                        } else {
                            System.out.println("ERRO: Dados incompletos!");
                        }
                        break;

                    case 3: for (Aluno a : listaAlunos) a.exibirDados(); break;
                    case 4: for (Professor p : listaProfessores) p.exibirDados(); break;
                    case 5: 
                        for (Aluno a : listaAlunos) a.exibirDados();
                        for (Professor p : listaProfessores) p.exibirDados();
                        break;
                    
                    case 7: // REMOVER
                        System.out.print("Matrícula para remover: ");
                        int mR = sc.nextInt();
                        if (listaAlunos.removeIf(a -> a.getMatricula() == mR)) 
                            System.out.println("Removido!");
                        else System.out.println("Não encontrado.");
                        break;

                    case 9: System.exit(0);
                    default: System.out.println("Opção inexistente.");
                }
            } catch (Exception e) {
                System.out.println("ERRO INESPERADO: O sistema foi reiniciado para o menu.");
                sc.nextLine(); // Garante limpeza total do teclado
            }
        }
        sc.close();
    }

    // MÉTODO AUXILIAR PARA BLINDAR NÚMEROS
    public static int lerNumeroPositivo(Scanner sc) {
        try {
            int num = sc.nextInt();
            sc.nextLine(); // Limpa buffer
            if (num < 0) {
                System.out.println("ERRO: Não use números negativos!");
                return -1;
            }
            return num;
        } catch (Exception e) {
            System.out.println("ERRO: Digite apenas números!");
            sc.nextLine(); // Limpa o erro
            return -1;
        }
    }
}