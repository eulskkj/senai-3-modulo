import java.util.Scanner;

public class GestaoReservasOnibus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX_ONIBUS = 4;
        final int MAX_RESERVAS = 20;

        // frota
        int qtdOnibus = 0;
        int[] numerosOnibus = new int[MAX_ONIBUS];
        int[] assentosDisponiveis = new int[MAX_ONIBUS];

        // reservas
        String[] nomesPassageiros = new String[MAX_RESERVAS];
        int[] onibusDaReserva = new int[MAX_RESERVAS];
        int totalReservas = 0;

        boolean frotaRegistrada = false;
        boolean assentosRegistrados = false;

        int opc;

        do {
            System.out.println("\n===== Gestão de Reservas de Ônibus =====");
            System.out.println("1 - Registrar número dos ônibus");
            System.out.println("2 - Registrar assentos disponíveis por ônibus");
            System.out.println("3 - Reservar passagem");
            System.out.println("4 - Consultar reservas por ônibus");
            System.out.println("5 - Consultar reservas por passageiro");
            System.out.println("6 - Encerrar");
            System.out.print("Escolha: ");

            // leitura segura de inteiro (sem método)
            while (!sc.hasNextInt()) {
                System.out.print("Digite um número válido: ");
                sc.next(); // descarta entrada inválida
            }
            opc = sc.nextInt();
            sc.nextLine(); // limpar buffer

            switch (opc) {
                case 1: {
                    System.out.print("Informe a quantidade de ônibus (máx. " + MAX_ONIBUS + "): ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    qtdOnibus = sc.nextInt();
                    sc.nextLine();

                    if (qtdOnibus < 1 || qtdOnibus > MAX_ONIBUS) {
                        System.out.println("Quantidade inválida! Deve ser entre 1 e " + MAX_ONIBUS + ".");
                        qtdOnibus = 0;
                        frotaRegistrada = false;
                        assentosRegistrados = false;
                        break;
                    }

                    for (int i = 0; i < qtdOnibus; i++) {
                        System.out.print("Número do ônibus [" + (i + 1) + "]: ");
                        while (!sc.hasNextInt()) {
                            System.out.print("Digite um número válido: ");
                            sc.next();
                        }
                        numerosOnibus[i] = sc.nextInt();
                        sc.nextLine();
                    }

                    // zera assentos quando reconfigurar frota
                    for (int i = 0; i < MAX_ONIBUS; i++) {
                        assentosDisponiveis[i] = 0;
                    }

                    // (opcional) se mudar frota, faz sentido limpar reservas antigas
                    totalReservas = 0;
                    for (int i = 0; i < MAX_RESERVAS; i++) {
                        nomesPassageiros[i] = null;
                        onibusDaReserva[i] = 0;
                    }

                    frotaRegistrada = true;
                    assentosRegistrados = false;
                    System.out.println("Frota registrada com sucesso!");
                    break;
                }

                case 2: {
                    if (!frotaRegistrada) {
                        System.out.println("Registre primeiro os ônibus (opção 1).");
                        break;
                    }

                    for (int i = 0; i < qtdOnibus; i++) {
                        int ass;
                        while (true) {
                            System.out.print("Assentos disponíveis para o ônibus " + numerosOnibus[i] + ": ");
                            while (!sc.hasNextInt()) {
                                System.out.print("Digite um número válido: ");
                                sc.next();
                            }
                            ass = sc.nextInt();
                            sc.nextLine();

                            if (ass < 0) {
                                System.out.println("Quantidade inválida! Assentos não podem ser negativos. Tente novamente.");
                            } else {
                                break;
                            }
                        }
                        assentosDisponiveis[i] = ass;
                    }

                    assentosRegistrados = true;
                    System.out.println("Assentos registrados com sucesso!");
                    break;
                }

                case 3: {
                    if (!frotaRegistrada || !assentosRegistrados) {
                        System.out.println("Registre frota (1) e assentos (2) antes de reservar.");
                        break;
                    }
                    if (totalReservas >= MAX_RESERVAS) {
                        System.out.println("Limite máximo de " + MAX_RESERVAS + " reservas atingido!");
                        break;
                    }

                    System.out.print("Informe o número do ônibus para reservar: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    int numBus = sc.nextInt();
                    sc.nextLine();

                    // achar índice do ônibus (sem método)
                    int idx = -1;
                    for (int i = 0; i < qtdOnibus; i++) {
                        if (numerosOnibus[i] == numBus) {
                            idx = i;
                            break;
                        }
                    }

                    if (idx == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    if (assentosDisponiveis[idx] <= 0) {
                        System.out.println("Não há assentos disponíveis para este ônibus!");
                        break;
                    }

                    // ler nome não vazio (sem método)
                    String nome;
                    while (true) {
                        System.out.print("Nome do passageiro: ");
                        nome = sc.nextLine().trim();
                        if (nome.isEmpty()) {
                            System.out.println("Nome não pode ficar vazio. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    // efetivar reserva
                    nomesPassageiros[totalReservas] = nome;
                    onibusDaReserva[totalReservas] = numBus;
                    totalReservas++;
                    assentosDisponiveis[idx]--;

                    System.out.println("Reserva realizada com sucesso!");
                    break;
                }

                case 4: {
                    if (!frotaRegistrada) {
                        System.out.println("Registre primeiro os ônibus (opção 1).");
                        break;
                    }

                    System.out.print("Informe o número do ônibus para consulta: ");
                    while (!sc.hasNextInt()) {
                        System.out.print("Digite um número válido: ");
                        sc.next();
                    }
                    int consultaBus = sc.nextInt();
                    sc.nextLine();

                    // verificar se existe (sem método)
                    int idxConsulta = -1;
                    for (int i = 0; i < qtdOnibus; i++) {
                        if (numerosOnibus[i] == consultaBus) {
                            idxConsulta = i;
                            break;
                        }
                    }

                    if (idxConsulta == -1) {
                        System.out.println("Este ônibus não existe!");
                        break;
                    }

                    boolean encontrou = false;
                    System.out.println("Reservas para o ônibus " + consultaBus + ":");
                    for (int i = 0; i < totalReservas; i++) {
                        if (onibusDaReserva[i] == consultaBus) {
                            System.out.println("- " + nomesPassageiros[i]);
                            encontrou = true;
                        }
                    }
                    if (!encontrou) {
                        System.out.println("Não há reservas realizadas para este ônibus!");
                    }

                    System.out.println("Assentos restantes para o ônibus " + consultaBus + ": " + assentosDisponiveis[idxConsulta]);
                    break;
                }

                case 5: {
                    if (totalReservas == 0) {
                        System.out.println("Não há reservas no sistema.");
                        break;
                    }

                    String nomeConsulta;
                    while (true) {
                        System.out.print("Informe o nome do passageiro: ");
                        nomeConsulta = sc.nextLine().trim();
                        if (nomeConsulta.isEmpty()) {
                            System.out.println("Nome não pode ficar vazio. Tente novamente.");
                        } else {
                            break;
                        }
                    }

                    boolean achou = false;
                    System.out.println("Reservas do passageiro \"" + nomeConsulta + "\":");
                    for (int i = 0; i < totalReservas; i++) {
                        if (nomesPassageiros[i] != null && nomesPassageiros[i].equalsIgnoreCase(nomeConsulta)) {
                            System.out.println("- Ônibus " + onibusDaReserva[i]);
                            achou = true;
                        }
                    }
                    if (!achou) {
                        System.out.println("Não há reservas realizadas para este passageiro!");
                    }
                    break;
                }

                case 6:
                    System.out.println("Encerrando o sistema. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opc != 6);

        sc.close();
    }
}