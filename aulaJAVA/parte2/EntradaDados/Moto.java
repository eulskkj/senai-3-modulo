package EntradaDados;

public class Moto extends Veiculo {

    public Moto(String modelo, int ano) {
        super (modelo,ano);
    }

    @Override
    public double calcularValor(){
        return 15000;
    }
}
