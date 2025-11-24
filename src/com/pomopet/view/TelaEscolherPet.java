//tentar colocar as imagens dos pets nessa tela também

package com.pomopet.view;

import com.pomopet.data.Pet;
import com.pomopet.data.Lumi;
import com.pomopet.data.Sabine;
import com.pomopet.data.Yami;
import com.pomopet.data.GerenciadorUsuario;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import com.pomopet.data.User;
import javax.swing.JFrame;

public class TelaEscolherPet extends javax.swing.JFrame {
    
    private String especieSelecionada = null;
    private Pet petSelecionado = null;
    private boolean cadastro = false;
    private User usuarioCadastro = new User(null,null,null,null,null);

    public void setCadastro(boolean cadastro) {
        this.cadastro = cadastro;
    }

    public void setUsuarioCadastro(User usuarioCadastro) {
        this.usuarioCadastro = usuarioCadastro;
    }
    
    
    
    public TelaEscolherPet() {
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
        //setUndecorated(true);

        btnChoose.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        Titulo = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        filler7 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnLumi = new javax.swing.JButton();
        filler9 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnSabine = new javax.swing.JButton();
        filler10 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnYami = new javax.swing.JButton();
        filler8 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Footer = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        btnChoose = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        btnBack = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 400));
        setMinimumSize(new java.awt.Dimension(500, 400));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMinimumSize(new java.awt.Dimension(500, 50));
        Header.setPreferredSize(new java.awt.Dimension(500, 50));
        Header.setLayout(new java.awt.BorderLayout());

        Titulo.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        Titulo.setForeground(new java.awt.Color(255, 255, 255));
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Escolha qual PET você quer");
        Titulo.setToolTipText("");
        Titulo.setAlignmentX(0.5F);
        Header.add(Titulo, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Main.setBackground(new java.awt.Color(240, 255, 240));
        Main.setLayout(new javax.swing.BoxLayout(Main, javax.swing.BoxLayout.X_AXIS));
        Main.add(filler7);

        btnLumi.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnLumi.setText("Lumi");
        btnLumi.setAlignmentX(0.5F);
        btnLumi.setMaximumSize(new java.awt.Dimension(100, 100));
        btnLumi.setMinimumSize(new java.awt.Dimension(100, 100));
        btnLumi.setPreferredSize(new java.awt.Dimension(100, 100));
        btnLumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLumiActionPerformed(evt);
            }
        });
        Main.add(btnLumi);
        Main.add(filler9);

        btnSabine.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnSabine.setText("Sabine");
        btnSabine.setAlignmentX(0.5F);
        btnSabine.setMaximumSize(new java.awt.Dimension(100, 100));
        btnSabine.setMinimumSize(new java.awt.Dimension(100, 100));
        btnSabine.setPreferredSize(new java.awt.Dimension(100, 100));
        btnSabine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSabineActionPerformed(evt);
            }
        });
        Main.add(btnSabine);
        Main.add(filler10);

        btnYami.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        btnYami.setText("Yami");
        btnYami.setAlignmentX(0.5F);
        btnYami.setMaximumSize(new java.awt.Dimension(100, 100));
        btnYami.setMinimumSize(new java.awt.Dimension(100, 100));
        btnYami.setPreferredSize(new java.awt.Dimension(100, 100));
        btnYami.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnYamiActionPerformed(evt);
            }
        });
        Main.add(btnYami);
        Main.add(filler8);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(51, 51, 51));
        Footer.setMaximumSize(new java.awt.Dimension(2440, 50));
        Footer.setMinimumSize(new java.awt.Dimension(500, 50));
        Footer.setPreferredSize(new java.awt.Dimension(500, 50));
        Footer.setLayout(new javax.swing.BoxLayout(Footer, javax.swing.BoxLayout.LINE_AXIS));
        Footer.add(filler1);

        btnChoose.setText("Escolher");
        btnChoose.setMaximumSize(new java.awt.Dimension(100, 30));
        btnChoose.setMinimumSize(new java.awt.Dimension(100, 30));
        btnChoose.setPreferredSize(new java.awt.Dimension(100, 30));
        btnChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseActionPerformed(evt);
            }
        });
        Footer.add(btnChoose);
        Footer.add(filler6);
        Footer.add(filler3);

        btnBack.setText("Voltar");
        btnBack.setMaximumSize(new java.awt.Dimension(100, 30));
        btnBack.setMinimumSize(new java.awt.Dimension(100, 30));
        btnBack.setPreferredSize(new java.awt.Dimension(100, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        Footer.add(btnBack);
        Footer.add(filler2);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void selecionarPet(String especie) {
        
        // Cria a instância correta-> 
        
        switch (especie) {
            case "Lumi":
                petSelecionado = new Lumi();
                break;
            case "Sabine":
                petSelecionado = new Sabine();
                break;
            case "Yami":
                petSelecionado = new Yami();
                break;
            default:
                petSelecionado = null;
        }
        
        especieSelecionada = especie;
        
        // Destaca o botão e libera o botão de escolher
        atualizarDestaqueVisual();
        btnChoose.setEnabled(true);
    }
    
    // Método para mudar visualmente qual botão foi clicado
    private void atualizarDestaqueVisual() {
        
        // Limpa todas as bordas/cores ->
        btnLumi.setBorder(null);
        btnSabine.setBorder(null);
        btnYami.setBorder(null);
        
        // Aplica o destaque na seleção _>
        
        if (especieSelecionada != null) {
             JButton botao = null;
             if (especieSelecionada.equals("Lumi")) botao = btnLumi;
             else if (especieSelecionada.equals("Sabine")) botao = btnSabine;
             else if (especieSelecionada.equals("Yami")) botao = btnYami;
             
             if (botao != null) {
                 botao.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.ORANGE, 3));
             }
        }
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseActionPerformed
        if (petSelecionado != null) {
        
        
        //Verifica se o usuário está escolhendo o pet pela área de cadastro
        if(cadastro)
        {
            usuarioCadastro.setStudentPet(petSelecionado);          
            JOptionPane.showMessageDialog(this, 
            "Seu Pet " + petSelecionado.getName() + " foi escolhido! Faça login para iniciar.", 
            "Escolha Finalizada", JOptionPane.INFORMATION_MESSAGE);
            
            GerenciadorUsuario.getInstance().cadastrarUsuario(usuarioCadastro);
            TelaLogin telaLogin = new TelaLogin();
            telaLogin.setVisible(true);
            this.dispose();
        }
        else{
            // Obtém o usuário logado ->
            User usuario = GerenciadorUsuario.getInstance().getUsuarioLogado();
            
            if (usuario != null) {
                
                
               // if()
                // Associa o Pet criado ao usuário ->

                usuario.setStudentPet(petSelecionado);          
                JOptionPane.showMessageDialog(this, 
                    "Seu Pet " + petSelecionado.getName() + " foi escolhido! Comece a estudar.", 
                    "Escolha Finalizada", JOptionPane.INFORMATION_MESSAGE);

                // Fecha esta tela e abre a TelaPet ->

                this.dispose();
                TelaPet telaPet = new TelaPet();
                telaPet.setVisible(true);

            } else {
                JOptionPane.showMessageDialog(this, "Erro: Não há usuário logado.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecione um Pet.", "Atenção", JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnChooseActionPerformed

    private void btnLumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLumiActionPerformed
        selecionarPet("Lumi");
    }//GEN-LAST:event_btnLumiActionPerformed

    private void btnSabineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSabineActionPerformed
        selecionarPet("Sabine");
    }//GEN-LAST:event_btnSabineActionPerformed

    private void btnYamiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnYamiActionPerformed
        selecionarPet("Yami");
    }//GEN-LAST:event_btnYamiActionPerformed

    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnChoose;
    private javax.swing.JButton btnLumi;
    private javax.swing.JButton btnSabine;
    private javax.swing.JButton btnYami;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler10;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    // End of variables declaration//GEN-END:variables
}
