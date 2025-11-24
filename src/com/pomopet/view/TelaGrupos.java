package com.pomopet.view;

import com.pomopet.data.GerenciadorUsuario;
import com.pomopet.data.Grupo;
import java.awt.Desktop;
import java.net.URI;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import java.util.List;
import javax.swing.JFrame;

public class TelaGrupos extends javax.swing.JFrame {
    
    final String URL_DESTINO = "https://bit.ly/m/PomoPets";
    private GerenciadorUsuario dadosUsuario = GerenciadorUsuario.getInstance();
    
    public final void recarregarLista() {
        // Recarrega a exibição da Lista ->     
        List<Grupo> grupos = dadosUsuario.getUsuarioLogado().getGroupList();
        DefaultListModel<Grupo> novoModelo = new DefaultListModel<>();
        for (Grupo grupo : grupos) {
            novoModelo.addElement(grupo);
        }
        lstGrupos.setModel(novoModelo);
    }
    public TelaGrupos() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        recarregarLista();
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
        ListDiv = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGrupos = new javax.swing.JList<>();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Buttons = new javax.swing.JPanel();
        btnNovoGrp = new javax.swing.JButton();
        btnRmvGrp = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler11 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(290, 0), new java.awt.Dimension(32767, 0));
        Footer = new javax.swing.JPanel();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        lblLinkWebsite = new javax.swing.JLabel();
        filler12 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(176, 224, 230));
        setMinimumSize(new java.awt.Dimension(1280, 800));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMinimumSize(new java.awt.Dimension(800, 50));
        Header.setPreferredSize(new java.awt.Dimension(1280, 50));

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1289, Short.MAX_VALUE)
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Main.setBackground(new java.awt.Color(176, 224, 230));
        Main.setMaximumSize(new java.awt.Dimension(1280, 700));
        Main.setMinimumSize(new java.awt.Dimension(1280, 700));
        Main.setPreferredSize(new java.awt.Dimension(1280, 700));
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
        jLabel1.setText("Lista de Grupos");
        jLabel1.setAlignmentX(0.5F);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Section.add(jLabel1);

        ListDiv.setBackground(new java.awt.Color(240, 255, 240));
        ListDiv.setLayout(new javax.swing.BoxLayout(ListDiv, javax.swing.BoxLayout.Y_AXIS));
        ListDiv.add(filler4);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(400, 300));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(400, 50));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 200));

        lstGrupos.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        lstGrupos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lstGrupos.setVerifyInputWhenFocusTarget(false);
        lstGrupos.setVisibleRowCount(4);
        jScrollPane1.setViewportView(lstGrupos);

        ListDiv.add(jScrollPane1);
        ListDiv.add(filler1);

        Section.add(ListDiv);

        Buttons.setBackground(new java.awt.Color(240, 255, 240));

        btnNovoGrp.setText("Criar Novo Grupo");
        btnNovoGrp.setAlignmentX(0.5F);
        btnNovoGrp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNovoGrp.setDefaultCapable(false);
        btnNovoGrp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnNovoGrp.setMaximumSize(new java.awt.Dimension(180, 50));
        btnNovoGrp.setMinimumSize(new java.awt.Dimension(75, 25));
        btnNovoGrp.setPreferredSize(new java.awt.Dimension(130, 50));
        btnNovoGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoGrpActionPerformed(evt);
            }
        });
        Buttons.add(btnNovoGrp);

        btnRmvGrp.setText("Remover Grupo");
        btnRmvGrp.setAlignmentX(0.5F);
        btnRmvGrp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRmvGrp.setDefaultCapable(false);
        btnRmvGrp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRmvGrp.setMaximumSize(new java.awt.Dimension(150, 50));
        btnRmvGrp.setMinimumSize(new java.awt.Dimension(75, 25));
        btnRmvGrp.setPreferredSize(new java.awt.Dimension(130, 50));
        btnRmvGrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRmvGrpActionPerformed(evt);
            }
        });
        Buttons.add(btnRmvGrp);

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
        Buttons.add(btnVoltar);

        Section.add(Buttons);
        Section.add(filler2);

        Main.add(Section);
        Main.add(filler11);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

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
        Footer.add(filler12);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNovoGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoGrpActionPerformed
       TelaAddGrupo telaAddGrupo = new TelaAddGrupo(this);
       telaAddGrupo.setLocationRelativeTo(null);
       telaAddGrupo.setVisible(true);
    }//GEN-LAST:event_btnNovoGrpActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        TelaPrincipal telaPrincipal = new TelaPrincipal();
        telaPrincipal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnRmvGrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRmvGrpActionPerformed

        // Seleciona o Grupo ->
        Grupo grupoSelecionado = (Grupo) lstGrupos.getSelectedValue();
        if (grupoSelecionado == null) {
            JOptionPane.showMessageDialog(this, "Por favor, selecione um grupo para excluir.", "Nenhuma Seleção", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Confirma a exclusão ->
        int confirmacao = JOptionPane.showConfirmDialog(
            this, 
            "Tem certeza que deseja excluir o grupo '" + grupoSelecionado.getGroupName() + "'?", 
            "Confirmar Exclusão", 
            JOptionPane.YES_NO_OPTION
        );

        // Executa a exclusão caso o usuário confirme ->
        if (confirmacao == JOptionPane.YES_OPTION) {
            try {
               
                dadosUsuario.getUsuarioLogado().rmvGroup(grupoSelecionado);
                recarregarLista(); 
                JOptionPane.showMessageDialog(this, "Grupo '" + grupoSelecionado.getGroupName()+ "' excluído com sucesso.", "Exclusão Concluída", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao tentar excluir o grupo: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnRmvGrpActionPerformed

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
                new TelaGrupos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Buttons;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel ListDiv;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel Section;
    private javax.swing.JButton btnNovoGrp;
    private javax.swing.JButton btnRmvGrp;
    private javax.swing.JButton btnVoltar;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLinkWebsite;
    private javax.swing.JList<Grupo> lstGrupos;
    // End of variables declaration//GEN-END:variables
}
