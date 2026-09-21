package com.sajith.studentplanner.model;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
public class Deadline {
    public Deadline(){
    }
    @GeneratedValue @Id
     private Long id;
     private String title;
     private LocalDate dueDate;
     private boolean completed;
     @ManyToOne(fetch= FetchType.EAGER)
     private Course course;
     public Long getId(){
         return this.id;
     }
     public String getTitle(){
         return this.title;
     }
     public LocalDate getDueDate(){
         return this.dueDate;
     }
     public boolean isCompleted(){
         return this.completed;
     }
     public Course getCourse(){
         return this.course;
     }
     public void setId(Long Id){
         this.id=Id;
     }
     public void setTitle(String Title){
         this.title=Title;
     }
     public void setDueDate(LocalDate due)
     {
         this.dueDate=due;
     }
     public void setCompleted(boolean complete){
         this.completed=complete;
     }
     public void setCourse(Course courses){
         this.course=courses;
     }

}
