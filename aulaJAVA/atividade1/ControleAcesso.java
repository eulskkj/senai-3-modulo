import java.util.Scanner;

public class ControleAcesso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String senhaSistema = "123ABC"; // senha pré-configurada

        System.out.print("Digite a senha: ");
        String senhaDigitada = sc.nextLine();

        if (senhaDigitada.equals(senhaSistema)) {
            System.out.println("PORTA ABERTA");
        } else {
            System.out.println("SENHA NAO CONFERE");
        }

        sc.close();
    }
}
