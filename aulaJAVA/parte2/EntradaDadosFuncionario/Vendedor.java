package EntradaDadosFuncionario;

public abstract class Vendedor {
    protected String nome;
    protected double salarioBase;

    public Vendedor (String nome, double salarioBase) {
        if (nome.isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
        else if (salarioBase <1518) {
            throw new IllegalArgumentException("Salario base não pode ser menor que R$1.518");
        }
        this.nome = nome;
        this.salarioBase = salarioBase;
    }
    public abstract double salarioTotal();

    public void exibir(){
        System.out.println("Nome: "+nome);
        System.out.println("Salario Base: "+salarioBase);
        System.out.println("Salario total: "+salarioTotal());
    }

}
