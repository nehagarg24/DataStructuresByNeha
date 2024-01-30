package Stack;

public class ImplementStackUsingArray {
	private static int top=-1;
	private static int arr[] = new int[1000];

	static void push(int a) {
		if(top < 0) {
			top=0;
			arr[top] = a;
		} else {
			arr[++top] = a;
		}
	}
	static int pop() {
		if(top == -1) return -1;
		int val = arr[top];
		top--;
		return  val;
	}

	public static void main(String [] args) {

		int val = pop();
		System.out.println("Element popped: "+ val);
		push(4);
		push(5);
		int val1 = pop();
		System.out.println("Element popped: "+ val1);
	}
}
