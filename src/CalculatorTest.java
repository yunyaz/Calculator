import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	public void testDivide() {
		double quotient = Calculator.divide(5, 2);
		assertEquals(2.5, quotient);
	}
	
	@Test
	public void testAdd() {
		double sum = Calculator.add(5, 2);
		assertEquals(7, sum);
	}
	
	@Test
	public void testSubtract() {
		double subtract = Calculator.subtract(5, 2);
		assertEquals(3, subtract);
	}
}
