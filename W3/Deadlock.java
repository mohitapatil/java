package W3;

public class Deadlock {
    public static void main(String[] args) {  
        final String r1 = "r1";  
        final String r2 = "r2";  
        Thread t1 = new Thread() {  
          public void run() {  
              synchronized (r1) {  
               System.out.println("Thread 1 locked r1");  
      
               try { Thread.sleep(100);} 
               catch (Exception e) {}  
      
               synchronized (r2) {  
                System.out.println("Thread 1 locked r2");  
               }  
             }  
          }  
        };  
      
        Thread t2 = new Thread() {  
          public void run() {  
            synchronized (r2) {  
              System.out.println("Thread 2 locked r2");  
      
              try { Thread.sleep(100);} 
              catch (Exception e) {}  
      
              synchronized (r1) {  
                System.out.println("Thread 2 locked r1");  
              }  
            }  
          }  
        };  
      
        t1.start();  
        t2.start();  
      }  
}
