package ru.spring.functional

import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.context.support.GenericApplicationContext
import javax.annotation.PostConstruct

@Profile("dslClass")
@Configuration
open class Config(private var applicationContext: ConfigurableApplicationContext) {

    @Bean
    open fun genericContext(): GenericApplicationContext = GenericApplicationContext()

    @PostConstruct
    fun init() {
        genericContext().apply {
            myBeans.initialize(this)
            refresh()
        }
        applicationContext.parent = genericContext()
    }
}