package org.assignment.producerconsumerpblm;

import java.util.List;

public class Cons implements Runnable {

	private List<Integer> queue;

	public Cons(List<Integer> queue) {
		this.queue = queue;

	}

	public void run() {
		while (true) {
			consume();
		}

	}

	private void consume() {
		synchronized (queue) {
			if (queue.isEmpty()) {
				System.out.println("The queue is empty");
				try {
					queue.wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				System.out.println("consumed");
				queue.remove(0);

				queue.notify();

			}
		}
	}

}

