package org.example.Model;

public class ContaCorrente extends Conta {

    public ContaCorrente(String numero, Cliente titular, double saldo) {
        super(numero, titular, saldo);
    }


    public void mostrarDetalhes() {
        System.out.println("| Conta Corrente: " + super.toString());
    }

    public String toString() {
        return "| Conta Corrente: " + super.toString();
    }
}
