package org.assignment.producerconsumerpblm;

import java.util.List;

public class Producer implements Runnable {

	private List<Integer> queue;
	int max_size = 2;

	public Producer(List<Integer> queue) {
		this.queue = queue;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {

			try {
				produce(i);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	private void produce(int i) throws InterruptedException {
		synchronized (queue) {
			if (queue.size() == max_size) {
				System.out.println("queue is full.Remove some elements");
				queue.wait();
			} else {
				queue.add(i);
				System.out.println("Produced: " + i);
				Thread.sleep(500);
				queue.notify();
			}
		}

	}
}

