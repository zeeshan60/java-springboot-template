package com.zeenom.java_springboot_template

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@SpringBootTest
@ContextConfiguration(classes = JavaSpringBootTemplateApplication)
class JavaSpringBootTemplateApplicationSpec extends Specification {

    @Autowired
    ApplicationContext applicationContext

    def "contextLoads"() {
        expect:
        applicationContext != null
    }
}