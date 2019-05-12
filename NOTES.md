### NOTES

```
Why??
Anonymous object causes: java.lang.ClassNotFoundException: ru.spring.functional.MyBeansKt$myBeans$1$3$1
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
```

### TODO
1. Annotation @EnableScriptBeans
+ properties: 
    * CLASSPATH; GIT etc.
    * fileNames: abc.kts, cat.kts
2. Annotation @ScriptBean(...fileName)
