package W3;

public class ThreadLocalImpl {
    public static class MyRunnable implements Runnable   
    {  
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(); 
        private int i; 
        @Override  
        public void run() {  
            threadLocal.set( (int) (Math.random() * 100D) );  
            i= (int) (Math.random() * 100D);
            try   
            {  
                Thread.sleep(1000);  
                System.out.println(threadLocal.get()+ " int "+ i);   
            } catch (InterruptedException e) {  
            }  
        }  
    }  
    public static void main(String[] args)   
    {  
        MyRunnable runnableInstance = new MyRunnable();  
          
        Thread t1 = new Thread(runnableInstance);  
        Thread t2 = new Thread(runnableInstance);  
         
        t2.start(); 
        t1.start();  
    }  
}
