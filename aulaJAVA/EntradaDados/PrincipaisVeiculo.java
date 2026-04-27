package EntradaDados;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrincipaisVeiculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        ArrayList<Veiculo> lista = new ArrayList<>();

        try{
            System.out.println("Escolha o tipo: 1-Carro, 2-Moto");
            int tipo = sc.nextInt();
            sc.nextLine();

            System.out.println("Digite o modelo: ");
            String modelo = sc.nextLine();

            System.out.println("Digite o ano: ");
            int ano = sc.nextInt();

            if (tipo == 1) {
                lista.add(new Carro(modelo, ano));
            } else if (tipo == 2) {
                lista.add(new Moto(modelo, ano));
            } else {
                System.out.println("Tipo inválido!");
            }
       

            System.out.println("Adicionado com sucesso!");

        } catch(InputMismatchException e) {
            System.out.println("Erro: Digite um ano válido!");
        } catch(IllegalArgumentException e) {
            System.out.println("Erro: "+e.getMessage());
        }
        for (Veiculo v : lista) {
            v.exibir();

        }
        sc.close();
    }
}
