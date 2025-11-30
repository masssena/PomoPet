/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pomopet.data;
import java.io.Serializable;

/**
 *
 * @author massena
 */
public class Meta implements Serializable {
    private int tempoTotal, tempoRestante;

    public Meta() {
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public int getTempoRestante() {
        return tempoRestante;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = this.tempoRestante = tempoTotal;
    }

    public void setTempoRestante(int tempoRestante) {
        this.tempoRestante = tempoRestante;
    }
    
    public void contadorFinalizado (int segundosEstudados)
    {
        this.setTempoRestante(this.getTempoRestante() - segundosEstudados);
        
    }
    
}
