package com.icecandylovers.doce.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GelinhoController {

    @RequestMapping("/cadastrarGelinho")
    public String form(){
        return "formGelinho";
    }
}
