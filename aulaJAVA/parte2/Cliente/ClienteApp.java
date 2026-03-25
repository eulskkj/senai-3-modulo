package parte2.Cliente;

public class ClienteApp {

    public static void main(String[] args) {

        ClientePf c1 = new ClientePf(1, "João", "Rua A, 123", "123.456.789-00");
        ClientePj c2 = new ClientePj(2, "Empresa XYZ", "Avenida B, 456", "12.345.678/0001-00");

        c1.exibirInfo();
        c2.exibirInfo();
    }
}