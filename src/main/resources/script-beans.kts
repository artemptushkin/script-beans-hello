
import org.springframework.context.support.beans
import ru.spring.functional.scriptbeanshello.JavaFunctionalInterface
import ru.spring.functional.scriptbeanshello.SomeLambdaInterface

beans {
    bean("helloDslBean") {
        "hello"
    }

    bean("javaFunctionalInterfaceBean") {
        JavaFunctionalInterface {
            "hi from java functional interface"
        }
    }

    bean("someLambdaInterface") {
        SomeLambdaInterface {
            it > 10
        }
    }
}
