package com.kgpsoft.io.testingvsc.controllers;


import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shelfs")
public class HelloController {

    @GetMapping()
    public String getAllShelf(){

        return "first shelf";
    }

    @GetMapping(path = "/{id}")
    public String getAShelf(@PathVariable("id") String id){

        return id;
    }
    
}
