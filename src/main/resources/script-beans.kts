import org.springframework.context.support.beans
import ru.spring.functional.KotlinInterface
import ru.spring.functional.scriptbeanshello.JavaFunctionalInterface
import ru.spring.functional.scriptbeanshello.JavaInterface

beans {
    bean("helloDslBean") {
        "hello"
    }

    bean("javaFunctionalInterfaceBean") {
        JavaFunctionalInterface {
            "hi from java functional interface"
        }
    }

    bean("kotlinInterfaceBean") {
        object : KotlinInterface {
            override fun bonjour(): String {
                return "hi from kotlin interface"
            }
        }
    }

    bean("javaInterfaceBean") {
        object : JavaInterface {
            override fun hello(): String = "hello from java interface"

            override fun bye(): String = "bye-bye from java interface"
        }
    }
}
