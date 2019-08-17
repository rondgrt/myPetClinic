package nl.rondgrt.myperclinic.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    private Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping({"", "/", "index", "index.html"})
    public String index() {
        logger.info("Request for homepage of myPetClinic");
        return "index";
    }

    @RequestMapping("/oups")
    public String handleError() {
        return "notimplemented";
    }
}
