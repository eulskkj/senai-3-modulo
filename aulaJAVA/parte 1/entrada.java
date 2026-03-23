import java.util.Scanner;

public class entrada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome");
        String nome = sc.next();

        System.out.println("Informe a idade");
        int idade = sc.nextInt();

        System.out.println("Seu nome é "+nome+" você tem "+idade+" anos");
        sc.close();
    }
}
