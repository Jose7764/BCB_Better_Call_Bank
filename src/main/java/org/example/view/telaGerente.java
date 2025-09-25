package org.example.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class telaGerente {

    public static void tela (){
        JFrame frame = new JFrame("Cubanco - Sistema Bancário");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1200, 700);
        frame.setLayout(null); // Layout na raça
        frame.setLocationRelativeTo(null);


        JPanel menuEsquerdo = new JPanel();
        menuEsquerdo.setBackground(new Color(5, 38, 89));
        menuEsquerdo.setBounds(0, 0, 200, 700);
        menuEsquerdo.setLayout(null);

        String[] opcoes = {"PIX", "Fatura", "Cartões", "Crédito", "Empréstimos", "Configurações"};
        for (int i = 0; i < opcoes.length; i++) {
            JButton btn = new JButton(opcoes[i]);
            btn.setBounds(20, 30 + (i * 50), 160, 40);
            menuEsquerdo.add(btn);
        }

        JPanel painelDireito = new JPanel();
        painelDireito.setLayout(null);
        painelDireito.setBackground(new Color(125, 160, 202));
        painelDireito.setBounds(950, 0, 250, 700);

        JLabel lblCartoes = new JLabel("Cartões", SwingConstants.CENTER);
        lblCartoes.setBounds(0, 10, 250, 30);
        lblCartoes.setFont(new Font("Arial", Font.BOLD, 16));

        JTextArea areaCartoes = new JTextArea("• Cartão Visa - Ativo\n• Cartão Master - Bloqueado");
        areaCartoes.setEditable(false);
        JScrollPane scrollCartoes = new JScrollPane(areaCartoes);
        scrollCartoes.setBounds(10, 50, 230, 250);

        JLabel lblHistorico = new JLabel("Histórico de Transferências", SwingConstants.CENTER);
        lblHistorico.setBounds(0, 320, 250, 30);
        lblHistorico.setFont(new Font("Arial", Font.BOLD, 14));

        JTextArea areaHistorico = new JTextArea("• -500,00 para José\n• +1200,00 de Maria\n• -50,00 Netflix");
        areaHistorico.setEditable(false);
        JScrollPane scrollHistorico = new JScrollPane(areaHistorico);
        scrollHistorico.setBounds(10, 360, 230, 300);

        painelDireito.add(lblCartoes);
        painelDireito.add(scrollCartoes);
        painelDireito.add(lblHistorico);
        painelDireito.add(scrollHistorico);


        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(null);
        painelCentral.setBackground(new Color(193, 232, 255));
        painelCentral.setBounds(200, 0, 750, 700);

        JLabel lblSaldo = new JLabel("Saldo Atual: R$ 12.345,67", SwingConstants.CENTER);
        lblSaldo.setFont(new Font("Arial", Font.BOLD, 26));
        lblSaldo.setBounds(200, 100, 350, 50);

        JButton btnDepositar = new JButton("Depositar");
        btnDepositar.setBounds(250, 200, 100, 40);

        JButton btnSacar = new JButton("Sacar");
        btnSacar.setBounds(400, 200, 100, 40);

        JTextArea areaAvisos = new JTextArea("Avisos do Banco:\n- Nova atualização disponível!\n- Promoção de empréstimos com taxa reduzida.");
        areaAvisos.setEditable(false);
        JScrollPane scrollAvisos = new JScrollPane(areaAvisos);
        scrollAvisos.setBounds(200, 300, 350, 150);

        painelCentral.add(lblSaldo);
        painelCentral.add(btnDepositar);
        painelCentral.add(btnSacar);
        painelCentral.add(scrollAvisos);

        // Montagem final
        frame.add(menuEsquerdo);
        frame.add(painelCentral);
        frame.add(painelDireito);

        frame.setVisible(true);
    }

}
