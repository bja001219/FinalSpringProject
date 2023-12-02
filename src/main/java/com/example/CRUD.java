package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CRUD {

    @RequestMapping("/")
    public String home(){
        System.out.println("Home~");
        return "test";
    }
}
