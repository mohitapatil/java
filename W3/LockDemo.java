package W3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.*;

public class LockDemo {
    public static void main(String[] args) throws InterruptedException {
        Counter2 counterObj2 = new Counter2();

        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(() -> {
                counterObj2.incrementCounter();
            });
            threads.add(t);
            t.start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println(counterObj2.getCounter());
    }
}

class Counter2 {
    private int counter = 0;
    private Lock lock = new ReentrantLock();

    public void incrementCounter() {
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