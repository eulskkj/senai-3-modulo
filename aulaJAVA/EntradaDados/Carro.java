package EntradaDados;

public class Carro extends Veiculo{
    public Carro(String modelo, int ano) {
        super (modelo,ano);
    }

    @Override
    public double calcularValor(){
        return 30000;
    }
}