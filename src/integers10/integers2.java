package integers10;

import java.math.*;

public class integers2 {

	public static void main(String[] args) {
		double[] integers = new double[5];
		
		for (int num = 0; num < integers.length; num++) {
		integers[num] = Math.pow(2, num + 1);
		
		}
		for (int num = integers.length - 1; num >= 0; num--) {
			System.out.print(integers[num] + " ");
		}
	}

}
