/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pomopet.data;

/**
 *
 * @author massena
 */
public class Contador {
    /* 
        essa classe precisa ser declarada como objeto dentro do código do JFrameForm que possuir o timer
        
        é necessário declarar um objeto Timer (para isso precisa-se das bibliotecas 
        import java.awt.event.*;
        import javax.swing.*;
        
        ainda é necessário implementar os critérios de parada do timer 
        e a garantia de que ele só vai ser ligado 1 vez
        também a implementação dos métodos get/set
    
        esse trecho precisa estar no JFrameForm tb
        
        Timer timer = new Timer(1000, new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent e){
            if(count.tempoRestante>0)
                count.tempoRestante-=1000;
            count.formatarTimer();
            LabelTeste.setText(count.stringHoras+":"+count.stringMinutos+":"+count.stringSegundos);
            }
        });
        timer.start();
    */
    
    private int tempoTotal;
    private int tempoRestante;
    private int segundos = 0, minutos=0, horas=0;
    private boolean iniciado = false;
    
    private String stringSegundos = String.format("%02d", segundos);
    private String stringMinutos = String.format("%02d", minutos);
    private String stringHoras = String.format("%02d", horas);

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }

    public void setTempoRestante(int tempoRestante) {
        this.tempoRestante = tempoRestante;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setIniciado(boolean iniciado) {
        this.iniciado = iniciado;
    }

    public void setStringSegundos(String stringSegundos) {
        this.stringSegundos = stringSegundos;
    }

    public void setStringMinutos(String stringMinutos) {
        this.stringMinutos = stringMinutos;
    }

    public void setStringHoras(String stringHoras) {
        this.stringHoras = stringHoras;
    }

    public int getTempoTotal() {
        return tempoTotal;
    }

    public int getTempoRestante() {
        return tempoRestante;
    }

    public int getSegundos() {
        return segundos;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getHoras() {
        return horas;
    }

    public boolean isIniciado() {
        return iniciado;
    }

    public String getStringSegundos() {
        return stringSegundos;
    }

    public String getStringMinutos() {
        return stringMinutos;
    }

    public String getStringHoras() {
        return stringHoras;
    }
    
    public void formatarTimer()
    {
        horas = tempoRestante/3600000;
        minutos = (tempoRestante/60000)%60;
        segundos = (tempoRestante/1000)%60;
            
        stringSegundos = String.format("%02d", segundos);
        stringMinutos = String.format("%02d", minutos);
        stringHoras = String.format("%02d", horas);
    }
    
    //recebe o parâmetro em segundos e converte em milisegundos
    public void setTempo(int tempo) {
        this.tempoRestante = this.tempoTotal = tempo*1000;
        formatarTimer();
    }

}
