import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Digite o nome: ");
            String nome = sc.nextLine();
            if (nome.isEmpty()) {
                throw new Exception("O campo nome não pode estar vazio");
            }
            System.out.println("Nome digitado: "+nome);
        } catch(Exception e) {
            System.out.println("Erro: "+e.getMessage());
        }
        finally{
            System.out.println("Fim");
        }
        sc.close();
    }
}
