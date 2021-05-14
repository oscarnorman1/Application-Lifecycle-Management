package Tests;

import com.example.springdocker.misc.SimpleMath;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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
    void addPositivesTest() {
        int expected = 10;
        int actual = m.addPositives(5, 5);

        assertEquals(expected, actual);
    }


}