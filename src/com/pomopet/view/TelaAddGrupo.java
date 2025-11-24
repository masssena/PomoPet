package com.pomopet.view;

import com.pomopet.data.User;
import com.pomopet.data.GerenciadorUsuario;
import com.pomopet.data.Grupo;
import com.pomopet.data.SaveService;
import java.util.List;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TelaAddGrupo extends javax.swing.JFrame {

    private final DefaultListModel<String> membrosModel; //modelo pra lista
    private final TelaGrupos telaPrincipal; // variável que armazena a tela anterior
    private GerenciadorUsuario dadosUsuario = GerenciadorUsuario.getInstance();
    private List<User> todosAmigos = dadosUsuario.getUsuarioLogado().getFriendList();
    
    public TelaAddGrupo(TelaGrupos parent) {
        initComponents();
        
        this.telaPrincipal = parent;
        membrosModel = new DefaultListModel<>();
        lstGroupMembers.setModel(membrosModel);
        
        preencherComboBoxAmigos();
    }
    

    private void preencherComboBoxAmigos() {
  
    friendListComboBox.removeAllItems(); // Limpa o ComboBox 

    // Adiciona cada nome ao ComboBox ->
    for (User amigo : todosAmigos) {
        friendListComboBox.addItem(amigo.getName());
    }
    
    //Adiciona uma seleção inicial ->
    if (friendListComboBox.getItemCount() > 0) {
        friendListComboBox.setSelectedIndex(0);
    }
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Main = new javax.swing.JPanel();
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Form = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeGrupo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMetaTempo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        friendListComboBox = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstGroupMembers = new javax.swing.JList<>();
        filler5 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        Footer = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        Add = new javax.swing.JButton();
        filler6 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        Create = new javax.swing.JButton();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        Back = new javax.swing.JButton();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 400));

        Header.setBackground(new java.awt.Color(51, 51, 51));
        Header.setMinimumSize(new java.awt.Dimension(500, 50));
        Header.setPreferredSize(new java.awt.Dimension(500, 50));
        Header.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Digite as Informações do Grupo");
        jLabel1.setToolTipText("");
        jLabel1.setAlignmentX(0.5F);
        Header.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(Header, java.awt.BorderLayout.PAGE_START);

        Main.setBackground(new java.awt.Color(240, 255, 240));
        Main.setLayout(new javax.swing.BoxLayout(Main, javax.swing.BoxLayout.Y_AXIS));
        Main.add(filler4);

        Form.setBackground(new java.awt.Color(240, 255, 240));
        Form.setMaximumSize(new java.awt.Dimension(400, 200));
        Form.setMinimumSize(new java.awt.Dimension(400, 200));
        Form.setPreferredSize(new java.awt.Dimension(400, 120));
        Form.setLayout(new java.awt.GridLayout(0, 2, 15, 0));

        jLabel2.setText("Nome do grupo:");
        Form.add(jLabel2);

        txtNomeGrupo.setMargin(new java.awt.Insets(2, 16, 2, 16));
        txtNomeGrupo.setMaximumSize(new java.awt.Dimension(100, 2147483647));
        txtNomeGrupo.setMinimumSize(new java.awt.Dimension(100, 22));
        txtNomeGrupo.setPreferredSize(new java.awt.Dimension(100, 22));
        Form.add(txtNomeGrupo);

        jLabel3.setText("Meta (minutos/dia) :");
        Form.add(jLabel3);

        txtMetaTempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMetaTempoActionPerformed(evt);
            }
        });
        Form.add(txtMetaTempo);

        jLabel4.setText("Selecionar Membros:");
        Form.add(jLabel4);

        friendListComboBox.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        friendListComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        Form.add(friendListComboBox);

        Main.add(Form);

        jPanel1.setBackground(new java.awt.Color(240, 255, 240));
        jPanel1.setMaximumSize(new java.awt.Dimension(400, 150));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 150));
        jPanel1.setLayout(new java.awt.BorderLayout());

        lstGroupMembers.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lstGroupMembers.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(lstGroupMembers);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        Main.add(jPanel1);
        Main.add(filler5);

        getContentPane().add(Main, java.awt.BorderLayout.CENTER);

        Footer.setBackground(new java.awt.Color(51, 51, 51));
        Footer.setMaximumSize(new java.awt.Dimension(2440, 50));
        Footer.setMinimumSize(new java.awt.Dimension(500, 50));
        Footer.setPreferredSize(new java.awt.Dimension(500, 50));
        Footer.setLayout(new javax.swing.BoxLayout(Footer, javax.swing.BoxLayout.LINE_AXIS));
        Footer.add(filler1);

        Add.setText("Adicionar");
        Add.setMaximumSize(new java.awt.Dimension(100, 30));
        Add.setMinimumSize(new java.awt.Dimension(100, 30));
        Add.setPreferredSize(new java.awt.Dimension(100, 30));
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        Footer.add(Add);
        Footer.add(filler6);

        Create.setText("Criar Grupo");
        Create.setMaximumSize(new java.awt.Dimension(100, 30));
        Create.setMinimumSize(new java.awt.Dimension(100, 30));
        Create.setPreferredSize(new java.awt.Dimension(100, 30));
        Create.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateActionPerformed(evt);
            }
        });
        Footer.add(Create);
        Footer.add(filler3);

        Back.setText("Voltar");
        Back.setMaximumSize(new java.awt.Dimension(100, 30));
        Back.setMinimumSize(new java.awt.Dimension(100, 30));
        Back.setPreferredSize(new java.awt.Dimension(100, 30));
        Back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackActionPerformed(evt);
            }
        });
        Footer.add(Back);
        Footer.add(filler2);

        getContentPane().add(Footer, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackActionPerformed
        this.dispose(); // fecha a tela
    }//GEN-LAST:event_BackActionPerformed

    private void CreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateActionPerformed
    String nome = txtNomeGrupo.getText();
    int meta;

    // Validações ->
    if (nome.trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "O nome do grupo não pode estar vazio.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        meta = Integer.parseInt(txtMetaTempo.getText());
        if (meta <= 0) {
            JOptionPane.showMessageDialog(this, "A meta deve ser um número positivo.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "A meta deve ser um número inteiro válido.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Converte o modelo da lista de membros para uma lista para o construtor do Grupo ->
    List<String> membrosDoGrupo = new ArrayList<>();
    for (int i = 0; i < membrosModel.getSize(); i++) {
        membrosDoGrupo.add(membrosModel.getElementAt(i));
    }
    
    if (membrosDoGrupo.size() < 2) {
        JOptionPane.showMessageDialog(this, "Um grupo deve ter no mínimo 2 membros.", "Erro de Validação", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Criação do Grupo ->
    List <User> membrosDoGrupoList = new ArrayList<>();
    
    for (String nomeMembro : membrosDoGrupo) {
        for (User amigo : todosAmigos) {
            if (amigo.getName().equals(nomeMembro)){
                membrosDoGrupoList.add(amigo);
            }
        }
    }
    
    Grupo novoGrupo = new Grupo(nome, meta, membrosDoGrupoList);
    for (User membro : membrosDoGrupoList) {
        membro.addGroup(novoGrupo);
    }
    
    // Atualizar a Lista dá o retorno e fecha a janela ->
    if (telaPrincipal != null) {
        telaPrincipal.recarregarLista();
    }
    JOptionPane.showMessageDialog(this, "Grupo '" + nome + "' criado com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
    this.dispose();
    dadosUsuario.salvarDados();
    }//GEN-LAST:event_CreateActionPerformed

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
    
    // Pega o item selecionado no ComboBox
        String amigoSelecionado = (String) friendListComboBox.getSelectedItem();

        if (amigoSelecionado != null) {// Verifica se o amigo já não está na lista (para evitar duplicatas)
            if (!membrosModel.contains(amigoSelecionado)) {               
                membrosModel.addElement(amigoSelecionado);// Adiciona o amigo ao model
            }           
            friendListComboBox.removeItem(amigoSelecionado);//Remove o amigo do ComboBox após adição
        }
    }//GEN-LAST:event_AddActionPerformed

    private void txtMetaTempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMetaTempoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMetaTempoActionPerformed

    public static void main(String args[]) {
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Back;
    private javax.swing.JButton Create;
    private javax.swing.JPanel Footer;
    private javax.swing.JPanel Form;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Main;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.Box.Filler filler5;
    private javax.swing.Box.Filler filler6;
    private javax.swing.JComboBox<String> friendListComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstGroupMembers;
    private javax.swing.JTextField txtMetaTempo;
    private javax.swing.JTextField txtNomeGrupo;
    // End of variables declaration//GEN-END:variables
}
