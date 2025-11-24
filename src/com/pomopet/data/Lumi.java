package com.pomopet.data;

public class Lumi extends Pet{
    
    // Atributos ->
    
    private static final long serialVersionUID = 1L;
    
    // Construtor ->
    
    public Lumi(){
        super("Lumi");
        super.setImage("lumiLevel1.png");
    }
    
    // Sobreposição Crescimento ->
    
    @Override
    public void calculateGrow(int xp){
        if(xp < 200){
            super.setPetLevel(1);
            super.setImage("lumiLevel1.png");
        }else if(xp < 500){
            super.setPetLevel(2);
            super.setImage("lumiLevel2.png"); 
        }else{
            super.setPetLevel(3);
            super.setImage("lumiLevel3.png");
        }     
    };
}
