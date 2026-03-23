
package parte2;

public class PessoaApp {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("João", 25);
        Pessoa p2 = new Pessoa("Paula", 60);
        
        System.out.println("O nome da pessoa é " + p1.getNome());
        System.out.println("A idade da pessoa é " + p1.getIdade());
        
        p1.setNome("Carla");
        p1.setIdade(30);

        System.out.println("O nome da pessoa é " + p1.getNome());
        System.out.println("A idade da pessoa é " + p1.getIdade());
        
        p2.setNome("Paulo");
        p2.setIdade(30);

        System.out.println("O nome da pessoa é " + p2.getNome());
        System.out.println("A idade da pessoa é " + p2.getIdade());
    }
}