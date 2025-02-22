package org.example.Tic_Tac_Toe.multithreading;

import java.util.concurrent.atomic.AtomicInteger;

public class PrintTask {
    private static AtomicInteger num = new AtomicInteger(1);


    synchronized public void printOdd() {
        while (num.get() <= 100) {
            if (num.get() % 2 == 0) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.println(Thread.currentThread().getName() + " -> " + num.getAndIncrement());
            notify();
        }
    }
    synchronized public void printEven() {
        while (num.get() <= 100) {
            if (num.get() % 2 != 0) {
                try { wait(); } catch (InterruptedException e) { e.printStackTrace(); }
            }
            System.out.println(Thread.currentThread().getName() + " -> " + num.getAndIncrement());
            notify();
        }
    }
//    public synchronized void run() {
//        while (num.get() <= 100) {
//            System.out.println(Thread.currentThread().getName() + " : " + num.getAndIncrement());
//        }
//    }
}
