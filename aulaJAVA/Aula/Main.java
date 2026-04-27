package Aula;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um animal: ");
        System.out.println("1 - Cachorro");
        System.out.println("2 - Gato");
        int escolha = sc.nextInt();

        Animal animalSelecionado;

        if(escolha == 1) {
            animalSelecionado = new Cachorro();
        } else if (escolha == 2) {
            animalSelecionado = new Gato();
        } else {
        System.out.println("Opção inválida!");
        sc.close();
        return;
        }

        animalSelecionado.emitirSom();

        





        sc.close();
    }
}