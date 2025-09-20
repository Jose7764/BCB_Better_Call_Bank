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

        // Painel principal de login
        JPanel painelLogin = new JPanel(null);
        painelLogin.setBackground(new Color(251, 251, 251));
        painelLogin.setBounds(0, 0, 1920, 1080);
        panelPrincipal.add(painelLogin);

        // Painel esquerdo vermelho
        JPanel painelEsquerdo = new JPanel(null);
        painelEsquerdo.setBackground(new Color(255, 255, 255));
        painelEsquerdo.setBounds(0, 0, 350, 1080);
        painelLogin.add(painelEsquerdo);

        // Label com imagem no painel esquerdo
        // Label com imagem no painel
        JLabel labelImagem = new JLabel();
        try {
            // Carrega a imagem
            ImageIcon icon = new ImageIcon("src/main/java/org/example/view/baixados.png");

            // Ajusta a imagem para caber no painel esquerdo
            Image imagem = icon.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);

            labelImagem.setIcon(new ImageIcon(imagem));


            // Ocupa todo painelEsquerdo sem cortar
            labelImagem.setBounds(5, -50, 350, 200);

            painelEsquerdo.add(labelImagem);
        } catch (Exception ex) {
            ex.printStackTrace();
            labelImagem.setText("Erro ao carregar imagem.");
            labelImagem.setBounds(0, 0, 350, 1080);
            painelEsquerdo.add(labelImagem);
        }


        // Exibe a tela
        home.setVisible(true);
        home.repaint();


        JPanel painelDireito = new JPanel(null);
        painelDireito.setBackground(new Color(255, 255, 255));
        painelDireito.setBounds(1550, 0, 450, 1080);
        painelLogin.add(painelDireito);


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


        // Exibe a tela
        home.setVisible(true);
        home.repaint();


        JLabel labelUsuario = new JLabel("BETTER CALL BANK");
        labelUsuario.setForeground(Color.black);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        labelUsuario.setBounds(109, 34, 200, 30);
        painelEsquerdo.add(labelUsuario);
        painelLogin.setVisible(true);

        JLabel labelMenu = new JLabel("Menu");
        labelMenu.setForeground(Color.black);
        labelMenu.setFont(new Font("Arial", Font.BOLD, 20));
        labelMenu.setBounds(55, 240, 200, 30);
        painelEsquerdo.add(labelMenu);
        painelLogin.setVisible(true);

        JButton botaoHome = new JButton("🏠 Home");
        botaoHome.setFont(new Font("Arial", Font.BOLD, 20));
        botaoHome.setBounds(547, 790, 150, 70);
        botaoHome.setForeground(new Color(0, 128, 255));
        botaoHome.setBorderPainted(false);
        botaoHome.setFocusPainted(false);
        botaoHome.setContentAreaFilled(false);
        botaoHome.setVisible(true);
        painelEsquerdo.add(botaoHome);


    }
}
