package com.pomopet.data;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Grupo implements Serializable {

// Atributos ->    
    
    private static final long serialVersionUID = 1L;
    private String groupName;
    private boolean streak;
    private Meta meta = new Meta();
    private int membershipCount;
    private List<User> members;
   
    
// Construtor ->
    
 
    public Grupo(String groupName, int timeMeta, List<User> Membros) {
        this.groupName = groupName;
        this.streak = false;
        this.meta.setTempoTotal(timeMeta);
        this.members = new ArrayList<>();
        for (User membro : Membros) {
            this.members.add(membro);
        }
        this.membershipCount = members.size();
    }
    
    
// Getters e Setters ->
    
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public boolean isStreak() {
        return streak;
    }

    public void setStreak(boolean streak) {
        this.streak = streak;
    }

    public int getMembershipCount() {
        return membershipCount;
    }

    public void setMembershipCount(int membershipCount) {
        this.membershipCount = membershipCount;
    }

    public List<User> getMembers() {
        return members;
    }

    public void setMembers(List<User> members) {
        this.members = members;
    }
    
    public int getTempoTotal() {
        return this.meta.getTempoTotal();
    }

    public int getTempoRestante() {
        return this.meta.getTempoRestante();
    }

    public void setTempoTotal(int tempoTotal) {
        this.meta.setTempoTotal(tempoTotal);
    }

    public void setTempoRestante(int tempoRestante) {
        this.meta.setTempoRestante(tempoRestante);
    }
    
    public void contadorFinalizado (int segundosEstudados)
    {
        this.meta.setTempoRestante(this.meta.getTempoRestante() - segundosEstudados);
        
    }
    
    //Sobreposição do toString() ->
    
    @Override
    public String toString() {
        return groupName + " - " + members.size() + " Membros "  + " - Meta: " + (this.meta.getTempoTotal())/60 + " min/dia - " + this.meta.getTempoRestante()/60 + "min" + this.meta.getTempoRestante()%60 + "s restante";
    }
}
