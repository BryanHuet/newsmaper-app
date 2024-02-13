package com.project.newsmaper;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="news")
public class News {
    @Id
    private Integer id;
    private Integer country_id;
    private String source;
    private String title;
    private String link;
    private String origin;
    private String timestamp;

    public News(){
        super();
    }

    public News(Integer id, Integer country_id, String source,
    String title, String link, String origin, String timestamp){
        this.id=id;
        this.country_id=country_id;
        this.source=source;
        this.title=title;
        this.link=link;
        this.origin=origin;
        this.timestamp=timestamp;
    }

    public Integer getId(){
        return this.id;
    }
    public Integer getCountryId(){
        return this.country_id;
    }
    public String getSource(){
        return this.source;
    }
    public String getTitle(){
        return this.title;
    }
    public String getLink(){
        return this.link;
    }
    public String getOrigin(){
        return this.origin;
    }
    public String getTimestamp(){
        return this.timestamp;
    }

    public void setId(Integer id){
        this.id=id;
    }
    public void setCountryId(Integer country_id){
        this.country_id=country_id;
    }
    public void setSource(String source){
        this.source = source;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setLink(String link){
        this.link=link;
    }
    public void setOrigin(String origin){
        this.origin=origin;
    }
    public void setTimestamp(String timestamp){
        this.timestamp = timestamp;
    }


}
