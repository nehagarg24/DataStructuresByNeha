package MultiThreadingImplementation;

// Create a simple Java program with two threads, each printing numbers from 1 to 5 alternately.
public class PrintOneToFiveNumbersAlternatively {

	private static final Object lock = new Object();
	private static int count=1;
	private static final int maxCount = 10;
	public static void main(String [] args) {

		Thread t1 = new Thread(() -> print(false), "even");
		Thread t2 = new Thread(() -> print(true), "odd");

		t1.start();
		t2.start();
	}

	public static void print(boolean booleanValue){
		while(count < maxCount) {
			synchronized (lock) {
				while((count % 2 == 0 && booleanValue) || (count % 2 == 1 && !booleanValue))
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}

					System.out.println(Thread.currentThread().getName() + " - " + count);
					count++;
					lock.notify();
			}
		}
	}
}
