package MostarErroException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 5000.92;

        try{
            System.out.println("SSaldo disponível: R$ "+saldo);
            System.out.println("Digite quando quer sacar: ");

            double valorSaque = sc.nextDouble();

            if (valorSaque <= 0) {
                System.out.println("Erro: o valor tem que ser maior que 0");
            } else if (valorSaque > saldo) {
                System.out.println("Erro: Saldo insuficiente para esta operação!");
            } else {
                saldo -= valorSaque;
                System.out.println("Ssque realizado com sucesso! Novo saldo: "+saldo);
            }

        } catch(InputMismatchException e) {
            System.out.println("Erro de digitação: Por favor, use apenas vírgula e números.");
        } catch(Exception e) {
            System.out.println("Erro inesperado: "+e.getMessage());
        } 
        finally {
            System.out.println("Operação finalizada");
        }
        
        sc.close();
    }
}
