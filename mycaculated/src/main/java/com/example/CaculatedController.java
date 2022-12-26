package com.example;

import com.example.caculatedservices.ICaculatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CaculatedController {
    @Autowired
    ICaculatedService caculatedService;

    @GetMapping("caculated")
    public String showCaculated() {
        return "caculated";
    }

    @PostMapping("result")
    public String caculatedResult(float number1, float number2, String opetator, Model model) {
      float result =  caculatedService.caculated(number1,number2,opetator);
      model.addAttribute("result",result);
        return "caculated";
    }
}
