package com.ych500.demo.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/test")
public class BasicController {

    @GetMapping
    public HashMap<String, String> getById(){
        HashMap<String,String> test = new HashMap();
        for(int i=0;i<100;i++){
            test.put(i+" : nnnnn","adadadad");
        }

        System.out.println("test ok");
        return test;
    }
}
