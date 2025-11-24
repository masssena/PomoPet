package com.pomopet.data;

import java.io.Serializable;

public class Student implements Serializable {
    
    //Atributos ->
    
    private static final long serialVersionUID = 1L;
    private String name;
    private double studyTime;
    private boolean studyToday;
    
    // Construtor ->

    public Student() {
    }
    
    public Student(String name) {
        this.name = name;
    }
    
    public Student(String name, double studyTime) {
        this.name = name;
        this.studyTime = studyTime;
        this.studyToday = false;
    }
    
    
    // Métodos Getters e Setters ->
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(double studytime){
        this.studyTime = this.studyTime + studytime;
    };

    public boolean isStudyToday() {
        return studyToday;
    }

    public void setStudyToday(boolean studyToday) {
        this.studyToday = studyToday;
    }
    
}
