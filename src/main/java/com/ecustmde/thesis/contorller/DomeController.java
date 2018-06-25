package com.ecustmde.thesis.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class DomeController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
