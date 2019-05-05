package ru.spring.functional

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.AbstractApplicationContext
import org.springframework.context.support.GenericApplicationContext
import javax.annotation.PostConstruct

@Configuration
open class Config(private var applicationContext: AbstractApplicationContext) {

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