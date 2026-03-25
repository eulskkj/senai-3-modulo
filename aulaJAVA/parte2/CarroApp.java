package parte2;

public class CarroApp {
    public static void main(String[] args) {
        // Criando objetos da classe Carro
        Carro carro1 = new Carro("Toyota", "Corolla", 2020);
        Carro carro2 = new Carro("Honda", "Civic", 2019);
        Carro carro3 = new Carro("Ford", "Mustang", 2021);

        // Exibindo os dados dos carros
        System.out.println("Dados do Carro 1:");
        carro1.exibirDados();

        System.out.println("Dados do Carro 2:");
        carro2.exibirDados();

        System.out.println("Dados do Carro 3:");
        carro3.exibirDados();
    }
    
}