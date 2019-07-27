package 四大并发工具类的使用;
/*通过它可以实现让⼀组线程等待⾄某个状态之后再全部同时执⾏。叫做回环是因为当所有等待线程都被
  释放以后，CyclicBarrier可以被重⽤。我们暂且把这个状态就叫做barrier，当调⽤await()⽅法之后，线
  程就处于barrier了。*/
import java.sql.Time;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;
 class TestCyclicBarries implements Runnable {
  private CyclicBarrier cyclicBarrier;
    public TestCyclicBarries(CyclicBarrier cyclicBarrier){
        this.cyclicBarrier=cyclicBarrier;
    }
    @Override
    public void run() {
        System.out.println (Thread.currentThread ().getName ()+" 正在写数据..." );
        try {
            TimeUnit.SECONDS.sleep ( 3 );
            System.out.println (Thread.currentThread ().getName ()+"写入数据完毕，正在等待其他线程写入数据完毕。。。。" );
            cyclicBarrier.await ();
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        } catch (BrokenBarrierException e) {
            e.printStackTrace ( );
        }
        System.out.println ("所有线程写入完毕，继续执行其他任务。。。。" );
    }
}
public  class  CyclicBarriesDemo{
    public static void main(String[] args) {
        CyclicBarrier cyclicBarrier=new CyclicBarrier ( 4, new Runnable ( ) {
            @Override
            public void run() {
                System.out.println ("当前线程为+"
                        +Thread.currentThread ().getName ());
            }
        } );
        for(int i=0;i<4;i++){
            new Thread(new TestCyclicBarries (  cyclicBarrier )).start ();
        }
    }
}
