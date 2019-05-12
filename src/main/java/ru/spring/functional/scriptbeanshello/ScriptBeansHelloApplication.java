package ru.spring.functional.scriptbeanshello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static org.jetbrains.kotlin.cli.common.environment.UtilKt.setIdeaIoUseFallback;

@ComponentScan("ru.spring.functional")
@SpringBootApplication
public class ScriptBeansHelloApplication {

	public static void main(String[] args) {
		setIdeaIoUseFallback();
		SpringApplication.run(ScriptBeansHelloApplication.class, args);
	}

}
