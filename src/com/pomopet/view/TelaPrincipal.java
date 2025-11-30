package com.pomopet.view;

import java.awt.Desktop;
import java.net.URI;
import com.pomopet.data.GerenciadorUsuario;
import com.pomopet.data.*;
import java.awt.event.*;
import javax.swing.*;
import com.pomopet.data.User;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import com.pomopet.data.Grupo;
import javax.swing.DefaultListModel;
import java.util.List;
import com.pomopet.data.Contador;

public class TelaPrincipal extends javax.swing.JFrame {

    final String URL_DESTINO = "https://bit.ly/m/PomoPets";
    
    Contador count = new Contador();
    Contador countMeta = new Contador();
    int tempoMeta;
    int pausa=0;
    int grupoAtual;
    int tempoPassado;
    int tempoDeterminado;
    boolean start=false;
    boolean startMeta=false;
    ActionListener acao = new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(count.getTempoRestante()>0){
                count.setTempoRestante(count.getTempoRestante()-1000);
            } else {
                start=false;
                timer.stop();
                descontarMeta();
                ComecarButton.setText("Começar");
            }
            count.formatarTimer();
            labelTimer.setText(count.getStringHoras()+":"+count.getStringMinutos()+":"+count.getStringSegundos());
            }
        };
    Timer timer = new Timer(1000, acao);
    
    public final void descontarMeta() {
        // Desconta passado no timer na meta
        tempoPassado=count.getTempoTotal()-count.getTempoRestante();
        countMeta.setTempo(tempoMeta-(tempoPassado/1000)); //tempoPassado/1000 = segundos
        countMeta.formatarTimer();
        
        // Transforma o tempo passado em xp pro pet
        GerenciadorUsuario.getInstance().getUsuarioLogado().getStudentPet().addXp((tempoPassado/1000)*(0.4/60));
        System.out.println((tempoPassado/1000)*(0.4/60));
        
        labelTimerMeta.setText(countMeta.getStringHoras()+":"+countMeta.getStringMinutos()+":"+countMeta.getStringSegundos());
        for (int i = 0; i < GerenciadorUsuario.getInstance().getUsuarioLogado().getGroupList().size(); i++) {
            if (GerenciadorUsuario.getInstance().getUsuarioLogado().getGroupList().get(i).getTempoRestante()>0)
                GerenciadorUsuario.getInstance().getUsuarioLogado().getGroupList().get(i).contadorFinalizado(tempoPassado/1000);
        }
        
        //salva os dados
        GerenciadorUsuario gerenciador = GerenciadorUsuario.getInstance();
        gerenciador.salvarDados();
    }
    
    public TelaPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        Main = new javax.swing.JPanel();
        NavigateButtons1 = new javax.swing.JPanel();
        filler14 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        ButtonsPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filler18 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        filler20 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jScrollPane1 = new javax.swing.JScrollPane();
        labelTimerMeta = new javax.swing.JLabel();
        filler21 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Section = new javax.swing.JPanel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel1 = new javax.swing.JLabel();
        Timer = new javax.swing.JPanel();
        labelTimer = new javax.swing.JLabel();
        TimerButtons = new javax.swing.JPanel();
        ComecarButton = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(150, 0));
        PararButton = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jPanel2 = new javax.swing.JPanel();
        filler16 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(400, 0), new java.awt.Dimension(300, 0));
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        filler15 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(290, 0), new java.awt.Dimension(260, 0));
        txtSetTempo = new javax.swing.JFormattedTextField();
        filler13 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(20, 0));
        jButton1 = new javax.swing.JButton();
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
        NavigateButtons1.setBackground(new java.awt.Color(176, 224, 230));
        NavigateButtons1.setMaximumSize(new java.awt.Dimension(290, 700));
        NavigateButtons1.setMinimumSize(new java.awt.Dimension(130, 500));
        NavigateButtons1.setPreferredSize(new java.awt.Dimension(290, 700));
        NavigateButtons1.setLayout(new javax.swing.BoxLayout(NavigateButtons1, javax.swing.BoxLayout.Y_AXIS));
        NavigateButtons1.add(filler14);

        ButtonsPanel1.setBackground(new java.awt.Color(240, 255, 240));
        ButtonsPanel1.setMaximumSize(new java.awt.Dimension(200, 180));
        ButtonsPanel1.setPreferredSize(new java.awt.Dimension(200, 180));
        ButtonsPanel1.setLayout(new javax.swing.BoxLayout(ButtonsPanel1, javax.swing.BoxLayout.Y_AXIS));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Meta Atual");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(36, 36, 36))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );

        ButtonsPanel1.add(jPanel3);
        ButtonsPanel1.add(filler18);
        ButtonsPanel1.add(filler20);

        jScrollPane1.setMaximumSize(new java.awt.Dimension(400, 300));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(400, 50));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 200));

        labelTimerMeta.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        labelTimerMeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTimerMeta.setText("00:00:00");
        labelTimerMeta.setAlignmentX(0.5F);
        labelTimerMeta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jScrollPane1.setViewportView(labelTimerMeta);

        ButtonsPanel1.add(jScrollPane1);

        NavigateButtons1.add(ButtonsPanel1);
        NavigateButtons1.add(filler21);

        Main.add(NavigateButtons1);

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
        Timer.setPreferredSize(new java.awt.Dimension(805, 211));
        Timer.setLayout(new javax.swing.BoxLayout(Timer, javax.swing.BoxLayout.LINE_AXIS));

        labelTimer.setFont(new java.awt.Font("Comic Sans MS", 0, 48)); // NOI18N
        labelTimer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTimer.setText("00:00:00");
        labelTimer.setAlignmentX(0.5F);
        labelTimer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Timer.add(labelTimer);


        Section.add(Timer);

        TimerButtons.setBackground(new java.awt.Color(240, 255, 240));
        TimerButtons.setLayout(new javax.swing.BoxLayout(TimerButtons, javax.swing.BoxLayout.LINE_AXIS));

        ComecarButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ComecarButton.setText("Começar");
        ComecarButton.setAlignmentX(0.5F);
        ComecarButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ComecarButton.setDefaultCapable(false);
        ComecarButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ComecarButton.setMaximumSize(new java.awt.Dimension(200, 100));
        ComecarButton.setMinimumSize(new java.awt.Dimension(75, 25));
        ComecarButton.setPreferredSize(new java.awt.Dimension(100, 50));
        ComecarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComecarButtonActionPerformed(evt);
            }
        });
        TimerButtons.add(ComecarButton);
        TimerButtons.add(filler1);

        PararButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        PararButton.setText("Encerrar");
        PararButton.setAlignmentX(0.5F);
        PararButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PararButton.setDefaultCapable(false);
        PararButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        PararButton.setMaximumSize(new java.awt.Dimension(200, 100));
        PararButton.setMinimumSize(new java.awt.Dimension(75, 25));
        PararButton.setPreferredSize(new java.awt.Dimension(180, 80));
        PararButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PararButtonActionPerformed(evt);
            }
        });
        TimerButtons.add(PararButton);

        Section.add(TimerButtons);
        Section.add(filler2);

        jPanel2.setBackground(new java.awt.Color(240, 255, 240));
        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 50));
        jPanel2.setPreferredSize(new java.awt.Dimension(250, 25));
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));
        jPanel2.add(filler16);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Escolha o tempo de estudo");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(jLabel2);

        Section.add(jPanel2);

        jPanel1.setBackground(new java.awt.Color(240, 255, 240));
        jPanel1.setMaximumSize(new java.awt.Dimension(32767, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(805, 80));
        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));
        jPanel1.add(filler15);

        try {
            txtSetTempo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtSetTempo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSetTempo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtSetTempo.setMaximumSize(new java.awt.Dimension(200, 40));
        jPanel1.add(txtSetTempo);
        jPanel1.add(filler13);

        jButton1.setText("OK");
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        Section.add(jPanel1);


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

// ----------------------------------------------------------------
// a partir daqui precisa fazer a modificaçao de acesso dos usuarios
//            onde tem as classes que nao existem mais
    
    private void ComecarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComecarButtonActionPerformed
        // TODO add your handling code here:
        
        if(start==true){
            if (pausa==0){
                timer.stop();
                pausa=1;
                if (tempoMeta!=0)
                    descontarMeta();
                ComecarButton.setText("Continuar");
        } else {
            timer.start();
            pausa=0;
            ComecarButton.setText("Pausar");
            }
        }
        
        if (start==false){
         //Determina o tempo determinado no campo de texto abaixo
        count.setTempo(tempoDeterminado);
        //Começa o timer e muda a configuração do botão pra Pausar/Continuar
        timer.start();
        ComecarButton.setText("Pausar");
        start=true;
        }
        //Pausa ou retoma a contagem do timer se apertado
    }//GEN-LAST:event_ComecarButtonActionPerformed

    private void PararButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PararButtonActionPerformed
        // TODO add your handling code here:
        //para o timer
        if (timer.isRunning()){
            start=false;
            timer.stop();
            ComecarButton.setText("Começar");
            if (tempoMeta!=0)
                descontarMeta();
            labelTimer.setText("00:00:00");
            count.setTempo(0);
        }
        //O tempo decorrido é salvo antes do timer ser zerado
        
    }//GEN-LAST:event_PararButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        tempoDeterminado=Integer.parseInt(txtSetTempo.getText())*60;
        
        //if (startMeta==false){
            for (int i = 0; i < GerenciadorUsuario.getInstance().getUsuarioLogado().getGroupList().size(); i++) {
                if (i==0){
                    tempoMeta=GerenciadorUsuario.getInstance().getUsuarioLogado().getGroupList().get(i).getTempoRestante();
                } else{ 
                    if (tempoMeta>GerenciadorUsuario.getInstance().getUsuarioLogado().getGroupList().get(i).getTempoRestante()){
                    tempoMeta=GerenciadorUsuario.getInstance().getUsuarioLogado().getGroupList().get(i).getTempoRestante();
                    grupoAtual=i;
                }
            }
            //}
            countMeta.setTempo(tempoMeta);
            countMeta.formatarTimer();
            labelTimerMeta.setText(countMeta.getStringHoras()+":"+countMeta.getStringMinutos()+":"+countMeta.getStringSegundos());
            startMeta=true;
        }
    }                                            

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
    private javax.swing.JPanel ButtonsPanel1;
    private javax.swing.JButton ComecarButton;
    private javax.swing.JPanel Footer;
    private javax.swing.JButton GruposButton;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.JPanel NavigateButtons;
    private javax.swing.JPanel NavigateButtons1;
    private javax.swing.JButton PararButton;
    private javax.swing.JButton PetButton;
    private javax.swing.JPanel Section;
    private javax.swing.JPanel Timer;
    private javax.swing.JPanel TimerButtons;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler11;
    private javax.swing.Box.Filler filler12;
    private javax.swing.Box.Filler filler13;
    private javax.swing.Box.Filler filler14;
    private javax.swing.Box.Filler filler15;
    private javax.swing.Box.Filler filler16;
    private javax.swing.Box.Filler filler18;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler20;
    private javax.swing.Box.Filler filler21;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.Box.Filler filler7;
    private javax.swing.Box.Filler filler8;
    private javax.swing.Box.Filler filler9;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelTimer;
    private javax.swing.JLabel labelTimerMeta;
    private javax.swing.JLabel lblLinkWebsite;
    private javax.swing.JFormattedTextField txtSetTempo;
    // End of variables declaration//GEN-END:variables
}
