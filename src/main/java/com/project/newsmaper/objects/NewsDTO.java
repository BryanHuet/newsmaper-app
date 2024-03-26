package com.project.newsmaper.objects;
import java.util.Date;
import java.lang.Comparable;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class NewsDTO implements Comparable<NewsDTO>{
    private Integer id;
    private Integer id_country;
    private Integer id_source;
    private Integer id_date;
    private String title;
    private String link;
    private String description;
    private String media;
    private String source;
    private String newfield;
    private Date date;

    public NewsDTO(Integer id, Integer id_country, Integer id_source,
    Integer id_date, String title, String link, String description, 
    String media, String source, Integer year, Integer month, Integer day, Integer hours){
        this.id=id;
        this.id_country=id_country;
        this.id_source=id_source;
        this.id_date=id_date;
        this.title=title;
        this.link=link;
        this.description=description;
        this.media=media;
        this.source=source;

        SimpleDateFormat format = new SimpleDateFormat("HH/dd/MM/yyyy");
        try{
            this.date = format.parse(String.format("%d/%d/%d/%d", hours, day, month, year));
        }catch (ParseException e) {e.printStackTrace();}    

        this.newfield = this.date.toString();
       
    }

    public Integer getId(){
        return this.id;
    }
    public String getNewField(){
        return this.newfield;
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
    public Date getDate(){
        return this.date;
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

    @Override
    public int compareTo(NewsDTO other) {
        return this.getDate().compareTo(other.getDate());
    }



}
