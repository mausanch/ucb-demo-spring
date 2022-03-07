package com.ibm.ucb.demo.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class demoController {
    
    @GetMapping("hello")
    public String hello (){
        return "Hello world, I'm deployed";
    }
}
