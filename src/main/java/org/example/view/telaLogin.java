package org.example.view;

import org.example.service.ArredondamentoDeBotao;
import org.example.view.TelaCadastro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class telaLogin {

    TelaCadastro telaCadastro = new TelaCadastro();


    public void clickLoginAdm() {
        JFrame LoginADM = new JFrame("Login");
        LoginADM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LoginADM.setExtendedState(JFrame.MAXIMIZED_BOTH);
        LoginADM.setLayout(null);

        JPanel panelPrincipal = new JPanel(null);
        panelPrincipal.setBounds(0, 0, 1920, 1080);
        LoginADM.add(panelPrincipal);


        JPanel painelFundo2 = new JPanel(null);
        painelFundo2.setBackground(new Color(2, 128, 2));
        painelFundo2.setBounds(0, 0, 960, 1080);
        panelPrincipal.add(painelFundo2);

        JLabel labelImagem = new JLabel();
        try {
            // Carrega a imagem do diretório correto
            ImageIcon icon = new ImageIcon("src/main/java/org/example/view/imagem2.jpg");
            // Ajusta a imagem para ocupar toda a altura do painel verde (1080px)
            Image imagem = icon.getImage().getScaledInstance(960, 1080, Image.SCALE_SMOOTH);
            labelImagem.setIcon(new ImageIcon(imagem));
            labelImagem.setHorizontalAlignment(JLabel.CENTER);
            labelImagem.setVerticalAlignment(JLabel.CENTER);
        } catch (Exception ex) {
            ex.printStackTrace();
            labelImagem.setText("Erro ao carregar imagem.");
        }

        // A imagem ocupa toda a área do painel verde
        labelImagem.setBounds(0, 0, 960, 1080);
        labelImagem.setVisible(true);
        painelFundo2.add(labelImagem);

        JPanel painelFundo = new JPanel(null);
        painelFundo.setBackground(Color.WHITE);
        painelFundo.setBounds(960, 0, 960, 1080);
        panelPrincipal.add(painelFundo);


        LoginADM.setVisible(true);



        JPanel painelLogin = new JPanel();
        painelLogin.setLayout(null);
        painelLogin.setBackground(new Color(251, 251, 251));
        painelLogin.setBounds(0, 0, 1400, 1400);
        painelFundo.add(painelLogin);

        LoginADM.setVisible(true);



        JLabel labelBemVindo = new JLabel("Bem vindo ao");
        labelBemVindo.setForeground(Color.black);
        labelBemVindo.setFont(new Font("Arial", Font.BOLD, 60));
        labelBemVindo.setBounds(175, 90, 800, 50);
        painelLogin.add(labelBemVindo);
        labelBemVindo.setVisible(true);

        JLabel labelBemVindo2 = new JLabel("Better Call Bank");
        labelBemVindo2.setForeground(new Color(0, 182, 115));
        labelBemVindo2.setFont(new Font("Arial", Font.BOLD, 60));
        labelBemVindo2.setBounds(175, 180, 800, 50);
        painelLogin.add(labelBemVindo2);
        labelBemVindo2.setVisible(true);

        ArredondamentoDeBotao botaoLogar = new ArredondamentoDeBotao("Fazer login",6);
        botaoLogar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoLogar.setForeground(Color.white);
        botaoLogar.setBounds(175, 675, 620, 70);
        botaoLogar.setBackground(new Color(0, 182, 115));
        botaoLogar.setBorderPainted(false);
        botaoLogar.setFocusPainted(false);
        painelLogin.add(botaoLogar);

        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Home.telaHome();

            }
        });


        JButton botaoCadastrar = new JButton("Registre-se");
        botaoCadastrar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoCadastrar.setBounds(515, 753, 150, 70);
        botaoCadastrar.setForeground(new Color(0, 128, 255));
        botaoCadastrar.setBorderPainted(false);
        botaoCadastrar.setFocusPainted(false);
        botaoCadastrar.setContentAreaFilled(false);
        painelLogin.add(botaoCadastrar);


        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                telaCadastro.clickCadastroAdm();

            }
        });


        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setForeground(Color.black);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        labelUsuario.setBounds(175, 345, 200, 30);
        painelLogin.add(labelUsuario);
        labelUsuario.setVisible(true);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(175, 380, 620, 50);
        campoUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        painelLogin.add(campoUsuario);
        campoUsuario.setVisible(true);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(Color.black);
        labelSenha.setFont(new Font("Arial", Font.BOLD, 20));
        labelSenha.setBounds(175, 477, 200, 30);
        painelLogin.add(labelSenha);
        labelSenha.setVisible(true);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(175, 510, 560, 50);
        campoSenha.setFont(new Font("Arial", Font.BOLD, 20));
        painelLogin.add(campoSenha);
        campoSenha.setVisible(true);

        ArredondamentoDeBotao botaoOlho = new ArredondamentoDeBotao("👁️",6);
        botaoOlho.setFont(new Font("SansSerif", Font.PLAIN, 16));
        botaoOlho.setFocusable(false);
        botaoOlho.setBounds(740, 510, 50, 50);

        botaoOlho.addActionListener(new ActionListener() {
            private boolean mostrando = false;

            @Override
            public void actionPerformed(ActionEvent e) {
                if (mostrando) {
                    campoSenha.setEchoChar('•');
                    mostrando = false;
                } else {
                    campoSenha.setEchoChar((char) 0);
                    mostrando = true;
                }
            }
        });

        painelLogin.add(botaoOlho);


        JLabel labelNovo = new JLabel("Você é novo aqui?");
        labelNovo.setBounds(350, 763, 620, 50);
        labelNovo.setFont(new Font("Arial", Font.BOLD, 20));
        painelLogin.add(labelNovo);
        labelNovo.setVisible(true);

        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });








        LoginADM.setVisible(true);
        LoginADM.repaint();
    }


}