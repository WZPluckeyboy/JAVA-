package 多线程.多线程的实现方式;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

//由于Runnable和thread实现的run方法都为void类型，若有返回值就得用Callalebe
class  MyCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
       int sum=0;
       for(int i=0;i<10;i++){
           sum+=i;
       }
       Thread.sleep (100);
       return sum;
    }
}
public class TestCallable {
    public static void main(String[] args) {
Callable<Integer> callable=new MyCallable( ) ;
        FutureTask<Integer> futureTask=new FutureTask <> ( callable ) ;
        Thread thread=new Thread ( futureTask );
       thread.start ();
        try {
            Integer sum=futureTask.get ();
            System.out.println (sum );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        } catch (ExecutionException e) {
            e.printStackTrace ( );
        }


    }

    }


