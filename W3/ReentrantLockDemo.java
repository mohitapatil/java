package W3;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int counter = 0;
    private Lock lock = new ReentrantLock();

    public void incrementCounter() {
        lock.lock();
        try {
            counter++;
            incrementAgain();
        } finally {
            lock.unlock();
        }
    }

    public void incrementAgain() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unlock();
        }
    }

    public int getCounter() {
        lock.lock();
        try {
            return counter;
        } finally {
            lock.unlock();
        }
    }
}

public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(() -> {
                counter.incrementCounter();
            });
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(counter.getCounter());
    }
}
