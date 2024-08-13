package com.daniel.curso.springboot.webapp.springboot_webapp.controllers;

// import java.util.HashMap;
// import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.curso.springboot.webapp.springboot_webapp.DTO.UserDto;
import com.daniel.curso.springboot.webapp.springboot_webapp.models.User;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
@RequestMapping("/api")
public class UserRestController {


    // @GetMapping("/details")    
    // public Map<String,Object> details(){
    //     User user=new User("Daniel","Villatoro");
    //     Map<String, Object> body = new HashMap<>();

    //     body.put("title","Hola Daniel");
    //     body.put("user",user);
    //     return body;
    // }
    
    @GetMapping("/details")    
    public UserDto details(){
        User user=new User("Daniel","Villatoro");
        UserDto userDto = new UserDto();
        userDto.setUser(user);
        userDto.setTitle("Hola Daniel");
        return userDto;
    }

}
