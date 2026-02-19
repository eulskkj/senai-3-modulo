import java.util.Scanner;

public class Repeticao04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String resp = "sim";

        while (resp.equalsIgnoreCase("sim")) {
            System.out.println("Deseja continuar? (sim/nao)");
            resp = sc.nextLine();
        }
        sc.close();
    }
}
