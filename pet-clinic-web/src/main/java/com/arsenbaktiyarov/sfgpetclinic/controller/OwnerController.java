package com.arsenbaktiyarov.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {
    @GetMapping({"","/", "/list",
            "/owners-list","/owners-list.html"})
    public String listOfOwners() {
        return "owners/owners-list";
    }
}
