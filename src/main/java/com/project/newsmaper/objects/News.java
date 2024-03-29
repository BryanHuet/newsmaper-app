package com.project.newsmaper.objects;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="news")
public class News {
    @Id
    private Integer id;
    private Integer id_country;
    private Integer id_source;
    private Integer id_date;
    private String title;
    private String link;
    private String description;
    private String media;
    private String source;
    private Integer year;
    private Integer month;
    private Integer day;
    private Integer hours;

    public News(){
        super();
    }

    public News(Integer id, Integer id_country, Integer id_source,
    Integer id_date, String title, String link, String description, 
    String media, String source, Integer year, Integer month,
    Integer day, Integer hours){
        this.id=id;
        this.id_country=id_country;
        this.id_source=id_source;
        this.id_date=id_date;
        this.title=title;
        this.link=link;
        this.description=description;
        this.media=media;
        this.source=source;
        this.year=year;
        this.month=month;
        this.day=day;
        this.hours=hours;
    }

    public Integer getId(){
        return this.id;
    }
    public Integer getIdCountry(){
        return this.id_country;
    }
    public Integer getIdSource(){
        return this.id_source;
    }
    public Integer getIdDate(){
        return this.id_date;
    }
    public String getTitle(){
        return this.title;
    }
    public String getLink(){
        return this.link;
    }
    public String getDescription(){
        return this.description;
    }
    public String getMedia(){
        return this.media;
    }
    public String getSource(){
        return this.source;
    }
    public Integer getYear(){
        return this.year;
    }
    public Integer getMonth(){
        return this.month;
    }
    public Integer getDay(){
        return this.day;
    }
    public Integer getHours(){
        return this.hours;
    }
    
    
    public void setId(Integer id){
        this.id=id;
    }
    public void setIdCountry(Integer id_country){
        this.id_country = id_country;
    }
    public void setIdSource(Integer id_source){
        this.id_source = id_source;
    }
    public void setIdDate(Integer id_date){
        this.id_date=id_date;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setLink(String link){
        this.link=link;
    }
    public void setMedia(String media){
        this.media=media;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setSource(String source){
        this.source = source;
    }
    public void setYear(Integer year){
        this.year=year;
    }
    public void setMonth(Integer month){
        this.month=month;
    }
    public void setDay(Integer day){
        this.day=day;
    }
    public void setHours(Integer hours){
        this.hours=hours;
    }


}
