package com.icecandylovers.doce.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GelinhoController {

    @RequestMapping("/cadastrarGelinho")
    public String form(){
        return "gelinhos/formGelinho";
    }
}
