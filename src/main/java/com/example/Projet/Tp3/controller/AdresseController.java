package com.example.Projet.Tp3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.Projet.Tp3.model.Address;
import com.example.Projet.Tp3.model.AddressRepository;


import org.springframework.ui.Model;

@Controller
public class AdresseController {
    @Autowired
    AddressRepository addressRepository;
    @GetMapping("/addresse")
    public String showAdresse(Model model){
        model.addAttribute("addresse",model);
        return "addresse";
    }
    
 }


