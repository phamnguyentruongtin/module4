package com.example.blog.repository;

import com.example.blog.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IAuthorRepository extends JpaRepository<Author,Integer> {
    Author findAuthorByidAuthor(Integer id);

}
