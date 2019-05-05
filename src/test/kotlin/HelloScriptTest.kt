import junit.framework.Assert.assertEquals
import org.junit.Test
import java.nio.file.Files
import java.nio.file.Paths
import javax.script.ScriptEngineManager

class HelloScriptTest {

    @Test
    @Throws(Exception::class)
    fun shouldCreateATestAndCall() {
        val engine = ScriptEngineManager().getEngineByExtension("kts")
        val reader = Files.newBufferedReader(Paths.get(ClassLoader.getSystemResource("hello-script.kts").toURI()))

        assertEquals("hello", engine.eval(reader))
    }
}