package controller

import com.example.demo.controller.ArticleController
import com.example.demo.entity.Article
import com.example.demo.repository.ArticleRepository
import spock.lang.Specification
import spock.lang.Subject

class ArticleControllerTest extends Specification {

    def repository = Mock(ArticleRepository)

    @Subject
    controller = new ArticleController(repository)

    def 'list articles test'() {
        when:
        controller.listArticles()

        then:
        1 * repository.findAll() >> [ new Article() ]
        0 * _
    }
}
