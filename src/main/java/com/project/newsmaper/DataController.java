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

  @GetMapping(path="/all")
  public @ResponseBody Iterable<Country> getAllUsers() {
    // This returns a JSON or XML with the users
    return countriesRepository.findAll();
  }


    @PostMapping(path="/countries")
    public @ResponseBody String test(@RequestBody Country country){
        System.out.println("posted here");
        System.out.println(country.getName());
        System.out.println(country.getId());
        Country finded = countriesRepository.findById(country.getId()).get();
       return finded.getCapital();
    }


}