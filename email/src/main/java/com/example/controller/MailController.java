package com.example.controller;

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
public class MailController {
    List<Mail> mailList = new ArrayList<>();
    @GetMapping("showsend")
    public String sendMail(Model model) {
        List<String> languageList = new ArrayList<>();
        languageList.add("En");
        languageList.add("Vn");
        languageList.add("Cn");
        languageList.add("Jp");
        List<Integer> pageList = new ArrayList<>();
        pageList.add(5);
        pageList.add(10);
        pageList.add(15);
        pageList.add(20);
        pageList.add(25);
        pageList.add(50);
        pageList.add(100);
        Mail mail;
        model.addAttribute("pageList",pageList);
        model.addAttribute("languagerList",languageList);
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
