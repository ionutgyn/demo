package com.example.demo.controller

import com.example.demo.repository.ArticleRepository
import spock.lang.Specification
import spock.lang.Subject

import static com.example.demo.data.ArticleData.anArticle

class ArticleControllerTest extends Specification {

    def repository = Mock(ArticleRepository)

    @Subject
    controller = new ArticleController(repository)

    def 'list articles UT test'() {
        when:
        def result = controller.listArticles()

        then:
        1 * repository.findAll() >> articles
        0 * _

        and:
        result.isEmpty() == articles.isEmpty()

        where:
        articles << [ [], [ anArticle() ] ]
    }
}
