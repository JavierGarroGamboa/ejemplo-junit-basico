import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorJUnitTest {

    /**
     * Empty Constructor
     */
    public CalculatorJUnitTest() {
    }

    /**
     * Test the Calculator
     */
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        assertEquals(60, result, 0);
    }
}
