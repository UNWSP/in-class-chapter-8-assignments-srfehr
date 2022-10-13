package integers10;

public class Integers10 {

	public static void main(String[] args) {
		int[] tenMult = {10,20,30,40,50,60};
		
		for (int num : tenMult) {
			System.out.print(num + " ");
		}
		System.out.println();
		for (int num = tenMult.length - 1; num >= 0; num--) {
			System.out.print(tenMult[num] + " ");
		}
		System.out.println();
		int total = 0;
		for (int num: tenMult) {
			total += num;
		}
		System.out.print(total);
		System.out.println();
		
		//average
		int mean = total / 6;
		System.out.print(mean);
	}

}
