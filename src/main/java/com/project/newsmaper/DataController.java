package com.project.newsmaper;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.project.newsmaper.objects.Country;
import com.project.newsmaper.objects.News;
import com.project.newsmaper.objects.NewsDTO;
import com.project.newsmaper.repository.NewsRepository;
import java.util.stream.Collectors;
@Controller 
@RequestMapping(path="/data") 
public class DataController {

  @Autowired
  private NewsRepository newsRepository;



    public List<NewsDTO> newsWrapper(List<News> news){
      List<NewsDTO> wrapped = news.stream().map(element -> {
        NewsDTO obj = new NewsDTO(
          element.getId(), element.getIdCountry(), element.getIdSource(), 
          element.getIdDate(), element.getTitle(), element.getLink(),
          element.getDescription(), element.getMedia(), element.getSource(),
          element.getYear(), element.getMonth(), element.getDay(), element.getHours());
        return obj;
       }).collect(Collectors.toList());

       return wrapped;

    }


    @PostMapping(path="/news")
    public @ResponseBody Iterable<NewsDTO> newsByCountry(@RequestBody Country country){
      System.out.println("clicked on "+ country.getName());

      List<News> response = newsRepository.findByCountryId(country.getId());
      List<NewsDTO> news = this.newsWrapper(response); 
      Collections.sort(news, Collections.reverseOrder());

      news = news.stream().limit(12).toList();
      return news;
    }

    @PostMapping(path="/all")
    public @ResponseBody Iterable<NewsDTO> news(){
      System.out.println("all news loaded");

      List<News> response = newsRepository.queryAll();
      List<NewsDTO> news = this.newsWrapper(response); 
      Collections.sort(news, Collections.reverseOrder());

      return news;
    }



}