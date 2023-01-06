package com.example.blog.model;

import javax.persistence.*;
@Table(name = "article")
@Entity
public class Article {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_article")
    private Integer idArticle;
    private String nameArticle;
    private String content;
    private String publicationDate;
    @ManyToOne()
    @JoinColumn(name = "author")
    private Author author;

    public Article(Integer idArticle, String nameArticle, String content, String publicationDate, Author author) {
        this.idArticle = idArticle;
        this.nameArticle = nameArticle;
        this.content = content;
        this.publicationDate = publicationDate;
        this.author = author;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Article() {
    }

    public Integer getIdArticle() {
        return idArticle;
    }

    public void setIdArticle(Integer idArticle) {
        this.idArticle = idArticle;
    }

    public String getNameArticle() {
        return nameArticle;
    }

    public void setNameArticle(String nameArticle) {
        this.nameArticle = nameArticle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
