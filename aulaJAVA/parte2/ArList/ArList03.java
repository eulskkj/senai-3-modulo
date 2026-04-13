package ArList;
import java.util.Scanner;

public class ArList03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        java.util.ArrayList<String> nomes = new java.util.ArrayList<>();

        //Adicionando
        for(int i=0; i< 3; i++) {
            System.out.println("Informe o nome" +(i+1));
            nomes.add(sc.nextLine());
        }
        //Listando
        for (int i=0; i<nomes.size(); i++){
            System.out.println(i+ " - " +nomes.get(i));
        }
        //Alterar
        int indiceAlterar;
        do {
            System.out.println("\nInforme o índice que deseja altarar.");
            indiceAlterar = sc.nextInt();
            sc.nextLine();
            if (indiceAlterar < 0 || indiceAlterar>=nomes.size());
            System.out.println("indice inválido");
        } while (indiceAlterar < 0 || indiceAlterar>=nomes.size());
        System.out.println("Digite o novo nome:");
        String novoNome = sc.nextLine();
        nomes.set(indiceAlterar, novoNome);
        System.out.println("Nome alterado com sucesso!");
        
        //Remover
        int indice;
        do {
            System.out.println("Informe o indice para remover");
            indice = sc.nextInt();
            
            if (indice<0 || indice>=nomes.size()) {
                System.out.println("Indice inválido");
            }
        } while (indice <0 || indice>= nomes.size());
        nomes.remove(indice);
        System.out.println("Nome removido");
        for (String nome : nomes) {
            System.out.println(nome);
        }
        sc.close();
    }
}
