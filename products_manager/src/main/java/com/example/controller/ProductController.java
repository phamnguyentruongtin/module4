package com.example.controller;

import com.example.model.Product;
import com.example.dto.ProductDto;
import com.example.services.IProductServices;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ProductController {
    @Autowired
    IProductServices services;

    @GetMapping("/producthome")
    public String showMapProduct(Model model) {
        List<ProductDto> listDto =new ArrayList<>();
        for (Product product : services.getData()) {
            ProductDto productDto = new ProductDto();
            BeanUtils.copyProperties(product, productDto);
            listDto.add(productDto);
        }
        model.addAttribute("mapDto", listDto);
        return "home";
    }

    @GetMapping("delete")
    public String delete(@RequestParam(value = "codeproduct") String codeproduct, RedirectAttributes redirectAttributes) {
        Product product = services.findByCode(codeproduct);
        services.delete(product);
        String mess;
        redirectAttributes.addFlashAttribute("msg", mess = "delete success");
        return "redirect:/producthome";
    }
    @GetMapping("/create")
    public String showCreate(Model model){
        ProductDto productDto = new ProductDto();
        model.addAttribute("productDto",productDto);
        return "create";
    }
    @PostMapping("search")
    public String search(@RequestParam(value = "codeSearch") String codeSearch,Model model ){
      Product product=  services.findByCode(codeSearch);
      ProductDto productDto = new ProductDto();
      BeanUtils.copyProperties(product, productDto);
      model.addAttribute("productDto",productDto);
        return "search";
    }

    @GetMapping("edit")
    public String edit(@RequestParam(value = "codeproduct") String codeproduct, Model model) {
        Product product = services.findByCode(codeproduct);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        model.addAttribute("productDto", productDto);
        return "edit";
    }
    @PostMapping("/doedit")
    public String doEdit(ProductDto productDto,RedirectAttributes redirectAttributes){
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        services.save(product,true);
        String mess;
        redirectAttributes.addFlashAttribute("msg", mess = "edit success");
        return "redirect:/producthome";
    }

    @PostMapping("/docreate")
    public String doCreate(ProductDto productDto,RedirectAttributes redirectAttributes){
        Product product = new Product();
        BeanUtils.copyProperties(productDto, product);
        services.save(product,false);
        String mess;
        redirectAttributes.addFlashAttribute("msg", mess = "Create success");
        return "redirect:/producthome";
    }
    @GetMapping("/detail/{codeProduct}")
    public String detail(@PathVariable String codeProduct,Model model){
        Product product = services.findByCode(codeProduct);
        ProductDto productDto = new ProductDto();
        BeanUtils.copyProperties(product, productDto);
        model.addAttribute("productdto",productDto);
        return "detail";
    }
}
