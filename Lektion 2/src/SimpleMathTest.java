import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    SimpleMath m;

/*
    @BeforeAll
    public static void init() {
        System.out.println("TESTING STARTING (@BeforeAll)");
    }
*/

    @BeforeEach
    public void beforeMethod() {
        m = new SimpleMath();
        System.out.println("Before each test (@BeforeEach)");
    }

/*
    @AfterAll
    public static void afterAll() {
        System.out.println("TESTING ENDED (@AfterAll)");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("TEST DONE (@AfterEach)");
    }
*/

    @Test
    void addTest() {
        int expected = 10;
        int actual = m.add(5, 5);

        assertEquals(expected, actual);
    }

    @DisplayName("Addition method will throw exception")
    @Test
    void add_throws() {
        List<Integer> lists = Arrays.asList(-1, -2, -20000, -534);

        for (var e: lists) {
            assertThrows(IndexOutOfBoundsException.class, () -> m.add(e, e));
        }
    }



}