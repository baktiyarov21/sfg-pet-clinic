package com.arsenbaktiyarov.sfgpetclinic.controller;

import com.arsenbaktiyarov.sfgpetclinic.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/vets")
@Controller
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }


    @GetMapping({"","/", "/list",
            "/vets-list", "/vets-list.html", "/vets.html"})
    public String listVets(Model model) {
        model.addAttribute("vets",vetService.findAll());
        return "vets/vets-list";
    }
}
