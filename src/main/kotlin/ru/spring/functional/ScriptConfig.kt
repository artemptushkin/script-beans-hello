package ru.spring.functional

import org.jetbrains.kotlin.cli.common.environment.setIdeaIoUseFallback
import org.springframework.context.ConfigurableApplicationContext
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile
import org.springframework.context.support.BeanDefinitionDsl
import org.springframework.context.support.GenericApplicationContext
import java.nio.file.Files
import java.nio.file.Paths
import javax.annotation.PostConstruct
import javax.script.ScriptEngineManager

@Profile("script")
@Configuration
open class ScriptConfig(private var applicationContext: ConfigurableApplicationContext) {

    @Bean
    open fun scriptGenericContext(): GenericApplicationContext = GenericApplicationContext()

    @PostConstruct
    fun init() {
        setIdeaIoUseFallback()
        val engine = ScriptEngineManager().getEngineByExtension("kts")
        val reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource("script-beans.kts").toURI()))
        val beanDefinitionDsl:BeanDefinitionDsl = engine.eval(reader) as BeanDefinitionDsl

        scriptGenericContext().apply {
            beanDefinitionDsl.initialize(this)
            refresh()
        }
        applicationContext.parent = scriptGenericContext()
    }
}