package com.example.controller;

import com.example.model.Product;
import com.example.model.ProductDto;
import com.example.services.IServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.HashMap;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    IServices services;

    @GetMapping("/producthome")
    public String showMapProduct(Model model) {
        Map<String, ProductDto> mapDto = new HashMap<>();
        for (Map.Entry<String, Product> e : services.getData().entrySet()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(e.getValue(), productDto);
            mapDto.put(productDto.getCodeProduct(), productDto);
        }
        model.addAttribute("mapDto", mapDto);
        return "home";
    }

    @GetMapping("delete")
    public String delete(@RequestParam(value = "codeproduct") String codeproduct, RedirectAttributes redirectAttributes) {
        services.delete(codeproduct);
        String mess;
        redirectAttributes.addFlashAttribute("msg", mess = "delete success");
        return "redirect:/producthome";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }

    @GetMapping("edit")
    public String edit(@RequestParam(value = "codeproduct") String codeproduct, Model model) {
        Product product = services.findByCode(codeproduct);
        model.addAttribute("product", product);
        return "edit";
    }
    @PostMapping("/doedit")
    public String doEdit(Product product,RedirectAttributes redirectAttributes){
        services.save(product);
        String mess;
        redirectAttributes.addFlashAttribute("msg", mess = "edit success");
        return "redirect:/producthome";
    }

    @PostMapping("/docreate")
    public String doCreate(Product product,RedirectAttributes redirectAttributes){
        services.save(product);
        String mess;
        redirectAttributes.addFlashAttribute("msg", mess = "Create success");
        return "redirect:/producthome";
    }
    @GetMapping("/detail/{codeProduct}")
    public String detail(@PathVariable String codeProduct,Model model){
        Product product = services.findByCode(codeProduct);
        model.addAttribute("product",product);
        return "detail";
    }
}
