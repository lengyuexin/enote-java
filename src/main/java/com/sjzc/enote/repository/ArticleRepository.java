package com.sjzc.enote.repository;

import com.sjzc.enote.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {

    //查询该用户所有文章

    @Query(value = "select * from  article where author =?1", nativeQuery = true)
    List<Article> findArticlesByAuthor(@Param("author") String author);

}


