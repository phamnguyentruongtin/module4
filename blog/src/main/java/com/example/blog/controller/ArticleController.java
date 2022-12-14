package com.example.blog.controller;

import com.example.blog.model.Article;
import com.example.blog.model.Author;
import com.example.blog.services.IArticleServices;
import com.example.blog.services.IAuthorServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ArticleController {
    @Autowired
    IArticleServices articleServices;

    @Autowired
    IAuthorServices authorServices;

    @GetMapping("homeblog")
    public String showHomeBlog(Model model,@RequestParam (value = "page",defaultValue = "0")int page, @RequestParam(value = "size",defaultValue = "1")int size) {
        Sort sort = Sort.by("publication_date").and(Sort.by("id_article"));
        model.addAttribute("listAr", articleServices.getAllArticleWithPage(PageRequest.of(page, size,sort)));
        return "homeblog";
    }

    @GetMapping("authorhome")
    public String showHomeAuthor(Model model,@RequestParam (value = "page",defaultValue = "0")int page, @RequestParam(value = "size",defaultValue = "1")int size) {
        model.addAttribute("listAu", authorServices.findAllAuthorWithPage(PageRequest.of(page,size)));
        return "authorhome";
    }

    @GetMapping("showcreateblog")
    public String showCreateBlog(Model model) {
        model.addAttribute("article", new Article());
        model.addAttribute("author", authorServices.findAllAuthor());
        return "createblog";
    }

    @PostMapping("createblog")
    public String doCreateBlog(Article article, RedirectAttributes redirectAt) {
        articleServices.saveArticle(article);
        String sms = "Create Succcess";
        redirectAt.addFlashAttribute("sms", sms);
        return "redirect:homeblog";
    }

    @GetMapping("content")
    public String showConTent(Model model, Integer idBaiBao) {
        Article article = articleServices.getInFoArticle(idBaiBao);
        model.addAttribute("articleContent", article.getContent());
        return "showcontent";
    }

    @GetMapping("delete")
    public String deleteArticle(RedirectAttributes redirectAt, Integer idBaiBao) {
        String sms = "";
        Article article = articleServices.getInFoArticle(idBaiBao);
        sms = "Delete Succcess";

        redirectAt.addFlashAttribute("sms", sms);
        return "redirect:homeblog";
    }

    @GetMapping("edit")
    public String editArticle(Model model, Integer idBaiBao) {
        Article article = articleServices.getInFoArticle(idBaiBao);
        String resover;
        model.addAttribute("article", article);
        model.addAttribute("listAuthor", authorServices.findAllAuthor());
        resover = "showedit";

        return resover;
    }

    @PostMapping("doedit")
    public String doEditArticle(Article article, RedirectAttributes redirectAt) {
        articleServices.saveArticle(article);
        authorServices.saveAuthor(article.getAuthor());
        String sms = "Edit Succcess";
        redirectAt.addFlashAttribute("sms", sms);
        return "redirect:homeblog";
    }

    @GetMapping("getlistarticlebyidauther")
    public String getListArticleByIdAuther(Integer idAuthor, Model model) {
        List<Article> listArticleByIdAuthor = articleServices.listArticleByIdAuthor(idAuthor);
        model.addAttribute("list", listArticleByIdAuthor);
        return "authorarticlelist";
    }

    @GetMapping("createauthor")
    public String showCreateAuthor(Model model) {
        model.addAttribute("author", new Author());
        return "createauthor";
    }

    @PostMapping("docreateauthor")
    public String doCreateAuthor(Author author, RedirectAttributes redirectAttributes) {
        authorServices.saveAuthor(author);
        String sms = "Create Succcess";
        redirectAttributes.addFlashAttribute("sms", sms);
        return "redirect:authorhome";
    }

    @GetMapping("deleteauthor")
    public String deleteAuthor(Integer idAuthor, RedirectAttributes redirectAttributes) {
        Author author = authorServices.findByidAuthor(idAuthor);
        authorServices.removeAuthor(author);
        String sms = "Delete Succcess";
        redirectAttributes.addFlashAttribute("sms", sms);
        return "redirect:authorhome";
    }

    @PostMapping("searcharticle")
    public String searchArticle(@RequestParam Integer idarticle, RedirectAttributes redirectAttributes, Model model) {
        Article article = articleServices.getInFoArticle(idarticle);
        String sms = "";
        String response = "";
        if (article == null) {
            sms = "kh??ng th??? t??m th???y...";
            redirectAttributes.addFlashAttribute("sms", sms);
            response = "redirect:homeblog";
        } else {
            model.addAttribute("article", article);
            response = "searcharticle";
        }

        return response;
    }

    @PostMapping("searchauthor")
    public String searchauthor(@RequestParam Integer idAuthor, RedirectAttributes redirectAttributes, Model model) {
        Author author = authorServices.findByidAuthor(idAuthor);
        String sms = "";
        String response = "";
        if (author == null) {
            sms = "kh??ng th??? t??m th???y...";
            redirectAttributes.addFlashAttribute("sms", sms);
            response = "redirect:authorhome";
        } else {
            model.addAttribute("author", author);
            response = "searchauthor";
        }
        return response;
    }


}

