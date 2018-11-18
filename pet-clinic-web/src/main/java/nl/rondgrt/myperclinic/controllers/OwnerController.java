package nl.rondgrt.myperclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/owners/index", "/owners/index.hyml"})
    public String listOwners() {
        return "owners/index";
    }
}
