package org.example.service;

import org.example.Model.*;
import org.example.view.Caixa;

import java.util.List;
import java.util.ArrayList;

public class Banco {

    Caixa view = new Caixa();
    private List<Conta> contas = new ArrayList<>();

    public void menuExecuta (int opcao){


        switch (opcao) {

            case 1:

                Cliente cliente = view.cadastrarCliente();
                int ecolhaTipoConta = view.escolhaTipoDeConta();

                String numeroConta = view.cadastrarNumeroConta();
                double saldo = view.cadastrarSaldo();

                Conta conta = null;
                if (ecolhaTipoConta == 1) {
                    conta = new ContaCorrente(numeroConta, cliente, saldo);
                } else if (ecolhaTipoConta == 2){
                    conta = new ContaPoupanca(numeroConta, cliente, saldo);
                }else {
                    System.out.println("Erro");
                }

                contas.add(conta);

                break;
        }
    }


}
