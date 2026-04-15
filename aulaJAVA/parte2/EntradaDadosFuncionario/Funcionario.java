package EntradaDadosFuncionario;

public abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        if (salarioBase < 0) {
            throw new IllegalArgumentException("Salário base não pode ser negativo.");
        }
        this.nome = nome.trim();
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.printf("Salário Base: R$ %.2f%n", salarioBase);
        System.out.printf("Salário Final: R$ %.2f%n", calcularSalario());
    }
}
