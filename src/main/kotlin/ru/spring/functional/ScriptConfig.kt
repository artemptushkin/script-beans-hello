package ru.spring.functional

import org.springframework.context.annotation.Bean
import org.springframework.context.support.AbstractApplicationContext
import org.springframework.context.support.GenericApplicationContext
import javax.annotation.PostConstruct
import javax.script.ScriptEngineManager

open class ScriptConfig(private var applicationContext: AbstractApplicationContext) {

    @Bean
    open fun scriptGenericContext(): GenericApplicationContext = GenericApplicationContext()

    @PostConstruct
    fun init() {
        val engine = ScriptEngineManager().getEngineByExtension("kts")

        scriptGenericContext().apply {
            //todo .initialize(this)
            refresh()
        }
        applicationContext.parent = scriptGenericContext()
    }
}