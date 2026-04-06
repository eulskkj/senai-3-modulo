package Veiculo;

public class VeiculoApp {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Toyota", 2020, 4);
        Moto moto1 = new Moto("Honda", 2019, 150);

        System.out.println("Informações do Carro:");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Número de Portas: " + carro1.getNumeroPortas());

        System.out.println("\nInformações da Moto:");
        System.out.println("Marca: " + moto1.getMarca());
        System.out.println("Ano: " + moto1.getAno());
        System.out.println("Cilindradas: " + moto1.getCilindradas());
    }
    
}