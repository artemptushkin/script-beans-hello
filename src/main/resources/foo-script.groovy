import ru.spring.functional.scriptbeanshello.BazInterface;

beans {
	groovyBean(BazInterface) {
		return { ->
			"hello from groovy scripts"
		}
	}
}