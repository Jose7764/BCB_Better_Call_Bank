package org.example.view;

import org.example.service.ArredondamentoDeBotao;

import javax.swing.*;
import java.awt.*;

public class Home {

    public static void telaHome() {

        JFrame home = new JFrame("Home");
        home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        home.setExtendedState(JFrame.MAXIMIZED_BOTH);
        home.setLayout(null);

        JPanel panelPrincipal = new JPanel(null);
        panelPrincipal.setBounds(0, 0, 1920, 1080);
        home.add(panelPrincipal);


        JPanel painelLogin = new JPanel(null);
        painelLogin.setBackground(new Color(0, 82, 255));
        painelLogin.setBounds(0, 0, 1920, 1080);
        panelPrincipal.add(painelLogin);


        JPanel painelEsquerdo = new JPanel(null);
        painelEsquerdo.setBackground(new Color(255, 255, 255));
        painelEsquerdo.setBounds(0, 0, 350, 1080);
        painelLogin.add(painelEsquerdo);


        JLabel labelImagem = new JLabel();
        try {

            ImageIcon icon = new ImageIcon("src/main/java/org/example/view/baixados.png");


            Image imagem = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

            labelImagem.setIcon(new ImageIcon(imagem));



            labelImagem.setBounds(5, -50, 350, 200);

            painelEsquerdo.add(labelImagem);
        } catch (Exception ex) {
            ex.printStackTrace();
            labelImagem.setText("Erro ao carregar imagem.");
            labelImagem.setBounds(0, 0, 350, 1080);
            painelEsquerdo.add(labelImagem);
        }

        String[] opcoes = {"PIX", "Fatura", "Cartões", "Crédito", "Empréstimos", "Configurações" , "Perfil"};
        for (int i = 0; i < opcoes.length; i++) {
            JButton btn = new JButton(opcoes[i]);
            btn.setForeground(new Color(255,255,255));
            btn.setBackground(new Color(98, 179, 138));
            btn.setBounds(40, 120 + (i * 80), 260, 60);
            painelEsquerdo.add(btn);
        }

        home.setVisible(true);
        home.repaint();


        JPanel painelDireito = new JPanel(null);
        painelDireito.setBackground(new Color(255, 255, 255));
        painelDireito.setBounds(1450, 0, 550, 1080);
        painelLogin.add(painelDireito);

        JLabel lblCartoes = new JLabel("Cartões", SwingConstants.CENTER);
        lblCartoes.setForeground(new Color(0, 0, 0));
        lblCartoes.setBounds(120, 10, 250, 30);
        lblCartoes.setFont(new Font("Arial", Font.BOLD, 16));

        JPanel areaCartoes = new JPanel();
        areaCartoes.setBackground(new Color(98, 179, 138));
        areaCartoes.setBounds(70, 50, 350, 210);

        JLabel lblHistorico = new JLabel("Histórico de Transferências", SwingConstants.CENTER);
        lblHistorico.setBounds(110, 520, 250, 30);
        lblHistorico.setForeground(new Color(0, 0, 0));
        lblHistorico.setFont(new Font("Arial", Font.BOLD, 14));

        JTextArea areaHistorico = new JTextArea();
        areaHistorico.setBackground(new Color(98, 179, 138));
        areaHistorico.setBounds(70, 560, 350, 370);

        painelDireito.add(lblCartoes);
        painelDireito.add(areaCartoes);
        painelDireito.add(lblHistorico);
        painelDireito.add(areaHistorico);

        JLabel labelImagemDireita = new JLabel();
        try {

            ImageIcon icon = new ImageIcon("src/main/java/org/example/view/baixados.png");
            Image imagem = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
            labelImagemDireita.setIcon(new ImageIcon(imagem));
            labelImagemDireita.setBounds(5, -50, 350, 200);

            painelEsquerdo.add(labelImagemDireita);
        } catch (Exception ex) {
            ex.printStackTrace();
            labelImagemDireita.setText("Erro ao carregar imagem.");
            labelImagemDireita.setBounds(0, 0, 350, 1080);
            painelDireito.add(labelImagemDireita);
        }



        home.setVisible(true);
        home.repaint();


        JPanel painelCentral = new JPanel();
        painelCentral.setLayout(null);
        painelCentral.setBackground(new Color(21, 122, 80, 255));
        painelCentral.setBounds(200, 0, 1300, 1100);

        JLabel lblSaldo = new JLabel("R$ 12.345,67", SwingConstants.CENTER);
        lblSaldo.setForeground(new Color(255,255,255));
        lblSaldo.setFont(new Font("Arial", Font.BOLD, 26));
        lblSaldo.setBounds(200, 100, 350, 50);

        JButton btnDepositar = new JButton("Depositar");
        btnDepositar.setBounds(300, 800, 100, 40);

        JButton btnSacar = new JButton("Sacar");
        btnSacar.setBounds(900, 800, 100, 40);


        painelCentral.add(lblSaldo);
        painelCentral.add(btnDepositar);
        painelCentral.add(btnSacar);


        painelLogin.add(painelCentral);



        JLabel labelUsuario = new JLabel("BETTER CALL BANK");
        labelUsuario.setForeground(Color.black);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        labelUsuario.setBounds(109, 34, 200, 30);
        painelEsquerdo.add(labelUsuario);
        painelLogin.setVisible(true);


        JButton botaoHome = new JButton("🏠 Home");
        botaoHome.setFont(new Font("Arial", Font.BOLD, 20));
        botaoHome.setBounds(547, 790, 150, 70);
        botaoHome.setForeground(new Color(37,255, 164));
        botaoHome.setBorderPainted(false);
        botaoHome.setFocusPainted(false);
        botaoHome.setContentAreaFilled(false);
        botaoHome.setVisible(true);
        painelEsquerdo.add(botaoHome);


    }
}
