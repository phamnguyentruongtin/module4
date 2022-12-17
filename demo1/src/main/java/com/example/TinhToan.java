package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping(value = "/TinhToan")
public class TinhToan {
    @GetMapping("/home")
    public String TinhToan() {
        return "ketQua";
    }

    @PostMapping(value = "/ketQua")
    public String caculater(Model model,@RequestParam(value = "money")float a) {
        float result = a * 23000;
        model.addAttribute("result", result);
        return "ketQua";
    }
}
