package 多线程.线程池;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
//固定线程
/*blic class 线程的三种方式 {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newFixedThreadPool ( 5 );
        for(int i=0;i<5;i++){
            executorService.submit ( new Runnable ( ) {
                @Override
                public void run() {
                  for(int j=0;j<10;j++)  {
                      System.out.println (Thread.currentThread ().getName ()+","+j );
                  }
                }
            } );
        }
        executorService.shutdown ();
    }
}*/
//单线程
/*blic class 线程的三种方式 {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newSingleThreadExecutor ();
        for(int i=0;i<5;i++){
            executorService.submit ( new Runnable ( ) {
                @Override
                public void run() {
                    for(int j=0;j<10;j++)  {
                        System.out.println (Thread.currentThread ().getName ()+","+j );
                    }
                }
            } );
        }
        executorService.shutdown ();
    }
}*/
//不固定线程
/*public class 线程的三种方式 {
    public static void main(String[] args) {
        ExecutorService executorService=Executors.newCachedThreadPool (  );
        for(int i=0;i<5;i++){
            try {
                Thread.sleep ( 500);
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
            executorService.submit ( new Runnable ( ) {
                @Override
                public void run() {
                    for(int j=0;j<10;j++)  {
                        System.out.println (Thread.currentThread ().getName ()+","+j );
                    }
                }
            } );
        }
        executorService.shutdown ();
    }
}*/