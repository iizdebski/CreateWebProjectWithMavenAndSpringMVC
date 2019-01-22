package com.izdebski;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("")
@Controller
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String pringHello(ModelMap model){
        model.addAttribute("message", "MBT Revolution");
        return "hello";
    }
}