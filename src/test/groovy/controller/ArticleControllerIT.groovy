package controller

import com.example.demo.DemoApplication
import com.example.demo.controller.ArticleController
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootContextLoader
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification

import static org.hamcrest.Matchers.*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

@SpringBootTest
@ContextConfiguration(loader = SpringBootContextLoader.class, classes = DemoApplication.class)
class ArticleControllerIT extends Specification {

    MockMvc mockMvc

    @Autowired
    ArticleController controller

    def setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(controller).build()
    }

    def "list articles IT test"() {
        when:
        def response = mockMvc.perform(get("/articles"))

        then:
        response.andExpect(status().isOk())
        response.andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
        response.andExpect(jsonPath('$', is(not(empty()))))

        and:
        System.out.println("Test Result: " + response.andReturn().response.contentAsString)
    }

}
