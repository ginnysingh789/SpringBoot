package com.example.SpringBoot.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import javax.print.attribute.standard.MediaSize;

public class User {
    @NotBlank(message="Id should not be empty ")
    private  String id;
    @NotBlank(message = "Name should be empty")
    @Size(max = 20,message = "Not more than 20 words")
    private String name;
    @NotBlank(message = "Should not be empty ")
    @Size(max = 20,message = "Not more than 20 words")
    private String email ;

    public User( String id ,String name ,String email){
        //This constructor is just for reference / Spring use only default constructor

        this.id=id;
        this.name=name;
        this.email=email;

    }

    // Jackson library is used under the hood to centralize and decentralize the data

    //Using Getter and setter for mapping


    public void setId(String id){//Mapping Purpose
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public String getId(){return id ;}//Returning after converting the java object to json
    public String getName(){return  name;}
    public String getEmail(){return  email;}

}
