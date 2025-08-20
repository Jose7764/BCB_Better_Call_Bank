package org.example.Model;

public abstract class Conta {
    private String numero;
    private Cliente titular;
    private double saldo;

    public Conta(String numero, Cliente titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public Cliente getTitular() { return titular; }
    public void setTitular(Cliente titular) { this.titular = titular; }

    public double getSaldo() { return saldo; }
    public void setSaldo(double saldo) { this.saldo = saldo; }

    @Override
    public String toString() {
        return "| Conta nº: " + numero + " | Titular: " + titular.getNome() + " | Saldo: " + saldo;
    }
}
