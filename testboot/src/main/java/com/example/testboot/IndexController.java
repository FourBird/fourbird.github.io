package com.example.testboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/indexhell")
public class IndexController {

    @RequestMapping("/indexabc")
    public String index(){
        return "Hello  springboot";
    }
    
}
