package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class Factors {

	static public List<Integer> generatePrimeFactors(int n) {
		
		List<Integer> factors = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				factors.add(i);
			}

		}


		return factors;
	}

}
