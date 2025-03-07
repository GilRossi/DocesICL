package com.icecandylovers.doce.controllers;

import com.icecandylovers.doce.models.Geladinho;
import com.icecandylovers.doce.repositories.GeladinhoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.util.UUID;

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
            // Retorna para o formulário se houver erro
            return "formGelinho";
        }
        // Calcula a validade (fab + 90 dias)
        geladinho.setVal(geladinho.getFab().plusDays(90));
        geladinhoRepository.save(geladinho);
        return "redirect:/cadastrarGelinho";
    }

    @RequestMapping("/gelinhos")
    public ModelAndView listaGelinhos(){
        ModelAndView mv = new ModelAndView("index");
        Iterable<Geladinho> gelinhos = geladinhoRepository.findAll();
        mv.addObject("gelinhos", gelinhos);
        return mv;
    }

    @RequestMapping("/{idGelinho}")
    public ModelAndView detalhesGelinho(@PathVariable("idGelinho")UUID idGelinho){
        Geladinho gelinho = geladinhoRepository.findByIdGelinho(idGelinho);
        ModelAndView mv = new ModelAndView("detalhesGelinho");
        mv.addObject("gelinho", gelinho);
        return mv;
    }
}
