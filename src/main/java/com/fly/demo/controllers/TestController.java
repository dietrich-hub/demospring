package com.fly.demo.controllers;

import com.fly.demo.model.Message;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class TestController {
    private List<Message> messageList = new ArrayList<>();

    @PostMapping("/test")
    public  String postMessage(@ModelAttribute Message newMessage){
       messageList.add(newMessage);
       return "redirect:test";
    }
    @GetMapping("/test")
    public String btest(Model model){
        model.addAttribute("newMessage", new Message());
        model.addAttribute("test","TEST");
        model.addAttribute("msgList",messageList);
        return "pages/test";
    }
}
