package parte2.Funcionário;

public class Main {
    public static void main(String[] args) {

        // Criando objetos
        Funcionario f1 = new Gerente("Carlos", 5000);
        Funcionario f2 = new Tecnico("Ana", 3000);
       

        // Exibindo dados
        System.out.println("Nome: " + f1.nome);
        System.out.println("Tipo: " + f1.getClass().getSimpleName());
        System.out.println("Salário: R$ " + f1.calcularSalario());
        System.out.println("------------------------");

        System.out.println("Nome: " + f2.nome);
        System.out.println("Tipo: " + f2.getClass().getSimpleName());
        System.out.println("Salário: R$ " + f2.calcularSalario());
        System.out.println("------------------------");

   
    }
}