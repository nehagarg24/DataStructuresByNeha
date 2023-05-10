package ArrayImplementation;

public class LargestElementInAnArray {
	public static void main (String [] args) {

		int arr [] = {1, 13, 6, 2, 19, 0, 2};
		int maximum = 0, i = 0;

		while( i < arr.length) {
			maximum = Math.max(maximum, arr[i]);
			i++;
		}
		System.out.println("Maximum = " + maximum);
	}
}
