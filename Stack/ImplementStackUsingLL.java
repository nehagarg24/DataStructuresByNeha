package Stack;

 class StackNode {
     int data;
     StackNode next;
     StackNode(int a) {
         data = a;
         next = null;
     }
 }
public class ImplementStackUsingLL {
	private static StackNode top;
	private static void push(int a) {
		StackNode node = new StackNode(a);

		if(top == null) {
			top = node;
			System.out.println("Element inserted: "+ a);
		} else {
			node.next = top;
			top = node;
			System.out.println("Element inserted: " + a);
		}
	}
	private static int pop() {
		if(top != null) {
			int val = top.data;
			top = top.next;
			return val;
		} else
			return -1;
	}

	public static void main(String [] args) {
		push(2);
		push(3);
		int val = pop();
		System.out.println("Element popped: "+ val);
		push(4);
		int val1 = pop();
		System.out.println("Element popped: "+ val1);
	}
}
