package pl.coderslab;

import java.util.StringTokenizer;

public class Calculator {

	public int add(int a, int b) {
		int res = a + b;

		return res;
	}

	public int substraction(int a, int b) {
		int res = a - b;
		return res;

	}

	public int multiply(int a, int b) {
		int res = a * b;
		return res;

	}

	public int division(int a, int b) {
		if (b != 0) {
			int res = a / b;
			return res;
		} else
			System.out.println(" b = 0 ");
		return 0;

	}

	public boolean greater(int a, int b) {
		if (a > b) {
			return true;
		} else {
			return false;
		}
	}
	/**
	 * Add only string tokenized by +
	 * @param a
	 * @return
	 */
	public int eval(String a) {
		int res = 0;
		StringTokenizer st = new StringTokenizer(a, "+");
		
		while (st.hasMoreElements()) {
			res += Integer.parseInt(st.nextToken());
		}
		return res;
	}

}
