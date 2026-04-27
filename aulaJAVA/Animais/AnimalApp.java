package Animais;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Animal> pokemons = new ArrayList<>();

        pokemons.add(new Pikachu());
        pokemons.add(new Charizard());
        pokemons.add(new Blastoise());

        int opcao;

        do{
            System.out.println("=== Menu ===");
            System.out.println("1 - Adicionar novo Pokemon");
            System.out.println("2 - Emitir som dos Pokemons");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Escolha o Pokemon:");
                    System.out.println("1 - Pikachu");
                    System.out.println("2 - Charizard");
                    System.out.println("3 - Blastoise");
                    int escolha = sc.nextInt();
                    sc.nextLine();

                    if(escolha == 1) {
                        pokemons.add(new Pikachu());
                        System.out.println("Pikachu adicionado!");
                    } else if (escolha == 2) {
                        pokemons.add(new Charizard());
                        System.out.println("Charizard adicionado!");
                    } else if (escolha == 3) {
                        pokemons.add(new Blastoise());
                        System.out.println("Blastoise adicionado!");
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;

                case 2:
                   if (pokemons.isEmpty()) {
                        System.out.println("Nenhum Pokemon cadastrado!");
                        break;

                   }

                   System.out.println("Escolha o pokemon");
                   for( int i=0; i<pokemons.size(); i++) {
                        System.out.println((i+1) + " - " + pokemons.get(i).getClass().getSimpleName());
                   }
                     int escolhaSom = sc.nextInt();
                        sc.nextLine();
                    if (escolhaSom >= 1 && escolhaSom <= pokemons.size()) {
                        pokemons.get(escolhaSom - 1).emitirSom();
                    } else {
                        System.out.println("Opção inválida!");
                    }
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        sc.close();
    }
}