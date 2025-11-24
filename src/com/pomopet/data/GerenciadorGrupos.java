package com.pomopet.data;

import java.util.ArrayList;
import java.util.List;

public class GerenciadorGrupos {
    // Instância
    private static GerenciadorGrupos instancia;
    
    // Armazenamento dos dados (Lista de Students)
    private final List<Grupo> groupList;

    // Construtor 
    private GerenciadorGrupos() {
        groupList = new ArrayList<>(); 
    }

    // Método de Acesso Global (Retorna a instância)
    public static GerenciadorGrupos getInstance() {
        if (instancia == null) {
            instancia = new GerenciadorGrupos();
        }
        return instancia;
    }

    // Método de Adicionar
    public void addGroup(Grupo newGroup) {
        groupList.add(newGroup);
    }
    
    // Método de Remover
public void rmvGroup(Grupo grupo) {
        groupList.remove(grupo);
}

    // Método de Acesso (Obter Lista)
    public List<Grupo> getListaDeGrupos() {
        return groupList;
    }
}
