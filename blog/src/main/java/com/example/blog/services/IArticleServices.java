package com.example.blog.services;

import com.example.blog.model.Article;

import java.util.List;

public interface IArticleServices {
    void saveArticle(Article article);
    List<Article> getAllArticle();
    Article getInFoArticle(Integer idArticle);
    boolean removeArticle(Article article);

    List<Article> listArticleByIdAuthor(Integer idAuthor);

}
