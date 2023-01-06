package com.example.blog.services;

import com.example.blog.model.Author;
import com.example.blog.repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorServices implements IAuthorServices{
    @Autowired
   private IAuthorRepository authorRepository;
    @Override
    public void saveAuthor(Author author) {
        authorRepository.save(author);
    }

    @Override
    public void removeAuthor(Author author) {
        authorRepository.delete(author);
    }

    @Override
    public Author findByidAuthor(Integer id) {
        Author author =  authorRepository.findAuthorByidAuthor(id);
        return author;
    }


    @Override
    public List<Author> findAllAuthor() {
        List<Author> authorList = authorRepository.findAll();
        return authorList;
    }

}
