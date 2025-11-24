package com.pomopet.data;

import java.io.Serializable;

public abstract class Pet implements Animal, Serializable {
    
// Atributos ->
    
    private static final long serialVersionUID = 1L;
    private final String name; 
    protected String image;
    protected int petLevel;
    protected int xp;

// Construtor ->
    
    public Pet(String name) {
    this.name = name;
    this.petLevel = 1;    
    this.xp = 0;      
    }
    
// Método Adicionar XP ->
    
    public void addXp(int xpGanho) {
        this.xp += xpGanho;
        calculateGrow(this.xp); 
    }
    
// Métodos Getters e Setters ->
    
    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPetLevel() {
        return petLevel;
    }

    public void setPetLevel(int petLevel) {
        this.petLevel = petLevel;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }
}
