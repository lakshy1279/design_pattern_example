package org.example.Tic_Tac_Toe.multithreading;

public class MonitorLocks {

    public synchronized void task1() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + ": task1 started");
        Thread.sleep(2000);
        System.out.println(Thread.currentThread().getName() + ": task1 ended");
    }

    public void task2() {
        System.out.println(Thread.currentThread().getName() + ": task2 executing");
    }

    public void task3() {
        System.out.println("Hello from thread 3");
    }
}
