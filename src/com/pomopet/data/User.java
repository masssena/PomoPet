package com.pomopet.data;

import java.util.ArrayList;
import java.util.List;

public class User extends Student {
    
    // Atributos ->
    
    private static final long serialVersionUID = 1L;
    private String email;
    private String password;
    private String birthDate;
    private String gender;
    private Pet studentPet;
    private List<Grupo> groupList;
    private List<User> friendList;

    //Construtor ->

    public User(String name, String email, String password, String birthDate, String gender) {
        super(name);
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.gender = gender;
        friendList = new ArrayList<>();
        friendList.add(this);
        groupList = new ArrayList<>();
    }
    
     // Método de Adicionar Amigo ->
    public boolean adicionarAmigo(User amigo) {
        
        List<User> userList = GerenciadorUsuario.getInstance().getListaUsuarios();
        User usuarioLogado =  GerenciadorUsuario.getInstance().getUsuarioLogado();
        
        if (amigo != null && !(usuarioLogado.getFriendList().contains(amigo)) && !(amigo.equals(this))) {
            for (User usuario : userList) {
                if (amigo.equals(usuario)) {
                    this.getFriendList().add(amigo);
                    amigo.getFriendList().add(this);
                    GerenciadorUsuario.getInstance().salvarDados();
                    return true;
                }
            }
        }
        return false;
    }
    
    // Método de Remover Amigo ->
    public void removerAmigo(User amigo) {
        if (amigo != null && !(amigo.equals(this))) {
            for (User amigoNaLista : friendList) {
                if (amigo.equals(amigoNaLista)) {
                    this.friendList.remove(amigo);
                    amigo.friendList.remove(this);
                    GerenciadorUsuario.getInstance().salvarDados();
                }
            }
        }
    }
    
    // Método de Adicionar
    public void addGroup(Grupo newGroup) {
        groupList.add(newGroup);
    }
    
    // Método de Remover
    public void rmvGroup(Grupo grupo) {
        groupList.remove(grupo);
    }

    //Getters e Setters ->
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Pet getStudentPet() {
        return studentPet;
    }

    public void setStudentPet(Pet studentPet) {
        this.studentPet = studentPet;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<User> getFriendList() {
        return friendList;
    }
    
    public User getAmigoByIndex(int index) {       
        if (index >= 0 && index < friendList.size()) {
            return friendList.get(index);           
        } else {         
            System.err.println("Índice inválido: " + index);
            return null;
        }
    }

    public void setFriendList(List<User> friendList) {
        this.friendList = friendList;
    }
    
    public List<Grupo> getGroupList() {
        return groupList;
    }

    @Override
    public String toString() {
        return super.getName();
    }
    
}
