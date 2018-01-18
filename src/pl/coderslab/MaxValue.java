package pl.coderslab;

public class MaxValue {
	public static int largest(int[] list) {
		int index, max = list[0];

		if (list.length == 0) {
			throw new RuntimeException("Lista jest pusta");
		}
		for (index = 0; index < list.length; index++) {
			if (list[index] > max) {
				
				max = list[index];
			}
		}
		return max;
	}

}
