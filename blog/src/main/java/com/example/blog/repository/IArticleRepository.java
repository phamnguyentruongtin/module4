package com.example.blog.repository;

import com.example.blog.model.Article;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IArticleRepository extends JpaRepository<Article,Integer> {
    Article findArticleByidArticle(Integer id);
    @Query(value = "select * from article ar  where ar.author = ?1 order by ar.id_article", nativeQuery = true)
    List<Article> listArticleByIdAuthor(Integer idAuthor);
    @Query(value = "select * from article",nativeQuery = true)
    Page<Article> findAllArticleWithPage(PageRequest page);
}
