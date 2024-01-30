package Stack;

import java.util.Stack;

public class NextGreaterElement {

	//Function to find the next greater element for each element of the array.
	public static long[] nextLargerElement(long[] arr, int n) {
		int len = n-1;
		long[] result = new long[n];
		Stack<Long> s = new Stack<>();
		s.push(arr[len]);
		result[len] = -1;

		for(int i=len-1; i>= 0; i--) {

			while (arr[i] > s.peek() && !s.isEmpty()) {
				s.pop();
			}

			if(arr[i] < s.peek()) {
				result[i] = s.peek();
				s.push(arr[i]);
			} else {
				result[i] = -1;
				s.push(arr[i]);
			}
		}

		return result;
	}

	public static void main(String [] args) {


		long[] arr = {1, 3, 2, 4}; // 3, 4, 4, -1
		long[] result = nextLargerElement(arr, arr.length);

		for(long i : result) {
			System.out.println(i);
		}
	}
}