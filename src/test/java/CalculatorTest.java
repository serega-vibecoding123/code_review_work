import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void add() {
        assertEquals(30, calculator.add(20, 10));
        assertEquals(0, calculator.add(5, -5));
        assertEquals(-3, calculator.add(-1, -2));
        assertEquals(7, calculator.add(0, 7));
    }

    @Test
    void dif() {
        assertEquals(10, calculator.dif(20, 10));
        assertEquals(0, calculator.dif(5, 5));
        assertEquals(-5, calculator.dif(5, 10));
        assertEquals(12, calculator.dif(0, -12));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(20, 10));
        assertEquals(5, calculator.div(10, 2));
        assertEquals(0, calculator.div(1, 2));
        assertEquals(-2, calculator.div(-10, 5));
    }

    @Test
    void times() {
        assertEquals(200, calculator.times(20, 10));
        assertEquals(0, calculator.times(100, 0));
        assertEquals(-20, calculator.times(-4, 5));
        assertEquals(16, calculator.times(-4, -4));
    }

    @Test
    void solver() {
        // внутри solver: a=20, b=10 -> (20+10)/2 = 15
        assertEquals(15, calculator.solver());
    }
}