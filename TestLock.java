package 多线程.线程的同步与死锁;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
class  MyThread11 implements  Runnable{
    private  int ticket=10;
    private Lock ticketLock=new ReentrantLock (  );
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            ticketLock.lock ();
            try {
                if (ticket > 0) {
                    Thread.sleep ( 1000 );
                    System.out.println ( Thread.currentThread ( ).getName ( ) + "还有" + this.ticket-- + "张票" );
                }
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            } finally {
                ticketLock.unlock ();
            }
        }

    }
}
public class TestLock {
    public static void main(String[] args) {
        MyThread11 mythread=new MyThread11 ();
        Thread thread1=new Thread (mythread,"黄牛A"  );
        Thread thread2=new Thread (mythread,"黄牛B"  );
        Thread thread3=new Thread (mythread,"黄牛C"  );
        thread1.setPriority ( Thread.MAX_PRIORITY );
        thread2.setPriority ( Thread.MIN_PRIORITY );
        thread3.setPriority ( Thread.MAX_PRIORITY );
        thread1.start ();
        thread2.start ();
        thread3.start ();
    }
}
