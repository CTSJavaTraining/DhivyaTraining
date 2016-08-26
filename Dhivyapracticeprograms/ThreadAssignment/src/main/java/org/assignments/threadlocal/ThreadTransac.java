package org.assignments.threadlocal;

public class ThreadTransac implements Runnable {

    private ThreadLocal<Integer> threadlocal = new ThreadLocal<Integer>();

    public void run() {
           threadlocal.set((int) (Math.random() * 1000D));
           System.out.println(Thread.currentThread().getName() + "\nID:" + threadlocal.get());

    }

}