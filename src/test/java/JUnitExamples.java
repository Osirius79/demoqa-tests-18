import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll() {
        System.out.println("Here is beforeAll()");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Here is afterAll()");
    }

    @AfterEach
    void afterEach() {
        System.out.println("    Here is afterEach()");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("    Here is beforeEach()");
    }

    @Test
    void firstTest() {
        System.out.println("        Here is our firstTest()");
    }

    @Test
    void secondTest() {
        System.out.println("        Here is our secondTest()");
    }
}
