package com.example.web.article;

import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends  CrudRepository<Article,Long> {

}
