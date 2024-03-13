package com.spring.training.controllers;

import com.spring.training.services.GreetingService;
import com.spring.training.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String sayHello(){
        System.out.println("I AM CONTROLLER");
        return greetingService.sayGreeting();
    }
}
