package com.example.SpringBoot.Services;

import org.springframework.stereotype.Service;

@Service // Tell the spring create the object and manage their lifecycle
public class GreetingService {
    public String getGreeting(String name ){
        if(name==null||name.isBlank()){
            return "Hello stranger";
        }
        return "Hello"+name;

    }
}
