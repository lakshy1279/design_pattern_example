package org.example.Tic_Tac_Toe.multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class SharedResource {
    Queue<Integer> buffer = new LinkedList<>();
    int bufferSize = 10;
    public void produce(){
        int value = 0;
        while(true) {
            synchronized (this) {
                while (buffer.size() == bufferSize) {
                    try {
                        System.out.println("Buffer full, Producer waiting...");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("Produced: " + value);
                buffer.add(value++);
                notifyAll(); // Notify the consumer
                try {
                    Thread.sleep(3000); // Simulate processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void consume(){
        while (true) {
            synchronized (this) {
                while (buffer.isEmpty()) {
                    try {
                        System.out.println("Buffer empty, Consumer waiting...");
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println(" start Consuming: ");
                int value = buffer.poll();
                System.out.println("Consumed: " + value);
                notifyAll(); // Notify the producer
                try {
                    Thread.sleep(500); // Simulate processing time
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
