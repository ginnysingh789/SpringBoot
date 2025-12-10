package com.example.SpringBoot.Controllers;

import com.example.SpringBoot.Services.GreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Routes {
    private final GreetingService greetingService;

    public Routes(GreetingService greetingService){//It is dependency before running this route first pick the object from the application context.
        this.greetingService=greetingService;//Right one is recieved one and left one is assiging one
    }

@GetMapping("/")
    public String sayHello(@RequestParam(required = false) String name){
        return greetingService.getGreeting(name);

}
    @Value("${app.welcome.message}")
    private  String welcomeMessage;


    @GetMapping("/check")
        public String checkEnv() {
        return welcomeMessage;
    }
    @GetMapping("/public")
    public String publicEndpoint(){
        return "You are public User ";

    }
    @GetMapping("/secret")
    public String secretEndpoint(){
        System.out.println("Secret endpoint is hited ");
        return "Secret Endpoint ";
    }

}
