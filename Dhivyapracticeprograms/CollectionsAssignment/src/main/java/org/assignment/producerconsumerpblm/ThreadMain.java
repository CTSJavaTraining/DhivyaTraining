package org.assignment.producerconsumerpblm;

import java.util.LinkedList;
import java.util.List;

public class ThreadMain {

	public static void main(String[] args) {
		List<Integer> queue = new LinkedList<Integer>();
		Producer p = new Producer(queue);
		Cons c = new Cons(queue);

		Thread producerThread = new Thread(p);
		Thread consumerThread = new Thread(c);

		producerThread.start();
		consumerThread.start();

	}

}