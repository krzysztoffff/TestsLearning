package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.Calculator;

public class Calculator2Test {

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		int res = calc.add(2, 2);
		assertEquals(4, res);
	}

	@Test
	public void testSubstraction() {
		Calculator calc = new Calculator();
		int res = calc.substraction(2, 2);
		assertEquals(0, res);
	}

	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		int res = calc.multiply(2, 2);
		assertEquals(4, res);
	}

	@Test
	public void testDivision() {
		Calculator calc = new Calculator();
		int res = calc.division(2, 2);
		assertEquals(1, res);
		res = calc.division(1, 0);
		assertEquals(0, res);
	}

	@Test
	public void testGreater() {
		Calculator calc = new Calculator();
		boolean res = calc.greater(2, 1);
		assertEquals(true, res);
		
	}
	
	@Test
	  public void evaluatesExpression() {
	    Calculator calculator = new Calculator();
	    int sum = calculator.eval("1+2+3+4");
	    assertEquals(10, sum);
	  }

}
