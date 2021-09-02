package com.arsenbaktiyarov.sfgpetclinic.controller;

import com.arsenbaktiyarov.sfgpetclinic.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }


    @GetMapping({"","/", "/list",
            "/owners-list","/owners-list.html"})
    public String listOfOwners(Model model) {
        model.addAttribute("owners", ownerService.findAll());
        return "owners/owners-list";
    }

    @GetMapping({"/find", "/oups"})
    public String findOwners() {
        return "notimplemented";
    }


}
