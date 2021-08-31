package com.arsenbaktiyarov.sfgpetclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping({"","/","index/page", "index.html" })
    public String index()  {
        return "index";
    }
}
