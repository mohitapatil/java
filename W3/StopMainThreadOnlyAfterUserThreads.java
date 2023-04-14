package W3;

public class StopMainThreadOnlyAfterUserThreads extends Thread {
    Thread m;
    StopMainThreadOnlyAfterUserThreads (Thread m) { this.m = m; }
    public void run() {
       Thread t = Thread.currentThread();
       System.out.println(t.getName() + ": "
           + m.getName() + " isAlive=" + m.isAlive());
       try { m.join(); } catch (InterruptedException e) {}
       System.out.println(t.getName() + ": "
           + m.getName() + " isAlive=" + m.isAlive());
       for (int i = 0; i < 10; i++)
          System.out.println(t.getName() + " " + i);
    }
    public static void main(String[] args) throws InterruptedException {
       Thread m = Thread.currentThread();
       Thread daemonThread = new Thread();
       daemonThread.setDaemon(true);
       daemonThread.start();
       System.out.println(daemonThread.getName() + ": "
           + daemonThread.getName() + " isAlive=" + daemonThread.isAlive());
       new StopMainThreadOnlyAfterUserThreads(m).start();
       System.out.println(daemonThread.getName() + ": "
           + m.getName() + " isAlive=" + m.isAlive());
       System.out.println("last line of main");
    }
 }