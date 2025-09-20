package org.example.view;

import org.example.service.ArredondamentoDeBotao;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class TelaCadastro {




    public void clickCadastroAdm() {
        JFrame CadastroADM = new JFrame("Login do Adm");
        CadastroADM.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        CadastroADM.setExtendedState(JFrame.MAXIMIZED_BOTH);
        CadastroADM.setLayout(null);

        JPanel panelPrincipal = new JPanel(null);
        panelPrincipal.setBounds(0, 0, 1920, 1080);
        CadastroADM.add(panelPrincipal);


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


        CadastroADM.setVisible(true);



        JPanel painelLogin = new JPanel();
        painelLogin.setLayout(null);
        painelLogin.setBackground(new Color(251, 251, 251));
        painelLogin.setBounds(0, 0, 1400, 1400);
        painelFundo.add(painelLogin);

        CadastroADM.setVisible(true);



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

        ArredondamentoDeBotao botaoLogar = new ArredondamentoDeBotao("Cadastrar",6);
        botaoLogar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoLogar.setForeground(Color.white);
        botaoLogar.setBounds(175, 708, 620, 70);
        botaoLogar.setBackground(new Color(0, 182, 115));
        botaoLogar.setBorderPainted(false);
        botaoLogar.setFocusPainted(false);
        painelLogin.add(botaoLogar);

        JButton botaoCadastrar = new JButton("Fazer login");
        botaoCadastrar.setFont(new Font("Arial", Font.BOLD, 20));
        botaoCadastrar.setBounds(547, 790, 150, 70);
        botaoCadastrar.setForeground(new Color(0, 128, 255));
        botaoCadastrar.setBorderPainted(false);
        botaoCadastrar.setFocusPainted(false);
        botaoCadastrar.setContentAreaFilled(false);
        painelLogin.add(botaoCadastrar);

        botaoCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            CadastroADM.dispose();

            }
        });




        JLabel labelEmail = new JLabel("Email:");
        labelEmail.setForeground(Color.black);
        labelEmail.setFont(new Font("Arial", Font.BOLD, 20));
        labelEmail.setBounds(175, 439, 200, 30);
        painelLogin.add(labelEmail);
        labelEmail.setVisible(true);

        JTextField campoEmail = new JTextField();
        campoEmail.setBounds(175, 475, 620, 50);
        campoEmail.setFont(new Font("Arial", Font.BOLD, 25));
        painelLogin.add(campoEmail);
        campoEmail.setVisible(true);

        JLabel labelUsuario = new JLabel("Usuário:");
        labelUsuario.setForeground(Color.black);
        labelUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        labelUsuario.setBounds(175, 339, 200, 30);
        painelLogin.add(labelUsuario);
        labelUsuario.setVisible(true);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(175, 375, 620, 50);
        campoUsuario.setFont(new Font("Arial", Font.BOLD, 20));
        painelLogin.add(campoUsuario);
        campoUsuario.setVisible(true);

        JLabel labelSenha = new JLabel("Senha:");
        labelSenha.setForeground(Color.black);
        labelSenha.setFont(new Font("Arial", Font.BOLD, 20));
        labelSenha.setBounds(175, 539, 200, 30);
        painelLogin.add(labelSenha);
        labelSenha.setVisible(true);


        JPasswordField campoSenha = new JPasswordField();
        campoSenha.setBounds(175, 575, 560, 50);
        campoSenha.setFont(new Font("Arial", Font.BOLD, 20));
        painelLogin.add(campoSenha);
        campoSenha.setVisible(true);

        ArredondamentoDeBotao botaoOlho = new ArredondamentoDeBotao("👁️",6);
        botaoOlho.setFont(new Font("SansSerif", Font.PLAIN, 16));
        botaoOlho.setFocusable(false);
        botaoOlho.setBounds(740, 575, 50, 50);

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


        JLabel labelNovo = new JLabel("Você já possui uma conta?");
        labelNovo.setBounds(300, 800, 620, 50);
        labelNovo.setFont(new Font("Arial", Font.BOLD, 20));
        painelLogin.add(labelNovo);
        labelNovo.setVisible(true);

        botaoLogar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {



            }
        });





        CadastroADM.setVisible(true);
        CadastroADM.repaint();
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