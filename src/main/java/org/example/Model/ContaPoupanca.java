package org.example.Model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String numero, Cliente titular, double saldo) {
        super(numero, titular, saldo);
    }


    public void mostrarDetalhes() {
        System.out.println("| Conta Poupança: " + super.toString());
    }

    @Override
    public String toString() {
        return "| Conta Poupança: " + super.toString();
    }
}
