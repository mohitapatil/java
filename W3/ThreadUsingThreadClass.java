package W3;

public class ThreadUsingThreadClass extends Thread{  
    public void run()
    {  
    System.out.println("thread is running...");      
    }

    public static void main(String args[]){  
    ThreadUsingThreadClass t1=new ThreadUsingThreadClass();  
        t1.start();  
     }  
    }  