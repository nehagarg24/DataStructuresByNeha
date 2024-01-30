package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {

	public static void main(String [] args) {
		Stack<Character> s = new Stack<>();
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		s.push('e');


		System.out.println("Original Stack: " + s);

		reverseString(s, s.size());
// 		System.out.print("Reversed Stack: " s);

		System.out.print("Reversed Stack: ");
		while (!s.isEmpty()) {
			System.out.print(s.pop() + " ");
		}
	}

	private static void reverseString(Stack<Character> s, int size) {
		int count = 0;
		rev(s, size, count);
	}

	private static void rev(Stack<Character> s, int size, int count) {
		if(count == size) {
			return;
		}
		char val = s.pop();
		//s.add(count,val);
		rev(s, size, count+1);
		s.push(val);
	}
}
