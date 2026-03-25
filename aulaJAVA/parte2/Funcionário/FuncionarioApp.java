package parte2.Funcionário;

import java.util.Scanner;

public class FuncionarioApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== FUNCIONÁRIO 1 =====
        System.out.println("Escolha o tipo do funcionário 1:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Técnico");
        int tipo1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome1 = sc.nextLine();

        System.out.print("Salário base: ");
        double salario1 = sc.nextDouble();

        Funcionario f1;

        if (tipo1 == 1) {
            f1 = new Gerente(nome1, salario1);
        } else {
            f1 = new Tecnico(nome1, salario1);
        
        }

        // ===== FUNCIONÁRIO 2 =====
        System.out.println("\nEscolha o tipo do funcionário 2:");
        System.out.println("1 - Gerente");
        System.out.println("2 - Técnico");
    
        int tipo2 = sc.nextInt();
        sc.nextLine();

        System.out.print("Nome: ");
        String nome2 = sc.nextLine();

        System.out.print("Salário base: ");
        double salario2 = sc.nextDouble();

        Funcionario f2;

        if (tipo2 == 1) {
            f2 = new Gerente(nome2, salario2);
        } else {
            f2 = new Tecnico(nome2, salario2);
        
        }


// ===== EXIBIÇÃO =====
        System.out.println("\n===== RESULTADOS =====");

        System.out.println("Nome: " + f1.nome);
        System.out.println("Tipo: " + f1.getClass().getSimpleName());
        System.out.println("Salário: R$ " + f1.calcularSalario());
        System.out.println("------------------------");

        System.out.println("Nome: " + f2.nome);
        System.out.println("Tipo: " + f2.getClass().getSimpleName());
        System.out.println("Salário: R$ " + f2.calcularSalario());
        System.out.println("------------------------");

        sc.close();

}

}