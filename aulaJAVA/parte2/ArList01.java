public class ArList01 {
    public static void main(String[] args) {

        //Adicionar
        java.util.ArrayList<String> nomes = new java.util.ArrayList<>();
        nomes.add("Maria");
        nomes.add("João");
        nomes.add("Ana");

        //Listando
        for (int i=0; i< nomes.size(); i++) {
            System.out.println((i+1) + " - " +nomes.get(i));
        }
        //Alterar
        nomes.set(2, "Carlos");
        
        //Remover
        nomes.remove("João");
        System.out.println("================");
        for(String nome: nomes) {
            System.out.println(nome);
        }
    }
    
}
