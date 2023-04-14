package W3;

public class DeamonThread extends Thread{
    public void run(){
        System.out.println(getName() + " deamon status is " + Thread.currentThread().isDaemon());
    }

    public static void main(String[] args) {
        DeamonThread t1 = new DeamonThread();
        DeamonThread t2 = new DeamonThread();
        t1.start();
        t2.setDaemon(true);
        t2.start();
    }
}
