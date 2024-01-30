package MultiThreadingImplementation;

/*
* Producer-Consumer Problem:
Solve the classic producer-consumer problem using multithreading in Java.
*/

import java.util.LinkedList;

class SBuffer {
	private final LinkedList<Integer> buffer = new LinkedList<>();
	private final int capacity;
	SBuffer(int capacity) {
		this.capacity = capacity;
	}
	public synchronized void produce(int item) throws InterruptedException {
		while(buffer.size() == capacity) {
			wait();
		}
		buffer.add(item);
		System.out.println("Produced: "+ item);
		notify();
	}

	public synchronized int consume() throws InterruptedException {
		while(buffer.isEmpty()) {
			wait();
		}
		int val = buffer.remove();
		System.out.println("Consumed: "+ val);
		notify();
		return val;
	}
}

class Producer implements Runnable {
	SBuffer sBuffer;
	Producer(SBuffer sBuffer) {
		this.sBuffer = sBuffer;
	}
	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			try {
				sBuffer.produce(i);
			} catch (InterruptedException e) {
				throw new RuntimeException(e);
			}
		}
	}
}
public class ProducerConsumerProblem {
	public static void main(String[] args) {

	}
}
