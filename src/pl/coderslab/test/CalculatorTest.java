package pl.coderslab.test;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CalculatorTest {

	@Test
	public void multiply() {
		assertEquals(8, 4*2);
		assertNotEquals(8, 2*2);
		
	}
	
	@Test
	public void add() {
		//TODO :: add another assert
		assertEquals(4, 2+2);
		assertNotEquals(8, 2+2);
		
	}

}
