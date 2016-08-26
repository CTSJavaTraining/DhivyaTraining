package org.assignments.threadlocal;


public class ThreadLocalMain {
	
	

	       public static void main(String[] args) throws InterruptedException {
	              // TODO Auto-generated method stub
	              ThreadTransac id = new ThreadTransac();
	              Thread t1 = new Thread(id);
	              Thread t2 = new Thread(id);
	              t1.start();
	              t1.join();
	              t2.start();

	       }

	}
