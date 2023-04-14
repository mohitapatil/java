package W3;

public class MyTask implements Runnable{
    private String name;

    public MyTask(String name){
        this.name= name;
    }

    @Override
    public void run() {
        try{
            for(int i=0;i<3;i++){
                System.out.println(Thread.currentThread().getName() + " "+ name + i );
            }
            Thread.sleep(1000);
        }
        catch(InterruptedException e) {
            e.printStackTrace();
        }
    }

    
}
