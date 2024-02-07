package com.project.newsmaper;

import javax.print.attribute.standard.Media;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import okhttp3.MediaType;

@Controller
public class MapController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping(value = "/countries")
    public String test(@RequestBody Country country){
        System.out.println("posted here");
        System.out.println(country.getName());
        System.out.println(country.getId());
       return "index";
    }

}
