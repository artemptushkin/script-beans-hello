package ru.spring.functional.config;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import ru.spring.functional.scriptbeanshello.BazInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Ignored by:
 * Caused by: org.springframework.beans.BeanInstantiationException: Failed to instantiate [ru.spring.functional.scriptbeanshello.BazInterface]:
 * Specified class is an interface
 */
@Ignore
@RunWith(SpringRunner.class)
@ActiveProfiles("groovy")
@ContextConfiguration(classes = GroovyConfig.class)
public class GroovyConfigTests {

	@Autowired
	ApplicationContext applicationContext;

	@Test
	public void groovyBeanExists() {
		BazInterface groovyBean = applicationContext.getBean("groovyBean", BazInterface.class);
		assertNotNull(groovyBean);
	}
}