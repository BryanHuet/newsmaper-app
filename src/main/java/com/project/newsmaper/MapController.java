package com.project.newsmaper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MapController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/articles")
    public String articles(){
        return "articles";
    }

}
