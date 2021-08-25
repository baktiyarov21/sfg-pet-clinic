package com.arsenbaktiyarov.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VetController {
    @GetMapping({"/vets", "vets/index", "vets/vets-list"})
    public String listVets() {
        return "vets/vets-list";
    }
}
