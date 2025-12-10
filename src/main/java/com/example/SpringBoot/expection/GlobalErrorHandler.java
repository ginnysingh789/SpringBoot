package com.example.SpringBoot.expection;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice // Handle Global error in the project
//Spring  not return too friendly error and proper context
public class GlobalErrorHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public String MethodArgument(MethodArgumentNotValidException ex){
        StringBuilder msg=new StringBuilder("Validate Failed");
        System.out.println("Get Binding reuslt -> "+ex.getBindingResult().getFieldError());
        if (ex.getBindingResult().getFieldError()!=null){
            var fieldError=ex.getBindingResult().getFieldError();
            msg.append(fieldError.getField()).append(" ").append(fieldError.getDefaultMessage());

        }else{
            msg.append("Unknown Field error");
        }
        return msg.toString();
    }




}
