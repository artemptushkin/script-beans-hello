package ru.spring.functional.scriptbeanshello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@ActiveProfiles("script")
@SpringBootTest
public class KotlinBeanFronScriptTest {

	@Autowired
	ApplicationContext applicationContext;
	@Autowired
	String helloDslBean;
	@Autowired
	JavaFunctionalInterface javaFunctionalInterfaceBean;
	@Autowired
	SomeLambdaInterface someLambdaInterfaceBean;

	@Autowired
	List<ApplicationContext> contexts;

	@Test
	public void contextLoads() {
		assertNotNull(applicationContext.getBean("helloDslBean"));
		assertNotNull(applicationContext.getBean("javaFunctionalInterfaceBean"));

		assertEquals("hi from java functional interface", javaFunctionalInterfaceBean.hi());

		assertTrue(someLambdaInterfaceBean.test(12));
	}

}
