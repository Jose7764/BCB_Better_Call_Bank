package org.example;

import org.example.view.Caixa;
import org.example.service.Banco;

public class Main {
    public static void main(String[] args) {

        Caixa view = new Caixa();
        Banco funcoes = new Banco();

        while (true) {
            int opcao = view.menu();

            funcoes.menuExecuta(opcao);

        }
    }
}