package com.example.SpringBoot.Controllers;

import com.example.SpringBoot.Services.GreetingService;
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

}
