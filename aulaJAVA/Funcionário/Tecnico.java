package Funcionário;

public class Tecnico extends Funcionario{
    
    public Tecnico(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase + 1000;
    }
}