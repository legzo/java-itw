import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class DummyTest {

    @Test
    fun `should add numbers`() {
        NumbersAdder.add(1, 1) shouldBe 2
    }
}