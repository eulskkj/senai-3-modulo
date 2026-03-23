import java.util.Scanner;

public class CrudArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // criar array
        String[] carros = new String[10];

        //Cadastrar
        System.out.println("=== CADASTRO DE CARROS ===");
        for (int i =0; i< carros.length; i++) {
            System.out.println("Digite um nome de carro: ");
            carros[i] = sc.nextLine();
        }

        //Listar
        System.out.println("\nLista atual:");
        listar(carros);

        //Alterar
        System.out.println("\nDigite a posição para alterar: ");
        int posAlterar = sc.nextInt();
        sc.nextLine(); // limpar buffer

        if (posAlterar >= 0 && posAlterar <carros.length) {
            System.out.println("Digite um novo nome de carro:");
            carros[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida");
        } 
        System.out.println("\nLista após alteração:");
        listar(carros);

        //Remover
        System.out.println("\nDigite a posição para remover: ");
        int posRemover = sc.nextInt();
        
        if(posRemover >= 0 && posRemover < carros.length) {
            //deslocar elementos
            for (int i = posRemover; i < carros.length - 1; i++) {
                carros[i] = carros[i + 1];
            }
            carros[carros.length - 1] = null;
        } else {
            System.out.println("Posição inválida");
        }
        System.out.println("\nLista após remoção:");
        listar(carros);

        sc.close();
    }
    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }
}
