import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        System.out.println("Setting up Calculator instance");
        calc = new Calculator(); // Arrange
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up Calculator instance");
        calc = null;
    }

    @Test
    public void testAdd() {

        int result = calc.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {

        int result = calc.subtract(5, 2);

        assertEquals(3, result);
    }
}
