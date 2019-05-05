package ru.spring.functional.scriptbeanshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("ru.spring.functional")
@SpringBootApplication
public class ScriptBeansHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScriptBeansHelloApplication.class, args);
	}

}
