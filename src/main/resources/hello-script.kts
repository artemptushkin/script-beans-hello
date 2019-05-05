import ru.spring.functional.scriptbeanshello.JavaFunctionalInterface

class Test : JavaFunctionalInterface {
    override fun hi(): String = "hi from java functional interface"
}

Test().hi()
