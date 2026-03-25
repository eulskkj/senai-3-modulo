package parte2;

public class CamisaApp {
    public static void main(String[] args) {
        Camisa c1 = new Camisa("Preta", "M", "Camiseta");
        Camisa c2 = new Camisa("Branca", "G", "Regata");

        System.out.println("Cor: " + c1.getCor());
        System.out.println("Tamanho: " + c1.getTamanho());
        System.out.println("Tipo: " + c1.getTipo());

        c1.setCor("Azul");
        c1.setTamanho("P");
        c1.setTipo("Polo");

        System.out.println("Cor: " + c1.getCor());
        System.out.println("Tamanho: " + c1.getTamanho());
        System.out.println("Tipo: " + c1.getTipo());

        c2.setCor("Vermelha");
        c2.setTamanho("M");
        c2.setTipo("Social");

        System.out.println("Cor: " + c2.getCor());
        System.out.println("Tamanho: " + c2.getTamanho());
        System.out.println("Tipo: " + c2.getTipo());
    }
}