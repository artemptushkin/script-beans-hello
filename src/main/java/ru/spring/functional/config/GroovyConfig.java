package ru.spring.functional.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.groovy.GroovyBeanDefinitionReader;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.io.ClassPathResource;

@Configuration
@Profile("groovy")
public class GroovyConfig {
	@Autowired
	private GenericApplicationContext applicationContext;

	@PostConstruct
	public void init() {
		GroovyBeanDefinitionReader beanDefinitionReader = new GroovyBeanDefinitionReader(applicationContext);
		beanDefinitionReader.loadBeanDefinitions(new ClassPathResource("foo-script.groovy"));
	}
}
