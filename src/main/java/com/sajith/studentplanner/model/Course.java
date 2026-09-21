package com.sajith.studentplanner.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name,professor;
    public Course(){
    }
    public void setId(Long Id){
        this.id=Id;
    }
    public void setName(String nam){
        this.name=nam;
    }
    public void setProfessor(String prof){
        this.professor=prof;
    }
    public Long getId() {
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public String getProfessor(){
        return this.professor;
    }
}
