import java.util.Scanner;

public class Vetor05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] nomes = new String [3];

        for(int i=0;i<nomes.length;i++){
            System.out.println("Informe o "+i+"º nome: ");
            nomes[i] = sc.nextLine();

            System.out.println("O nome é: "+nomes[i]);
        }
        for (String nome : nomes){
            System.out.println(nome);
        }
        sc.close(); 
    }
}
