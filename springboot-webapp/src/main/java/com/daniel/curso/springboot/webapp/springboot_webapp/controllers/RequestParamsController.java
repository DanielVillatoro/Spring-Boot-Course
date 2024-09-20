package com.daniel.curso.springboot.webapp.springboot_webapp.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daniel.curso.springboot.webapp.springboot_webapp.DTO.ParamDto;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/params")
public class RequestParamsController {
    
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamDto bar(@RequestParam String text, @RequestParam Integer code) {
        ParamDto param = new ParamDto();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }
    
    @GetMapping("request")
    public ParamDto request(HttpServletRequest request) {
        Integer code=0;
        try {
            code=Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
        ParamDto param = new ParamDto();
        param.setMessage(request.getParameter("message"));
        param.setCode(code);
        return param;
    }
    
}
