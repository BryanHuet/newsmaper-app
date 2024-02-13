package com.project.newsmaper;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller 
@RequestMapping(path="/demo") 
public class DataController {
  @Autowired
  private CountriesRepository countriesRepository;
  @Autowired
  private NewsRepository newsRepository;

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Country> getAllUsers() {
    // This returns a JSON or XML with the users
    return countriesRepository.findAll();
  }


    @PostMapping(path="/countries")
    public @ResponseBody Country test(@RequestBody Country country){
        System.out.println("posted here");
        System.out.println(country.getName());
        System.out.println(country.getId());
        Country finded = countriesRepository.findById(country.getId()).get();
       return finded;
    }

    @PostMapping(path="/news")
    public @ResponseBody Iterable<News> test2(@RequestBody Country country){
        System.out.println("posted here");
        System.out.println(country.getName());
        System.out.println(country.getId());

       return newsRepository.findByCountryId(country.getId());
    }



}