package Veiculo;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, int ano, int numeroPortas) {
        super(marca, ano);
        this.numeroPortas = numeroPortas;
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }

    
}