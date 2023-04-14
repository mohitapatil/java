package W3;

import java.util.concurrent.locks.Lock;

public class ClassLevelBlockSynch implements Runnable{

    @Override
    public void run() {
        Lock();
    }

    public static void Lock(){
        System.out.println(Thread.currentThread().getName());

        synchronized (ClassLevelBlockSynch.class)
        {
        System.out.println("in block "+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args){
        ClassLevelBlockSynch b1 = new ClassLevelBlockSynch();

        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b1);
        ClassLevelBlockSynch b2 = new ClassLevelBlockSynch();
        Thread t3 = new Thread(b2);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");

        t1.start();
        t2.start();
        t3.start();
    }
    
}
