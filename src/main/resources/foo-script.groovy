import ru.spring.functional.scriptbeanshello.BazInterface
import ru.spring.functional.scriptbeanshello.MyService

beans {
	groovyBean(MyService) {
		myField = new BazInterface() {
			@Override
			String hello() {
				return "hello from script"
			}
		}

	}
}