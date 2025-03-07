package com.icecandylovers.doce.controllers;

import com.icecandylovers.doce.models.Geladinho;
import com.icecandylovers.doce.repositories.GeladinhoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;

@Controller
public class GelinhoController {

    @Autowired
    private GeladinhoRepository geladinhoRepository;

    @RequestMapping(value = "/cadastrarGelinho", method = RequestMethod.GET)
    public String form(){
        return "gelinhos/formGelinho";
    }

    @RequestMapping(value = "/cadastrarGelinho", method = RequestMethod.POST)
    public String form(@Valid @ModelAttribute("geladinho") Geladinho geladinho, BindingResult result) {
        if (result.hasErrors()) {
            return "formGelinho"; // Retorna para o formulário se houver erro
        }

        // Calcula a validade (fab + 90 dias)
        geladinho.setVal(geladinho.getFab().plusDays(90));

        geladinhoRepository.save(geladinho);
        return "redirect:/cadastrarGelinho";
    }
}
