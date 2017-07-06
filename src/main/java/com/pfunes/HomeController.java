package com.pfunes;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pfunes on 05/07/17.
 */

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showPage(){
        return "main-menu";
    }
}
