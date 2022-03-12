package com.fly.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class PageController{

@GetMapping("/home")
public String home(@RequestParam(required = false) String nom, ModelMap modelMap){
    //String nom = request.getParameter("nom");
    modelMap.put("nom",nom);
   // System.out.println("\n\n\n\n"+nom+"\n\n\n");
    return "pages/hello";
}
}