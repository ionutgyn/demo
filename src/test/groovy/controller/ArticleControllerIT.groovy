package controller

import com.example.demo.DemoApplication
import com.example.demo.controller.ArticleController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootContextLoader
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration(loader = SpringBootContextLoader.class, classes = DemoApplication.class)
class ArticleControllerIT extends Specification {

    @Autowired
    ArticleController controller

    def "list articles IT test"() {
        when:
        def result = controller.listArticles()

        then:
        !result.isEmpty()
    }

}
