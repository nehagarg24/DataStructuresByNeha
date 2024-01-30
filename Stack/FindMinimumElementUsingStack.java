package Stack;

import java.util.Stack;

public class FindMinimumElementUsingStack {

	public static void deleteMid(Stack<Integer>s,int sizeOfStack){
		int count =0;
		findAndDelete(s,sizeOfStack, count);
	}

	private static void findAndDelete(Stack<Integer> s, int sizeOfStack, int count) {
		int mid = Math.abs(sizeOfStack/2);
		if(count == mid) {
			s.pop();
			return;
		}
		int val = s.pop();
		findAndDelete(s, sizeOfStack, count+1);
		s.push(val);
	}

	public static void main(String [] args) {
			Stack<Integer> s = new Stack<>();
			s.push(10);
			s.push(20);
			s.push(30);
			s.push(40);
			s.push(50);
			deleteMid(s, s.size());
			for(int i: s) {
				System.out.println(i);
			}
	}
}
