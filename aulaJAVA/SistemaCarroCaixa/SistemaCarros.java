package SistemaCarroCaixa;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SistemaCarros {
    private static ArrayList<Carro> listaCarros = new ArrayList<>();

    public static void main(String[] args) {
        int opcao = 0;

        do {
            String menu = "--- SISTEMA DE CADASTRO DE CARROS ---\n" +
                          "1. Cadastrar Carro\n" +
                          "2. Listar Carros\n" +
                          "3. Detalhar Carro\n" +
                          "4. Alterar Carro\n" +
                          "5. Remover Carro\n" +
                          "6. Gravar em Arquivo (carros.txt)\n" +
                          "7. Sair\n\n" +
                          "Escolha uma opção:";

            try {
                String input = JOptionPane.showInputDialog(menu);
                if (input == null) break; // Fecha se clicar em Cancelar
                opcao = Integer.parseInt(input);

                
                   switch (opcao) {
                        case 1:
                            cadastrar();
                            break;
                        case 2:
                            listar();
                            break;
                        case 3:
                            detalhar();
                            break;
                        case 4:
                            alterar();
                            break;
                        case 5:
                            remover();
                            break;
                        case 6:
                            gravarArquivo();
                            break;
                        case 7:
                            JOptionPane.showMessageDialog(null, "Saindo do sistema...");
                            break;
                        default:
                            JOptionPane.showMessageDialog(null, "Opção inválida!");
                            break;
                    }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
            }
        } while (opcao != 7);
    }

    private static void cadastrar() {
        String marca = JOptionPane.showInputDialog("Marca:");
        String modelo = JOptionPane.showInputDialog("Modelo:");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));

        listaCarros.add(new Carro(marca, modelo, ano));
        JOptionPane.showMessageDialog(null, "Carro cadastrado com sucesso!");
    }

    private static void listar() {
        if (listaCarros.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Nenhum carro cadastrado.");
            return;
        }
        StringBuilder lista = new StringBuilder("--- Lista de Carros ---\n");
        for (int i = 0; i < listaCarros.size(); i++) {
            lista.append(i).append(" - ")
                 .append(listaCarros.get(i).getMarca()).append(" ")
                 .append(listaCarros.get(i).getModelo()).append("\n");
        }
        JOptionPane.showMessageDialog(null, lista.toString());
    }

    private static void detalhar() {
        int index = Integer.parseInt(JOptionPane.showInputDialog("Digite o número (índice) do carro:"));
        if (index >= 0 && index < listaCarros.size()) {
            JOptionPane.showMessageDialog(null, listaCarros.get(index).exibirDetalhes());
        } else {
            JOptionPane.showMessageDialog(null, "Índice inválido!");
        }
    }

    private static void alterar() {
        int index = Integer.parseInt(JOptionPane.showInputDialog("Índice do carro para alterar:"));
        if (index >= 0 && index < listaCarros.size()) {
            String marca = JOptionPane.showInputDialog("Nova Marca:");
            String modelo = JOptionPane.showInputDialog("Novo Modelo:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Novo Ano:"));
            
            listaCarros.set(index, new Carro(marca, modelo, ano));
            JOptionPane.showMessageDialog(null, "Dados atualizados!");
        }
    }

    private static void remover() {
        int index = Integer.parseInt(JOptionPane.showInputDialog("Índice do carro para remover:"));
        if (index >= 0 && index < listaCarros.size()) {
            listaCarros.remove(index);
            JOptionPane.showMessageDialog(null, "Carro removido!");
        }
    }

    private static void gravarArquivo() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("carros.txt"))) {
            for (Carro c : listaCarros) {
                writer.write("Marca: " + c.getMarca() + " | Modelo: " + c.getModelo() + " | Ano: " + c.getAno());
                writer.newLine();
            }
            JOptionPane.showMessageDialog(null, "Dados gravados em 'carros.txt' com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar arquivo: " + e.getMessage());
        }
    }
}