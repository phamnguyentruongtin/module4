package com.example.blog.services;

import com.example.blog.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IArticleServices {
    void saveArticle(Article article);
    Page<Article> getAllArticleWithPage(PageRequest page);
    Article getInFoArticle(Integer idArticle);
    boolean removeArticle(Article article);

    List<Article> listArticleByIdAuthor(Integer idAuthor);

}
