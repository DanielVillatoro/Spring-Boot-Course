package com.daniel.curso.springboot.webapp.springboot_webapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.daniel.curso.springboot.webapp.springboot_webapp.models.User;


@Controller
public class UserController {


    @GetMapping("/details")    
    public String details(Model model){
        User user=new User("Daniel","Villatoro");

        model.addAttribute("title","Hola Daniel");
        model.addAttribute("user",user);
        return "details";
    }

}
