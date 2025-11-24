package com.pomopet.data;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SaveService {
    
    private static final String FILE_NAME = "usuarios.dat"; // constante com nome do arquivo
    
    // Método para salvar a lista completa de usuários ->
    
    public static void salvarListaUsuarios(List<User> listaUsuarios) {
        
        try (FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            
            objectOutputStream.writeObject(listaUsuarios);
            System.out.println("Dados salvos com sucesso em: " + FILE_NAME);
            
        } catch (IOException e) {
            System.err.println("Erro ao salvar dados: " + e.getMessage());
        }
        
    }
    
    // Método para obter a lista completa de usuários ->
    
    public static List<User> carregarUsuarios() {
        
        File arquivo = new File(FILE_NAME);
         
        if (!arquivo.exists()) {  // Verifica se o arquivo existe antes de tentar carregar
            System.out.println("Arquivo de dados não encontrado. Iniciando com lista vazia.");
            return new ArrayList<>();
        }
        
        try (FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            
            // Lê o objeto e faz o cast para a lista de usuários
            @SuppressWarnings("unchecked")
            List<User> lista = (List<User>) objectInputStream.readObject();
            System.out.println("Dados carregados com sucesso.");
            return lista;
            
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao carregar dados: " + e.getMessage());
            return new ArrayList<>(); // Retorna lista vazia em caso de erro
        }
        
    }
    
}
