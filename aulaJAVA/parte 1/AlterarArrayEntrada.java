import java.util.Scanner;

public class AlterarArrayEntrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // definir tamanho do array
        System.out.print("Quantos elementos deseja inserir? ");
        int tamanho = sc.nextInt();
        sc.nextLine();

        String[] nomes = new String[tamanho];

        // inserir dados
        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite um nome: ");
            nomes[i] = sc.nextLine();
        }

        // mostrar array atual
        System.out.println("\nArray atual:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println(i + " - " + nomes[i]);
        }

        // escolher posição para alterar
        System.out.print("\nDigite a posição que deseja alterar: ");
        int posicao = sc.nextInt();
        sc.nextLine();

        // validar posição
        if (posicao >= 0 && posicao < nomes.length) {

            System.out.print("Digite o novo nome: ");
            nomes[posicao] = sc.nextLine();

            System.out.println("\nArray após alteração:");
            for (String nome : nomes) {
                System.out.println(nome);
            }

        } else {
            System.out.println("Posição inválida!");
        }

        sc.close();
    }

}
