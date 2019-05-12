import ru.spring.functional.scriptbeanshello.JavaFunctionalInterface

class Test : JavaFunctionalInterface {
    override fun hi(): String = "hi"
}

Test().hi()
