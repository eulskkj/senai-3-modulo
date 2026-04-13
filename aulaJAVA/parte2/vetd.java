
import java.util.Scanner;
public class vetd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] nome = new String[3];
        int[] idade = new int[3];

        for (int i=0; i<3; i++) {
            System.out.println("informe o nome: "); 
            nome[i] = sc.nextLine();

            System.out.println("informe a idade: ");
            idade[i] = sc.nextInt();

            sc.nextLine(); // Limpar o buffer do scanner

        

        }
        for (int i=0; i<3; i++) {
            System.out.println("Nome: " + nome[i] + " Idade: " + idade[i]);
        }

        sc.close();
    }
}