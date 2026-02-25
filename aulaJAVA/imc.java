import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("informe sua altura");
        Double altura = sc.nextDouble();

        System.out.println("informe seu peso");
        Double peso = sc.nextDouble();

        Double altura2 = altura * altura;
        Double imc = peso / altura2;

        System.out.println("Seu IMC é de : "+imc+"");
        
        sc.close();
    }

}
