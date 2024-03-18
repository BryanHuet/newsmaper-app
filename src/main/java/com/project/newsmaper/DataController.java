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
import com.project.newsmaper.repository.NewsRepository;

@Controller 
@RequestMapping(path="/data") 
public class DataController {

  @Autowired
  private NewsRepository newsRepository;

    @PostMapping(path="/news")
    public @ResponseBody Iterable<News> test2(@RequestBody Country country){
        System.out.println("clicked on "+ country.getName());
        List<News> result = newsRepository.findByCountryId(country.getId());
        Collections.shuffle(result);
        result = result.stream().limit(12).toList();
       return result;

    }



}