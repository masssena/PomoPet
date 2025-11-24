package com.pomopet.view;

import com.pomopet.data.User;
import com.pomopet.data.GerenciadorUsuario;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class TelaLogin extends javax.swing.JFrame {
    
    final String URL_DESTINO = "https://bit.ly/m/PomoPets";
    
    public TelaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlPrincipal = new javax.swing.JPanel();
        Logo = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        FormSection = new javax.swing.JPanel();
        FormBox = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel3 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pfSenha = new javax.swing.JPasswordField();
        Buttons = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        btnCadastro = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Footer = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblLinkWebsite = new javax.swing.JLabel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(176, 224, 230));
        setMinimumSize(new java.awt.Dimension(900, 675));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMaximumSize(new java.awt.Dimension(2440, 50));
        Header.setMinimumSize(new java.awt.Dimension(1280, 50));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(211, 211, 211));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sejam Bem Vindos Ao ");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        Header.add(jLabel1);

        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        pnlPrincipal.setBackground(new java.awt.Color(176, 224, 230));
        pnlPrincipal.setToolTipText("");
        pnlPrincipal.setAutoscrolls(true);
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.Y_AXIS));

        Logo.setBackground(new java.awt.Color(176, 224, 230));
        Logo.setMaximumSize(new java.awt.Dimension(2440, 250));
        Logo.setMinimumSize(new java.awt.Dimension(200, 250));
        Logo.setOpaque(false);
        Logo.setPreferredSize(new java.awt.Dimension(200, 250));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pomopet/resources/logopomopet.png"))); // NOI18N
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 30, 15));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Logo.add(jLabel2);
        Logo.add(filler6);

        pnlPrincipal.add(Logo);

        FormSection.setBackground(new java.awt.Color(176, 224, 230));
        FormSection.setMaximumSize(new java.awt.Dimension(2440, 300));
        FormSection.setMinimumSize(new java.awt.Dimension(350, 300));
        FormSection.setPreferredSize(new java.awt.Dimension(350, 300));

        FormBox.setBackground(new java.awt.Color(240, 255, 240));
        FormBox.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(240, 255, 240), 2, true));
        FormBox.setMinimumSize(new java.awt.Dimension(450, 250));
        FormBox.setPreferredSize(new java.awt.Dimension(450, 250));
        FormBox.setLayout(new javax.swing.BoxLayout(FormBox, javax.swing.BoxLayout.Y_AXIS));
        FormBox.add(filler2);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Usuário:");
        jLabel3.setAlignmentX(0.5F);
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 1, 15, 1));
        jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel3.setMaximumSize(new java.awt.Dimension(150, 25));
        jLabel3.setMinimumSize(new java.awt.Dimension(25, 25));
        jLabel3.setPreferredSize(new java.awt.Dimension(30, 25));
        FormBox.add(jLabel3);

        txtUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtUsuario.setMaximumSize(new java.awt.Dimension(250, 30));
        txtUsuario.setPreferredSize(new java.awt.Dimension(250, 30));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });
        FormBox.add(txtUsuario);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Senha:");
        jLabel4.setAlignmentX(0.5F);
        jLabel4.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel4.setIconTextGap(0);
        jLabel4.setMaximumSize(new java.awt.Dimension(60, 25));
        jLabel4.setMinimumSize(new java.awt.Dimension(60, 25));
        FormBox.add(jLabel4);

        pfSenha.setMaximumSize(new java.awt.Dimension(250, 30));
        pfSenha.setPreferredSize(new java.awt.Dimension(250, 30));
        FormBox.add(pfSenha);

        Buttons.setBackground(new java.awt.Color(240, 255, 240));
        Buttons.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 1, 1, 1));
        Buttons.setMaximumSize(new java.awt.Dimension(32767, 80));

        btnLogin.setBackground(new java.awt.Color(255, 140, 0));
        btnLogin.setText("Login");
        btnLogin.setAlignmentX(0.5F);
        btnLogin.setMaximumSize(new java.awt.Dimension(120, 40));
        btnLogin.setMinimumSize(new java.awt.Dimension(120, 40));
        btnLogin.setPreferredSize(new java.awt.Dimension(120, 40));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        Buttons.add(btnLogin);

        btnCadastro.setBackground(new java.awt.Color(255, 140, 0));
        btnCadastro.setText("Cadastre-se");
        btnCadastro.setAlignmentX(0.5F);
        btnCadastro.setMaximumSize(new java.awt.Dimension(120, 40));
        btnCadastro.setMinimumSize(new java.awt.Dimension(120, 40));
        btnCadastro.setPreferredSize(new java.awt.Dimension(120, 40));
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });
        Buttons.add(btnCadastro);

        FormBox.add(Buttons);
        FormBox.add(filler3);

        FormSection.add(FormBox);
        FormSection.add(filler1);

        pnlPrincipal.add(FormSection);
        pnlPrincipal.add(filler4);

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(51, 51, 51));
        Footer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Footer.setMaximumSize(new java.awt.Dimension(2440, 50));
        Footer.setMinimumSize(new java.awt.Dimension(1280, 50));
        Footer.setPreferredSize(new java.awt.Dimension(1280, 50));
        Footer.setLayout(new javax.swing.BoxLayout(Footer, javax.swing.BoxLayout.LINE_AXIS));
        Footer.add(filler5);

        lblLinkWebsite.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblLinkWebsite.setForeground(new java.awt.Color(211, 211, 211));
        lblLinkWebsite.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLinkWebsite.setText("Desenvolvido por PomoPets ©");
        lblLinkWebsite.setAlignmentX(0.5F);
        lblLinkWebsite.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblLinkWebsite.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLinkWebsiteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLinkWebsiteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLinkWebsiteMouseExited(evt);
            }
        });
        Footer.add(lblLinkWebsite);
        Footer.add(filler7);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroActionPerformed
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCadastroActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed

        // Coleta dados do formulário ->
        String usuarioDigitado = txtUsuario.getText().trim();
        String senhaDigitada = new String(pfSenha.getPassword()); 

        // Verifica se os dados foram preenchidos ->
        if (usuarioDigitado.isEmpty() || senhaDigitada.isEmpty()) {
            JOptionPane.showMessageDialog(this, 
                "Usuário e senha devem ser preenchidos.", 
                "Erro de Login", JOptionPane.WARNING_MESSAGE);
            return; 
        }
        
        // Consulta a lista de usuários ->
        GerenciadorUsuario gerenciador = GerenciadorUsuario.getInstance();
        User usuarioLogado = gerenciador.realizarLogin(usuarioDigitado, senhaDigitada);

        // Verifica se existe o usuario que tentou fazer login ->
        if (usuarioLogado != null) {
            JOptionPane.showMessageDialog(this, 
                "Bem-vindo(a), " + usuarioLogado.getName() + "!", 
                "Login Efetuado", JOptionPane.INFORMATION_MESSAGE);
        
            this.dispose();
            TelaPrincipal telaPrincipal = new TelaPrincipal();
            telaPrincipal.setVisible(true);
        
        } else {
            JOptionPane.showMessageDialog(this, 
                "Usuário ou senha inválidos. Tente novamente ou cadastre-se.", 
                "Erro de Autenticação", JOptionPane.ERROR_MESSAGE);
        }    
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void lblLinkWebsiteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkWebsiteMouseClicked
        try {
                // Tenta verificar se a API Desktop é suportada
                if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                    
                    // Abre o URL no navegador padrão
                    Desktop.getDesktop().browse(new URI(URL_DESTINO));
                } else {
                    // Mensagem se a abertura automática não for suportada (raro em desktops)
                    JOptionPane.showMessageDialog(null, 
                        "Não foi possível abrir o link automaticamente. Acesse: " + URL_DESTINO, 
                        "Abrir Link", 
                        JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception ex) {
                // Trata erros como URL malformado ou falha de sistema
                JOptionPane.showMessageDialog(null, 
                    "Erro ao tentar abrir o link: " + ex.getMessage(), 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_lblLinkWebsiteMouseClicked

    private void lblLinkWebsiteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkWebsiteMouseEntered
        lblLinkWebsite.setText("<html><u>Desenvolvido por PomoPets ©</u></html>");
    }//GEN-LAST:event_lblLinkWebsiteMouseEntered

    private void lblLinkWebsiteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLinkWebsiteMouseExited
        lblLinkWebsite.setText("Desenvolvido por PomoPets ©");
    }//GEN-LAST:event_lblLinkWebsiteMouseExited

    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttons;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel FormBox;
    private javax.swing.JPanel FormSection;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Logo;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnLogin;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblLinkWebsite;
    private javax.swing.JPasswordField pfSenha;
    private javax.swing.JPanel pnlPrincipal;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
