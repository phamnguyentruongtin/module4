package com.example.blog.services;

import com.example.blog.model.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;

public interface IAuthorServices {
    void saveAuthor(Author author);
    void removeAuthor (Author author);

    Author findByidAuthor(Integer id);

    Page<Author> findAllAuthorWithPage(PageRequest pageRequest);
    List<Author> findAllAuthor();
}
