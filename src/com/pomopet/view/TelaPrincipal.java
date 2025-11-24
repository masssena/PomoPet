package com.pomopet.view;

import java.awt.Desktop;
import java.net.URI;
import com.pomopet.data.GerenciadorUsuario;
import com.pomopet.data.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class TelaPrincipal extends javax.swing.JFrame {

    final String URL_DESTINO = "https://bit.ly/m/PomoPets";
    
    public TelaPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        Main = new javax.swing.JPanel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(290, 0), new java.awt.Dimension(32767, 0));
        Section = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel1 = new javax.swing.JLabel();
        Timer = new javax.swing.JPanel();
        TimerButtons = new javax.swing.JPanel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        NavigateButtons = new javax.swing.JPanel();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        ButtonsPanel = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        AmigosButton = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        GruposButton = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        PetButton = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Footer = new javax.swing.JPanel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblLinkWebsite = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(176, 224, 230));
        setMinimumSize(new java.awt.Dimension(900, 675));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMaximumSize(new java.awt.Dimension(2440, 50));
        Header.setMinimumSize(new java.awt.Dimension(1280, 50));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        Main.setBackground(new java.awt.Color(176, 224, 230));
        Main.setMaximumSize(new java.awt.Dimension(1280, 700));
        Main.setMinimumSize(new java.awt.Dimension(1280, 700));
        Main.setLayout(new javax.swing.BoxLayout(Main, javax.swing.BoxLayout.LINE_AXIS));
        Main.add(filler10);

        Section.setBackground(new java.awt.Color(240, 255, 240));
        Section.setMaximumSize(new java.awt.Dimension(900, 500));
        Section.setMinimumSize(new java.awt.Dimension(500, 700));
        Section.setPreferredSize(new java.awt.Dimension(900, 700));
        Section.setLayout(new javax.swing.BoxLayout(Section, javax.swing.BoxLayout.Y_AXIS));
        Section.add(filler3);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Quanto Tempo Vamos Estudar Hoje ?");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Section.add(jLabel1);

        Timer.setBackground(new java.awt.Color(240, 255, 240));

        javax.swing.GroupLayout TimerLayout = new javax.swing.GroupLayout(Timer);
        Timer.setLayout(TimerLayout);
        TimerLayout.setHorizontalGroup(
            TimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        TimerLayout.setVerticalGroup(
            TimerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        Section.add(Timer);

        TimerButtons.setBackground(new java.awt.Color(240, 255, 240));

        javax.swing.GroupLayout TimerButtonsLayout = new javax.swing.GroupLayout(TimerButtons);
        TimerButtons.setLayout(TimerButtonsLayout);
        TimerButtonsLayout.setHorizontalGroup(
            TimerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 805, Short.MAX_VALUE)
        );
        TimerButtonsLayout.setVerticalGroup(
            TimerButtonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        Section.add(TimerButtons);
        Section.add(filler2);

        Main.add(Section);

        NavigateButtons.setBackground(new java.awt.Color(176, 224, 230));
        NavigateButtons.setMaximumSize(new java.awt.Dimension(290, 700));
        NavigateButtons.setMinimumSize(new java.awt.Dimension(130, 500));
        NavigateButtons.setPreferredSize(new java.awt.Dimension(290, 700));
        NavigateButtons.setLayout(new javax.swing.BoxLayout(NavigateButtons, javax.swing.BoxLayout.Y_AXIS));
        NavigateButtons.add(filler5);

        ButtonsPanel.setBackground(new java.awt.Color(176, 224, 230));
        ButtonsPanel.setMaximumSize(new java.awt.Dimension(200, 180));
        ButtonsPanel.setPreferredSize(new java.awt.Dimension(200, 180));
        ButtonsPanel.setLayout(new javax.swing.BoxLayout(ButtonsPanel, javax.swing.BoxLayout.Y_AXIS));
        ButtonsPanel.add(filler7);

        AmigosButton.setText("Amigos");
        AmigosButton.setAlignmentX(0.5F);
        AmigosButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AmigosButton.setDefaultCapable(false);
        AmigosButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AmigosButton.setMaximumSize(new java.awt.Dimension(150, 50));
        AmigosButton.setMinimumSize(new java.awt.Dimension(75, 25));
        AmigosButton.setPreferredSize(new java.awt.Dimension(100, 50));
        AmigosButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AmigosButtonActionPerformed(evt);
            }
        });
        ButtonsPanel.add(AmigosButton);
        ButtonsPanel.add(filler8);

        GruposButton.setText("Grupos");
        GruposButton.setAlignmentX(0.5F);
        GruposButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        GruposButton.setDefaultCapable(false);
        GruposButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        GruposButton.setMaximumSize(new java.awt.Dimension(150, 50));
        GruposButton.setMinimumSize(new java.awt.Dimension(75, 25));
        GruposButton.setPreferredSize(new java.awt.Dimension(100, 50));
        GruposButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GruposButtonActionPerformed(evt);
            }
        });
        ButtonsPanel.add(GruposButton);
        ButtonsPanel.add(filler9);

        PetButton.setText("Pet");
        PetButton.setAlignmentX(0.5F);
        PetButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PetButton.setDefaultCapable(false);
        PetButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PetButton.setMaximumSize(new java.awt.Dimension(150, 50));
        PetButton.setMinimumSize(new java.awt.Dimension(75, 25));
        PetButton.setPreferredSize(new java.awt.Dimension(100, 50));
        PetButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PetButtonMouseClicked(evt);
            }
        });
        PetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PetButtonActionPerformed(evt);
            }
        });
        ButtonsPanel.add(PetButton);
        ButtonsPanel.add(filler6);

        NavigateButtons.add(ButtonsPanel);
        NavigateButtons.add(filler4);

        Main.add(NavigateButtons);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(51, 51, 51));
        Footer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Footer.setMaximumSize(new java.awt.Dimension(2440, 50));
        Footer.setMinimumSize(new java.awt.Dimension(1280, 50));
        Footer.setPreferredSize(new java.awt.Dimension(1280, 50));
        Footer.setLayout(new javax.swing.BoxLayout(Footer, javax.swing.BoxLayout.LINE_AXIS));
        Footer.add(filler11);

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
        Footer.add(filler12);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AmigosButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AmigosButtonActionPerformed
        TelaAmigos telaAmigos = new TelaAmigos();
        telaAmigos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AmigosButtonActionPerformed

    private void GruposButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GruposButtonActionPerformed
        TelaGrupos telaGrupos = new TelaGrupos();
        telaGrupos.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GruposButtonActionPerformed

    private void PetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PetButtonActionPerformed
        // Obtém o Usuário Logado ->
    
        User usuario = GerenciadorUsuario.getInstance().getUsuarioLogado();
        if (usuario == null) {
            JOptionPane.showMessageDialog(this, "Erro: Nenhum usuário está logado.", "Atenção", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // Abre a Tela de Escolha de Pet ->

        if (usuario.getStudentPet()== null) {
            TelaEscolherPet telaEscolherPet = new TelaEscolherPet();
            telaEscolherPet.setVisible(true);
            this.dispose();
        } else {
        // Abre a Tela de Exibição do Pet ->
            TelaPet telaExibicao = new TelaPet();
            telaExibicao.setVisible(true);
            telaExibicao.atualizarExibicaoPet(); 
            this.dispose();
        }
    }//GEN-LAST:event_PetButtonActionPerformed

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

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // Salva todos os dados antes de fechar o programa ->       
            GerenciadorUsuario.getInstance().salvarDados();
            System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void PetButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PetButtonMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PetButtonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AmigosButton;
    private javax.swing.JPanel ButtonsPanel;
    private javax.swing.JPanel Footer;
    private javax.swing.JButton GruposButton;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel NavigateButtons;
    private javax.swing.JButton PetButton;
    private javax.swing.JPanel Section;
    private javax.swing.JPanel Timer;
    private javax.swing.JPanel TimerButtons;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblLinkWebsite;
    // End of variables declaration//GEN-END:variables
}
