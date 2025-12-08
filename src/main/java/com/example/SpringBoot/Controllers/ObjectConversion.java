package com.example.SpringBoot.Controllers;

import com.example.SpringBoot.Model.User;
import org.apache.logging.log4j.message.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjectConversion {
    @PostMapping("/")
    public String input_user(@RequestBody User recieved_data){
        System.out.println(recieved_data.getId());
        System.out.println(recieved_data.getName());
        System.out.println(recieved_data.getEmail());
        return "Data inserted successfully";



    }
}
