package com.example.demo.controller;

import com.example.demo.entity.Article;
import com.example.demo.repository.ArticleRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Objects;

@RestController
public class ArticleController {

    private final ArticleRepository articleRepository;

    public ArticleController(final ArticleRepository articleRepository) {
        this.articleRepository = Objects.requireNonNull(articleRepository, "articleRepository must nut be null.");
    }

    @GetMapping("articles")
    public List<Article> listArticles() {
        return articleRepository.findAll();
    }
}
