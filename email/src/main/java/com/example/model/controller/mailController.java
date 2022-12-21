package com.example.model.controller;

import com.example.model.Mail;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("mail")
public class mailController {
    List<Mail> mailList = new ArrayList<>();
    @GetMapping("showsend")
    public String sendMail(Model model) {
        Mail mail;
        model.addAttribute("email", mail = new Mail());
        return "showcreate";
    }

    @PostMapping("dosend")
    public String doSendMail(@ModelAttribute("email")Mail mail,Model model ) {
        String mess = "Success";
        model.addAttribute("mess",mess);
        mailList.add(mail);
        return "showcreate";
    }
    @GetMapping("showlistsend")
    public String listMail(Model model){
        model.addAttribute("mailList",mailList);
        return "showlist";
    }

}
