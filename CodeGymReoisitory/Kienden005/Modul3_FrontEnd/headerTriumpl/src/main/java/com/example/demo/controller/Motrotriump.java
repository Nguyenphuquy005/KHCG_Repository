package com.example.demo.controller;

import com.example.demo.model.ListMoto;
import com.example.demo.seervice.ListMotoService;
import com.example.demo.seervice.impl.ListMotoServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Motrotriump {
    @Autowired
    ListMotoService listMotoService;
    @GetMapping("/")
    public String index(Model model ,@PageableDefault(value = 2) Pageable pageable)
    {

        model.addAttribute("mordernClassic", listMotoService.findAllByidModernClassic()) ;
        model.addAttribute("cruiSer",listMotoService.findAllByidCruiser()) ;
        model.addAttribute("roadsters",listMotoService.findAllByidRoadSters()) ;
        model.addAttribute("advventure",listMotoService.findAllByidAdventur()) ;
        model.addAttribute("roket",listMotoService.findAllByidRoket()) ;
        return "triumplmoto";
    }
}
