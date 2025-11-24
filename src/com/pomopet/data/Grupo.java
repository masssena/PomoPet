package com.pomopet.data;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;

public class Grupo implements Serializable {

// Atributos ->    
    
    private static final long serialVersionUID = 1L;
    private String groupName;
    private boolean streak;
    private int timeTarget;
    private int membershipCount;
    private List<User> members;

// Construtor ->
    
    public Grupo(String groupName, int timeTarget,List<User> Membros) {
        this.groupName = groupName;
        this.streak = false;
        this.timeTarget = timeTarget;
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

    public int getTimeTarget() {
        return timeTarget;
    }

    public void setTimeTarget(int timeTarget) {
        this.timeTarget = timeTarget;
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
    
    //Sobreposição do toString() ->
    
    @Override
    public String toString() {
        return groupName + " - " + members.size() + " Membros "  + " - Meta: " + timeTarget + " min/dia";
    }
}
