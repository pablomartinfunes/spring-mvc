package com.pfunes;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by pfunes on 06/07/17.
 */

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm(){
        return "helloworld-form";
    }

    @RequestMapping("/processForm")
    public String processForm(){
        return "helloworld";
    }

    @RequestMapping("/processForm2")
    public String processFormVersionTwo(@RequestParam("studentName") String name, Model model){

        String message = "Hey!! " + name.toUpperCase();

        model.addAttribute("message", message);

        return "helloworld";

    }

}
