package com.pomopet.view;

import java.awt.Desktop;
import java.net.URI;
import javax.swing.JOptionPane;
import com.pomopet.data.Pet;
import com.pomopet.data.GerenciadorUsuario;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class TelaPet extends javax.swing.JFrame {
    
    final String URL_DESTINO = "https://bit.ly/m/PomoPets";
    
    public TelaPet() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        atualizarExibicaoPet();
    }    

// Método de Atualização Imagem ->
    public void atualizarExibicaoPet() {
        // Busca o Pet do usuário logado
        
        Pet pet = GerenciadorUsuario.getInstance().getUsuarioLogado().getStudentPet();  
        if (pet == null) {
            lblStatusPet.setText("Nenhum Pet Escolhido.");
            lblImagemPet.setIcon(null);
            barraXp.setValue(0);
            lblTextoXp.setText("XP: N/A");
            return;
        }
        
        // Define o Status (Nome e XP/Level) ->s
        lblStatusPet.setText(pet.getName() + " - XP Total: " + pet.getXp());
        
        // Cálculo e Atualização da Barra de Progresso ->
        
        int xpTotal = pet.getXp();
        int xpMarcoAtual = 0;
        int xpProximoMarco = 0;

        if (xpTotal < 200) {
            xpMarcoAtual = 0;
            xpProximoMarco = 200;
        } else if (xpTotal < 500) {
            xpMarcoAtual = 200;
            xpProximoMarco = 500;
        } else {
            xpMarcoAtual = 500;
            xpProximoMarco = 999999999;
        }

        int xpNoNivelAtual = xpTotal - xpMarcoAtual;
        int xpNecessarioParaProxMarco = xpProximoMarco - xpMarcoAtual;
        
        barraXp.setMaximum(xpNecessarioParaProxMarco);
        barraXp.setValue(xpNoNivelAtual);
        lblTextoXp.setText("Próxima Evolução: " + xpNoNivelAtual + " / " + xpNecessarioParaProxMarco + " XP");
        
        // Atualiza a Imagem do Pet ->
        try {
            String caminhoImagem = "src/com/pomopet/resources/" + pet.getImage(); 
            ImageIcon icon = new ImageIcon(caminhoImagem);
            
            // Redimensiona a imagem para caber no JLabel ->
            
            Image img = icon.getImage().getScaledInstance(
                    lblImagemPet.getWidth(), 
                    lblImagemPet.getHeight(), 
                    Image.SCALE_SMOOTH
            );
            lblImagemPet.setIcon(new ImageIcon(img));
            
        } catch (Exception e) {
            lblImagemPet.setText("Imagem não encontrada!");
            System.err.println("Erro ao carregar imagem: " + e.getMessage());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        pnlPrincipal = new javax.swing.JPanel();
        NomePet = new javax.swing.JPanel();
        lblStatusPet = new javax.swing.JLabel();
        ImageBox = new javax.swing.JPanel();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        lblImagemPet = new javax.swing.JLabel();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        ProgressBox = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        barraXp = new javax.swing.JProgressBar();
        lblTextoXp = new javax.swing.JLabel();
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        ButtonBox = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btnVoltar = new javax.swing.JButton();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        btnEvoluir = new javax.swing.JButton();
        Footer = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblLinkWebsite = new javax.swing.JLabel();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(176, 224, 230));
        setMinimumSize(new java.awt.Dimension(900, 675));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMaximumSize(new java.awt.Dimension(2440, 50));
        Header.setMinimumSize(new java.awt.Dimension(1280, 50));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));
        getContentPane().add(Header, java.awt.BorderLayout.NORTH);

        pnlPrincipal.setBackground(new java.awt.Color(176, 224, 230));
        pnlPrincipal.setToolTipText("");
        pnlPrincipal.setAutoscrolls(true);
        pnlPrincipal.setMaximumSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setMinimumSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setPreferredSize(new java.awt.Dimension(1280, 700));
        pnlPrincipal.setLayout(new javax.swing.BoxLayout(pnlPrincipal, javax.swing.BoxLayout.Y_AXIS));

        NomePet.setBackground(new java.awt.Color(176, 224, 230));
        NomePet.setMaximumSize(new java.awt.Dimension(32767, 50));
        NomePet.setMinimumSize(new java.awt.Dimension(600, 50));
        NomePet.setPreferredSize(new java.awt.Dimension(1280, 50));

        lblStatusPet.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblStatusPet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatusPet.setText("Nome do Pet ");
        lblStatusPet.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        NomePet.add(lblStatusPet);

        pnlPrincipal.add(NomePet);

        ImageBox.setBackground(new java.awt.Color(176, 224, 230));
        ImageBox.setMaximumSize(new java.awt.Dimension(2440, 800));
        ImageBox.setMinimumSize(new java.awt.Dimension(200, 250));
        ImageBox.setOpaque(false);
        ImageBox.setPreferredSize(new java.awt.Dimension(200, 600));
        ImageBox.setLayout(new javax.swing.BoxLayout(ImageBox, javax.swing.BoxLayout.Y_AXIS));
        ImageBox.add(filler8);

        lblImagemPet.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImagemPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/pomopet/resources/logopomopet.png"))); // NOI18N
        lblImagemPet.setAlignmentX(0.5F);
        lblImagemPet.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 15, 30, 15));
        lblImagemPet.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lblImagemPet.setMaximumSize(new java.awt.Dimension(400, 400));
        lblImagemPet.setMinimumSize(new java.awt.Dimension(300, 300));
        lblImagemPet.setPreferredSize(new java.awt.Dimension(350, 350));
        ImageBox.add(lblImagemPet);
        ImageBox.add(filler6);

        pnlPrincipal.add(ImageBox);
        pnlPrincipal.add(filler5);

        ProgressBox.setBackground(new java.awt.Color(176, 224, 230));
        ProgressBox.setMaximumSize(new java.awt.Dimension(2440, 70));
        ProgressBox.setMinimumSize(new java.awt.Dimension(350, 70));
        ProgressBox.setPreferredSize(new java.awt.Dimension(350, 70));
        ProgressBox.setLayout(new javax.swing.BoxLayout(ProgressBox, javax.swing.BoxLayout.Y_AXIS));
        ProgressBox.add(filler7);

        barraXp.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        barraXp.setMaximumSize(new java.awt.Dimension(350, 15));
        barraXp.setMinimumSize(new java.awt.Dimension(350, 15));
        barraXp.setPreferredSize(new java.awt.Dimension(350, 15));
        ProgressBox.add(barraXp);

        lblTextoXp.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        lblTextoXp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTextoXp.setText("xp atual/xp necessário");
        lblTextoXp.setAlignmentX(0.5F);
        lblTextoXp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 5, 1));
        ProgressBox.add(lblTextoXp);
        ProgressBox.add(filler11);

        pnlPrincipal.add(ProgressBox);

        ButtonBox.setBackground(new java.awt.Color(176, 224, 230));
        ButtonBox.setMaximumSize(new java.awt.Dimension(2440, 70));
        ButtonBox.setPreferredSize(new java.awt.Dimension(1280, 70));
        ButtonBox.setLayout(new javax.swing.BoxLayout(ButtonBox, javax.swing.BoxLayout.Y_AXIS));
        ButtonBox.add(filler3);

        btnVoltar.setText("Voltar");
        btnVoltar.setAlignmentX(0.5F);
        btnVoltar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVoltar.setDefaultCapable(false);
        btnVoltar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVoltar.setMaximumSize(new java.awt.Dimension(150, 50));
        btnVoltar.setMinimumSize(new java.awt.Dimension(75, 25));
        btnVoltar.setPreferredSize(new java.awt.Dimension(130, 50));
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        ButtonBox.add(btnVoltar);
        ButtonBox.add(filler4);

        btnEvoluir.setText("Evoluir");
        btnEvoluir.setAlignmentX(0.5F);
        btnEvoluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEvoluir.setDefaultCapable(false);
        btnEvoluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEvoluir.setMaximumSize(new java.awt.Dimension(150, 50));
        btnEvoluir.setMinimumSize(new java.awt.Dimension(75, 25));
        btnEvoluir.setPreferredSize(new java.awt.Dimension(130, 50));
        btnEvoluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEvoluirActionPerformed(evt);
            }
        });
        ButtonBox.add(btnEvoluir);

        pnlPrincipal.add(ButtonBox);

        getContentPane().add(pnlPrincipal, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(51, 51, 51));
        Footer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Footer.setMaximumSize(new java.awt.Dimension(2440, 50));
        Footer.setMinimumSize(new java.awt.Dimension(1280, 50));
        Footer.setPreferredSize(new java.awt.Dimension(1280, 50));
        Footer.setLayout(new javax.swing.BoxLayout(Footer, javax.swing.BoxLayout.LINE_AXIS));
        Footer.add(filler9);

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
        Footer.add(filler10);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnEvoluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEvoluirActionPerformed
        Pet pet = GerenciadorUsuario.getInstance().getUsuarioLogado().getStudentPet();
        pet.addXp(100);
        atualizarExibicaoPet();
    }//GEN-LAST:event_btnEvoluirActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ButtonBox;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel ImageBox;
    private javax.swing.JPanel NomePet;
    private javax.swing.JPanel ProgressBox;
    private javax.swing.JProgressBar barraXp;
    private javax.swing.JButton btnEvoluir;
    private javax.swing.JButton btnVoltar;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel lblImagemPet;
    private javax.swing.JLabel lblLinkWebsite;
    private javax.swing.JLabel lblStatusPet;
    private javax.swing.JLabel lblTextoXp;
    private javax.swing.JPanel pnlPrincipal;
    // End of variables declaration//GEN-END:variables
}
