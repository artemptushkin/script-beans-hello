package ru.spring.functional

import org.springframework.context.support.beans
import ru.spring.functional.scriptbeanshello.JavaFunctionalInterface

val myBeans = beans {
    bean("helloDslBean") {
        "hello"
    }

    bean("javaFunctionalInterfaceBean") {
        JavaFunctionalInterface {
            "hi from java functional interface"
        }
    }
}