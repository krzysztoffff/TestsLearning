package pl.coderslab.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import pl.coderslab.Factors;

public class FactorsTest {

	@Test
	public void testGeneratePrimeFactors() {
		
			Factors f = new Factors();
			
			List<Integer> factors = new ArrayList<>();
			factors.add(1);
			factors.add(3);
			factors.add(9);
			
			
			assertEquals(factors.toString(), f.generatePrimeFactors(9).toString());
			
		
	
	}

}
