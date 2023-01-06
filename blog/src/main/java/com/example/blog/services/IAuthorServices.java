package com.example.blog.services;

import com.example.blog.model.Author;

import java.util.List;

public interface IAuthorServices {
    void saveAuthor(Author author);
    void removeAuthor (Author author);

    Author findByidAuthor(Integer id);

    List<Author>  findAllAuthor();
}
