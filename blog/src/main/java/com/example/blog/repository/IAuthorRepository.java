package com.example.blog.repository;

import com.example.blog.model.Author;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface IAuthorRepository extends JpaRepository<Author,Integer> {
    Author findAuthorByidAuthor(Integer id);
    @Query(value = "select * from author",nativeQuery = true)
    Page<Author> findAllWithPage(PageRequest page);
}
