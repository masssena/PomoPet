package com.pomopet.data;

import java.util.List;

public class GerenciadorUsuario {
    
    //Atributos -> 
    
    private static GerenciadorUsuario instancia;
    private List<User> listaUsuarios;
    private User usuarioLogado;
    
    // Construtor ->
    
    private GerenciadorUsuario() {
        this.listaUsuarios = SaveService.carregarUsuarios();
        this.usuarioLogado = null;
    }
        
    // Método de Cadastro ->
    public void cadastrarUsuario(User novoUsuario) {     
        this.listaUsuarios.add(novoUsuario); 
        this.salvarDados();
    }
    
    // salva os dados da aplicação ->
    public void salvarDados() {
        SaveService.salvarListaUsuarios(this.listaUsuarios);
    }
    
    // Método para o Login verificar se o usuário e senha existem na lista ->
    public User realizarLogin(String username, String password) {
        for (User user : listaUsuarios) {
            // Verifica se o nome de usuário E a senha são iguais
            if (user.getName().equals(username) && user.getPassword().equals(password)) {
                this.usuarioLogado = user;
                return user; // Retorna o usuário encontrado
            }
        }
        return null; // Retorna null se não encontrar
    }
    // Recebe uma String e retorna um User ->
    public User buscarUsuarioPorNome(String username) {
        for (User user : this.getListaUsuarios()) {
            if (user.getName().equals(username)) {
                return user;
            }
        }
        return null;
    }
    // Getter e Setter
    
    public static GerenciadorUsuario getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorUsuario();
        }
        return instancia;
    }
    
    public void setUsuarioLogado(User user) {
        this.usuarioLogado = user; 
    }
    
    public User getUsuarioLogado() {
        return usuarioLogado;
    }

    public List<User> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(List<User> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    
}
