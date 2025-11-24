package com.pomopet.data;

public class Sabine extends Pet{
    
    // Atributos ->
    
    private static final long serialVersionUID = 1L;
    
    // Construtor ->
    
    public Sabine(){
        super("Sabine");
        super.setImage("sabineLevel1.png");
    }
    
    // Sobreposição Crescimento ->
    
    @Override
    public void calculateGrow(int xp){
        if(xp < 200){
            super.setPetLevel(1);
            super.setImage("sabineLevel1.png");
        }else if(xp < 500){
            super.setPetLevel(2);
            super.setImage("sabineLevel2.png"); 
        }else{
            super.setPetLevel(3);
            super.setImage("sabineLevel3.png");
        }     
    };
}
