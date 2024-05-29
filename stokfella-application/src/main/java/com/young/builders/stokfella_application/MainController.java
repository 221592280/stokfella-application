package com.young.builders.stokfella_application;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {


    @GetMapping("/")
    public String index() {


        return "index";
    }
}
