/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pomopet.data;

/**
 *
 * @author massena
 */
public class Meta {
    private int tempoTotal, tempoDecorrido;

    public Meta() {
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public int getTempoDecorrido() {
        return tempoDecorrido;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = this.tempoDecorrido = tempoTotal;
    }

    public void setTempoDecorrido(int tempoDecorrido) {
        this.tempoDecorrido = tempoDecorrido;
    }
    
    public void contadorFinalizado (int segundosEstudados)
    {
        this.setTempoDecorrido(this.getTempoDecorrido() - segundosEstudados);
        
    }
    
}
