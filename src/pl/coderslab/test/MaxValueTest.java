package pl.coderslab.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pl.coderslab.MaxValue;


public class MaxValueTest {

	@Test
	public void test() {
		MaxValue m = new MaxValue();
		int [] list = {1, 2, 5, 8, 10};
		int max = m.largest(list);
		assertEquals(10, max);
	
	}

}
