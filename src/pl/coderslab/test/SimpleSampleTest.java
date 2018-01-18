package pl.coderslab.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class SimpleSampleTest {

	@Test
	public void test() {
		assertEquals(4, 2*2);
		assertEquals(8, 4*2);
		assertEquals(8, 1*4);
	}

}
