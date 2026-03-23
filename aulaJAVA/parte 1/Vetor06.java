import java.util.Scanner;

public class Vetor06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nome = new String[3];
        int[] idade = new int[3];

        for (int i=0; i<3; i++) {
            System.out.println("Informe o nome da pessoa: ");
            nome[i] = sc.nextLine();

            System.out.println("Informe a idade da pessoa: ");
            idade[i] = sc.nextInt();
            sc.nextLine(); 
            
        }
        for(int i= 0; i<3; i++){
        System.out.println(nome[i]+ "-"+ idade[i]+ " anos");
        }
        sc.close();
    }
}
