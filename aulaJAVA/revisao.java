import java.util.Scanner;

public class revisao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] onibus = new int[4];
        int[] assentos = new int[4];

        String[] passageiros = new String[20];
        int[] reservaOnibus = new int[20];

        int qtdOnibus = 0;
        int totalReservas = 0;

        int opcao;

        while (true) {

            System.out.println("\nBEM-VINDO AO SISTEMA");
            System.out.println("1- REGISTRAR O NÚMERO DE CADA ÔNIBUS");
            System.out.println("2- REGISTRAR ASSENTOS DISPONÍVEIS");
            System.out.println("3- RESERVAR PASSAGEM");
            System.out.println("4- CONSULTAR ÔNIBUS");
            System.out.println("5- CONSULTAR PASSAGEIRO");
            System.out.println("0- SAIR");
            System.out.println("Digite a opção desejada:");
            opcao = sc.nextInt();
            sc.nextLine();

            if (opcao == 0) {
                System.out.println("Encerrando sistema...");
                break;
            }

            switch (opcao) {

                case 1:

                    if (qtdOnibus == onibus.length) {
                        System.out.println("Não é possível registrar mais ônibus!");
                        break;
                    }

                    System.out.println("Digite o número do ônibus:");
                    onibus[qtdOnibus] = sc.nextInt();
                    sc.nextLine();

                    qtdOnibus++;

                    System.out.println("Ônibus registrado com sucesso!");
                    break;

                case 2:

                    if (qtdOnibus == 0) {
                        System.out.println("Nenhum ônibus registrado!");
                        break;
                    }

                    for (int i = 0; i < qtdOnibus; i++) {

                        System.out.println("Digite os assentos disponíveis do ônibus " + onibus[i] + ":");
                        assentos[i] = sc.nextInt();

                    }

                    break;

                case 3:

                    if (totalReservas == 20) {
                        System.out.println("Limite de reservas atingido!");
                        break;
                    }

                    System.out.println("Digite o número do ônibus:");
                    int numBus = sc.nextInt();
                    sc.nextLine();

                    int indice = -1;

                    for (int i = 0; i < qtdOnibus; i++) {

                        if (onibus[i] == numBus) {
                            indice = i;
                        }

                    }

                    if (indice == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    if (assentos[indice] == 0) {
                        System.out.println("Não há assentos disponíveis para este ônibus!");
                        break;
                    }

                    System.out.println("Digite o nome do passageiro:");
                    String nome = sc.nextLine();

                    passageiros[totalReservas] = nome;
                    reservaOnibus[totalReservas] = numBus;

                    totalReservas++;
                    assentos[indice]--;

                    System.out.println("Reserva realizada com sucesso!");

                    break;

                case 4:

                    System.out.println("Digite o número do ônibus:");
                    int consultaBus = sc.nextInt();
                    sc.nextLine();

                    boolean encontrouBus = false;
                    boolean temReserva = false;

                    for (int i = 0; i < qtdOnibus; i++) {

                        if (onibus[i] == consultaBus) {
                            encontrouBus = true;
                        }

                    }

                    if (!encontrouBus) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    System.out.println("Reservas do ônibus " + consultaBus + ":");

                    for (int i = 0; i < totalReservas; i++) {

                        if (reservaOnibus[i] == consultaBus) {
                            System.out.println(passageiros[i]);
                            temReserva = true;
                        }

                    }

                    if (!temReserva) {
                        System.out.println("Não há reservas realizadas para este ônibus!");
                    }

                    break;

                case 5:

                    System.out.println("Digite o nome do passageiro:");
                    String buscaNome = sc.nextLine();

                    boolean encontrou = false;

                    for (int i = 0; i < totalReservas; i++) {

                        if (passageiros[i].equalsIgnoreCase(buscaNome)) {

                            System.out.println("Reserva no ônibus: " + reservaOnibus[i]);
                            encontrou = true;

                        }

                    }

                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }

                    break;

                default:
                    System.out.println("Opção inválida!");

            }

        }

        sc.close();
    }
}