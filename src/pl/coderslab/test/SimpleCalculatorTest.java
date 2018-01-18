package pl.coderslab.test;
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import pl.coderslab.SimpleCalculator;

class SimpleCalculatorTest {

	@Test
	void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		int result  = calc.addPositve(2, 3);
		assertEquals(6, result);
	}

	@Test(expected = IllegalArgumentException.class)
	void testAddPositve() {
		SimpleCalculator calc = new SimpleCalculator();
		int result = calc.addPositve(1, 1);
		assertEquals(2, result);
		
		result = calc.addPositve(-1, 1);
		
	}

}
