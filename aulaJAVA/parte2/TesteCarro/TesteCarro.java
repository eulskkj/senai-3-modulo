package TesteCarro;

public class TesteCarro {
    public static void main(String[] args) {
        
        Carro c1 = new Carro("Corolla", "Toyota", 2019, 20000.0);
        Carro c2 = new Carro("Civic", "Honda", 2020, 25000.0);

        c1.exibirDetalhe();
        System.out.println("-----------------------------");
        c2.exibirDetalhe();
    }
    
}