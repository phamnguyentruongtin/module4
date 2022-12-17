package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TuDien {
    static Map<String,String> danhSachTuDien = new HashMap<String, String>() {
    };
    static {
        danhSachTuDien.put("Dog","Con Cho");
        danhSachTuDien.put("Cat","Con Meo");
        danhSachTuDien.put("Cow","Con Bo");
        danhSachTuDien.put("Pig","Con Lon");
    }
    @GetMapping("/tracuu")
    public String param(){
        return "Tudien";
    }
    @PostMapping("/ketqua")
   public String ketQua(Model model, @RequestParam String word){
       String result = danhSachTuDien.get(word);
       model.addAttribute("result",result);
        return "Tudien";
   }
}
