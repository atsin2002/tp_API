package com.example.Projet.Tp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.example.Projet.Tp3.model.Address;
import com.example.Projet.Tp3.model.AddressRepository;

import jakarta.validation.Valid;

import org.springframework.ui.Model;

@Controller
public class MeteoController {
    @Autowired

    RestTemplate template;
    @GetMapping("/meteo")
    public String addAdresse(@RequestParam("addresse") String addrese,Model model){
        model.addAttribute("addresse", addrese);
        return "meteo";
    }
    @PostMapping("/meteo")
    public String submitddresse(@RequestParam("addresse") String addrese,Model model){
        model.addAttribute("addresse", addrese);

        return "meteo";




    }

}


