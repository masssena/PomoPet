package com.pomopet.data;

public class Yami extends Pet{
    
    // Atributos ->
    
    private static final long serialVersionUID = 1L;
    
    // Construtor ->
    
    public Yami(){
        super("Yami");
        super.setImage("yamiLevel1.png");
    }
    
    // Sobreposição Crescimento ->
    
    @Override
    public void calculateGrow(int xp){
        if(xp < 200){
            super.setPetLevel(1);
            super.setImage("yamiLevel1.png");
        }else if(xp < 500){
            super.setPetLevel(2);
            super.setImage("yamiLevel2.png"); 
        }else{
            super.setPetLevel(3);
            super.setImage("yamiLevel3.png");
        }     
    };
}
