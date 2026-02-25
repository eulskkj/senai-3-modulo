import java.util.Scanner;

public class CrudArrayEntradaSimples {
  
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // criar array
        String[] nomes = new String[3];

       
        // CADASTRAR
        
        System.out.println("=== CADASTRO DE NOMES ===");
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }

        
        // LISTAR
       
        System.out.println("\nLista atual:");
        listar(nomes);

        
        // ALTERAR
       
        System.out.print("\nDigite a posição para alterar: ");
        int posAlterar = sc.nextInt();
        sc.nextLine(); // limpar buffer

        if (posAlterar >= 0 && posAlterar < nomes.length) {
            System.out.print("Digite o novo nome: ");
            nomes[posAlterar] = sc.nextLine();
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista após alteração:");
        listar(nomes);

       
        // REMOVER
       
        System.out.print("\nDigite a posição para remover: ");
        int posRemover = sc.nextInt();

        if (posRemover >= 0 && posRemover < nomes.length) {

            // deslocar elementos
            for (int i = posRemover; i < nomes.length - 1; i++) {
                nomes[i] = nomes[i + 1];
            }

            nomes[nomes.length - 1] = null;
        } else {
            System.out.println("Posição inválida!");
        }

        System.out.println("\nLista após remoção:");
        listar(nomes);

        sc.close();
    }

    // método para listar
    public static void listar(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + " - " + array[i]);
        }
    }

}           