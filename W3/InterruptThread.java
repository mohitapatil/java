package W3;

public class InterruptThread extends Thread  
{    
    public void run()  
    {    
        try  
        {    
            Thread.sleep(1000);    
            System.out.println("My thread running");    
        }catch(InterruptedException e){    
            throw new RuntimeException("Thread interrupted..."+e);  
              
        }    
    }    
    public static void main(String args[])  
    {    
        InterruptThread t1=new InterruptThread();    
        t1.start();    
        try  
        {    
            t1.interrupt();   
            System.out.println(t1.isInterrupted());
 
        }catch(Exception e)
        {
            System.out.println("Exception handled "+e);
        }    
    }    
}    