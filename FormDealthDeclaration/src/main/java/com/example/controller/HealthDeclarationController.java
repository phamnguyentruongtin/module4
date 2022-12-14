package com.example.controller;

import com.example.services.IHealthDeclarationServices;
import com.example.model.HealthDeclaration;
import com.example.model.HealthDeclarationDto;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HealthDeclarationController {
    @Autowired
    IHealthDeclarationServices healthDeclarationServices;

    HealthDeclaration healthDeclaration = new HealthDeclaration();
    @GetMapping("healthdeclaration")
    public String showRegister(Model model,HealthDeclarationDto healthDeclarationDto){
        model.addAttribute("HealthDeclarationDto",healthDeclarationDto);
        return "showregister";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute HealthDeclarationDto healthDeclarationDto,Model model){
        BeanUtils.copyProperties(healthDeclarationDto,healthDeclaration);
        healthDeclarationServices.save(healthDeclaration.getId(),healthDeclaration);
        String mess = "send success";
        model.addAttribute("mess",mess);
        return "showregister";

    }

}
