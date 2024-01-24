package com.project.newsmaper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GeocodingController {

    @GetMapping("/")
    public String home() {
        return "index";
    }
}