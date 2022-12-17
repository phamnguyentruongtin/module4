package com.example;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SandwichController {
    List<String> sandwichList = new ArrayList<>();

    @GetMapping("sandwich")
    public String showCreate() {
        return "sandwich";
    }

    @PostMapping("listsandwich")
    public String showLists(@RequestParam("condiment") String giavVi, Model model) {
        sandwichList.add("sandwich + " + giavVi + "\n");
        model.addAttribute("result", sandwichList);
        return "sandwich";
    }
}
