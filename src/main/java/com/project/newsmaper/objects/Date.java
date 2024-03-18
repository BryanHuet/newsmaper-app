package com.project.newsmaper.objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table(name="date")
public class Date {
    @Id
    private Integer id;
    private Integer hours;
    private Integer day;
    private Integer month;
    private Integer year;


    public Date(){
        super();
    }
    public Date(Integer id, Integer hours, Integer day, Integer month, Integer year){
        this.id = id;
        this.hours = hours;
        this.day = day;
        this.month = month;
        this.year = year; 
    }

    public Integer getId(){
        return this.id;
    }
    public Integer getHours(){
        return this.hours;
    }
    public Integer getDay(){
        return this.day;
    }
    public Integer getMonth(){
        return this.month;
    }
    public Integer getYear(){
        return this.year;
    }
   
    public void setId(Integer id){
        this.id=id;
    }
    public void setHours(Integer hours){
        this.hours = hours;
    }
    public void setDay(Integer day){
        this.day = day;
    }
    public void setMonth(Integer month){
        this.month = month;
    }
    public void setYear(Integer year){
        this.year = year;
    }
    
}
