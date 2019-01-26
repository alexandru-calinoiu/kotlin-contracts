import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

internal class MainTest {
    private val main by lazy {
        Main()
    }

    @ExperimentalContracts
    @Test
    fun `will most likely work`() {
        val token = main.getMyToken()

        assertNotNull(token)
        assertEquals(42, token.length)
    }
}

@ExperimentalContracts
fun assertTrue(actual: Boolean, message: String? = null) {
    contract { returns() implies actual }
    org.junit.jupiter.api.Assertions.assertTrue(actual, message)
}

@ExperimentalContracts
fun <T : Any> assertNotNull(actual: T?, message : String? = null) {
    contract { returns() implies (actual != null) }
    org.junit.jupiter.api.Assertions.assertNotNull(actual, message)
}