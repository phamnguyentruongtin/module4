package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MayTinhController {
    @GetMapping("maytinh")
    public String showMayTinh() {
        return "maytinh";
    }

    @PostMapping("result")
    public String tinhToan(float num1, float num2, String opetator, Model model) {
        switch (opetator) {
            case "+":
                float result = num1 + num2;
                model.addAttribute("result", result);
                break;
            case "-":
                float result1 = num1 - num2;
                model.addAttribute("result", result1);
                break;
            case "*":
                float result2 = num1 * num2;
                model.addAttribute("result", result2);
                break;
            case "/":
                float result3 = num1 / num2;
                model.addAttribute("result", result3);
                break;
        }
        return "maytinh";
    }
}
