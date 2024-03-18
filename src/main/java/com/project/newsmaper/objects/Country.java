package com.project.newsmaper.objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity 
@Table(name="countries")
public class Country {
    @Id
    private Integer id;
    private String name;
    private String capital;


    public Country(){
        super();
    }
    public Country(String name, Integer id, String capital){
        this.name = name;
        this.id = id;
        this.capital = capital;
    }

    public String getName(){
        return this.name;
    }
    public Integer getId(){
        return this.id;
    }
    public String getCapital(){
        return this.capital;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(Integer id){
        this.id=id;
    }
    public void setCapital(String capital){
        this.capital=capital;
    }

}
