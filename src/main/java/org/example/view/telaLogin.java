package org.example.view;

import org.example.service.ArredondamentoDeBotao;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class telaLogin {




    public void clickLoginAdm() {
        JFrame LoginADM = new JFrame("Login do Adm");
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
            ImageIcon icon = new ImageIcon("bcb.png");
            Image imagem = icon.getImage().getScaledInstance(1000, 550, Image.SCALE_SMOOTH);
            labelImagem.setIcon(new ImageIcon(imagem));
            labelImagem.setAlignmentX(Component.CENTER_ALIGNMENT);
        } catch (Exception ex) {
            ex.printStackTrace();
            labelImagem.setText("Erro ao carregar imagem.");
        }

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

        ArredondamentoDeBotao botaoLogar = new ArredondamentoDeBotao("Fazer Login",6);
        botaoLogar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoLogar.setBounds(175, 630, 620, 70);
        botaoLogar.setBackground(new Color(2, 128, 2));
        botaoLogar.setBorderPainted(false);
        botaoLogar.setFocusPainted(false);
        painelLogin.add(botaoLogar);

        ArredondamentoDeBotao botaoCadastrar = new ArredondamentoDeBotao("Criar uma Conta",6);
        botaoCadastrar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoCadastrar.setBounds(175, 770, 620, 70);
        botaoCadastrar.setBackground(new Color(2, 128, 2));
        botaoCadastrar.setBorderPainted(false);
        botaoCadastrar.setFocusPainted(false);
        painelLogin.add(botaoCadastrar);


        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setForeground(Color.black);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        labelUsuario.setBounds(175, 300, 200, 30);
        painelLogin.add(labelUsuario);
        labelUsuario.setVisible(true);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(175, 335, 620, 50);
        campoUsuario.setFont(new Font("Arial", Font.BOLD, 34));
        painelLogin.add(campoUsuario);
        campoUsuario.setVisible(true);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(Color.black);
        labelSenha.setFont(new Font("Arial", Font.BOLD, 20));
        labelSenha.setBounds(175, 415, 200, 30);
        painelLogin.add(labelSenha);
        labelSenha.setVisible(true);

        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(175, 465, 620, 50);
        campoSenha.setFont(new Font("Arial", Font.BOLD, 34));
        painelLogin.add(campoSenha);
        campoSenha.setVisible(true);


        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });



        JLabel labelLembrarMe = new JLabel("Lembrar-me:");
        labelLembrarMe.setForeground(Color.black);
        labelLembrarMe.setFont(new Font("Arial", Font.BOLD, 20));
        labelLembrarMe.setBounds(175, 540, 200, 30);
        painelLogin.add(labelLembrarMe);
        labelLembrarMe.setVisible(true);




        LoginADM.setVisible(true);
    }

    private boolean authenticateUserAndRegisterLogin(String email, String senha) {
        boolean authenticated = false;

        try (Connection conn = getConnection()) {
            String sql = "SELECT id FROM usuarios WHERE email = ? AND senha = ?";
            try (PreparedStatement ps = conn.prepareStatement(sql)) {
                ps.setString(1, email);
                ps.setString(2, senha);

                try (ResultSet rs = ps.executeQuery()) {
                    if (rs.next()) {
                        authenticated = true;
                        int usuarioId = rs.getInt("id");

                        // 2. Inserir registro de login na tabela logins
                        String insertSql = "INSERT INTO logins (usuario_id) VALUES (?)";
                        try (PreparedStatement psInsert = conn.prepareStatement(insertSql)) {
                            psInsert.setInt(1, usuarioId);
                            psInsert.executeUpdate();
                        }
                    }
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao autenticar: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return authenticated;
    }

    private Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://maglev.proxy.rlwy.net:21239/railway";
        String user = "root";
        String password = "rapOEQXmJZLYFiltlqGiDkyUWGUVTQMJ";

        return DriverManager.getConnection(url, user, password);
    }

}
