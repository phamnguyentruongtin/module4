package com.example.blog.services;

import com.example.blog.model.Article;
import com.example.blog.repository.IArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServices implements IArticleServices{
    @Autowired
    private IArticleRepository articleRepository;
    @Override
    public void saveArticle(Article article) {
        articleRepository.save(article);
    }

    @Override
    public Page<Article> getAllArticleWithPage(PageRequest page) {

        return articleRepository.findAllArticleWithPage(page);
    }


    @Override
    public Article getInFoArticle(Integer idArticle) {
        Article article = articleRepository.findArticleByidArticle(idArticle);
        return article;
    }

    @Override
    public boolean removeArticle(Article article) {
        articleRepository.delete(article);
        return false;
    }
    @Override
    public List<Article> listArticleByIdAuthor(Integer idAuthor) {
        List<Article> articles = articleRepository.listArticleByIdAuthor(idAuthor);
        return articles;
    }
}
