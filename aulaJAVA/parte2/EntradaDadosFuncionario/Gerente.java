package EntradaDadosFuncionario;

public class Gerente extends Funcionario {
    private static final double BONUS = 2000.0;

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + BONUS;
    }
}