package 多线程.线程池;

import java.util.List;
import java.util.concurrent.*;

//execute为无返回值的
class RunnableThread implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println (Thread.currentThread ().getName ()+"."+i );
        }
    }
}
public class 向线程池提交任务的两种方式 {
    public static void main(String[] args) {
        RunnableThread runnableThread=new RunnableThread ();
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor ( 3,5,2000,
                TimeUnit.MILLISECONDS,new LinkedBlockingDeque <> (  ) );
        for (int i=0;i<5;i++){
            threadPoolExecutor.execute ( runnableThread );
        }
        List<Runnable> runnables=threadPoolExecutor.shutdownNow ();
        System.out.println (runnables.size () );
        System.out.println ("是否停下"+threadPoolExecutor.isShutdown () );
        System.out.println ("是否终止"+threadPoolExecutor.isTerminated () );
        System.out.println ("获取CPU个数"+Runtime.getRuntime ().availableProcessors () );
                while (threadPoolExecutor.isTerminated ()){
                    break;
                }


    }
}
//submit方法提交任务有返回值
/*class  callableThread implements Callable<Integer>{
    @Override
    public Integer call() throws Exception {
        int sum=0;u
        for(int i=0;i<20;i++){
            sum+=i;
            System.out.println (Thread.currentThread ().getName ()+","+sum );
        }
        return sum;
    }
}
public class 向线程池提交任务的两种方式 {
    public static void main(String[] args) {
       Callable CallableThread=new callableThread();
        ThreadPoolExecutor threadPoolExecutor=new ThreadPoolExecutor ( 3,5,2000,
                TimeUnit.MILLISECONDS,new LinkedBlockingDeque<> (  ) );
        for(int i=0;i<5;i++){
            Future future=threadPoolExecutor.submit ( CallableThread );
            Integer Sum= null;
            try {
                Sum = (Integer) future.get ();
                System.out.println (Sum );
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            } catch (ExecutionException e) {
                e.printStackTrace ( );
            }
        }
    }
}*/
