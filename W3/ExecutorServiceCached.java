package W3;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceCached {

    public static void main(String[] args) throws Exception {
        
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<Integer>> resultList = new ArrayList<Future<Integer>>();
        
        for (int i = 1; i <= 10; i++) {
            int num = i;
            Future<Integer> future = executorService.submit(new Callable<Integer>() {
                public Integer call() throws Exception {
                    Thread.sleep(1000); 
                    return num * num;
                }
            });
            resultList.add(future);
        }
        
        for (Future<Integer> future : resultList) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
