package CadastroContaBancaria;

public class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        if (titular == null || titular.trim().isEmpty()) {
            throw new IllegalArgumentException("O nome do titular não pode estar vazio.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    // Getters
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do saque deve ser positivo.");
        }
        if (valor > this.saldo) {
            throw new IllegalArgumentException("Saldo insuficiente para realizar o saque.");
        }
        this.saldo -= valor;
    }

    public void exibirDados() {
        System.out.printf("Titular: %s | Saldo: R$ %.2f%n", titular, saldo);
    }
}