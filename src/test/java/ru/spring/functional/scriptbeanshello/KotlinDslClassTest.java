package ru.spring.functional.scriptbeanshello;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KotlinDslClassTest {

	@Autowired
	ApplicationContext applicationContext;
	@Autowired
	String helloDslBean;

	@Autowired
	List<ApplicationContext> contexts;

	@Test
	public void contextLoads() {
		assertNotNull(applicationContext.getBean("helloDslBean"));
		assertNotNull(applicationContext.getBean("javaFunctionalInterfaceBean"));
	}

}
