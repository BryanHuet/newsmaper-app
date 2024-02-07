package com.project.newsmaper;

public class Country {
    private String name;
    private Integer id;


    public Country(){
        super();
    }
    public Country(String name, Integer id){
        this.name = name;
        this.id = id;
    }

    public String getName(){
        return this.name;
    }
    public Integer getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setId(Integer id){
        this.id=id;
    }

}
