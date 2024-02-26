import org.junit.Test;
import static org.junit.Assert.*;

public class MathOperationsTest {

   
    public void testAddition() {
        assertEquals(4, MathOperations.add(2, 2));
    }

 
    public void testSubtraction() {
        assertEquals(2, MathOperations.subtract(4, 2));
    }

   
    public void testMultiplication() {
        assertEquals(6, MathOperations.multiply(2, 3));
    }

   
    public void testDivision() {
        assertEquals(3, MathOperations.divide(9, 3));
    }
}

class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}