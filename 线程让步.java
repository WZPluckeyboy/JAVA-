package 多线程.多线程的常用操作方法;
class MyThread3 implements  Runnable{
    @Override
    public void run() {
      for(int i=0;i<10;i++)  {
          Thread.yield ();
          System.out.println ("当前线程"+Thread.currentThread ().getName ()+", i="+i );
      }
    }
}
public class 线程让步 {
    public static void main(String[] args) {
        MyThread3 myThread3=new MyThread3 ();
        Thread thread1=new Thread ( myThread3,"thread1" );
        Thread thread2=new Thread ( myThread3,"thread2" );
        Thread thread3=new Thread ( myThread3,"thread3" );
        Thread thread4=new Thread ( myThread3,"thread4" );
        thread1.start ();
        thread2.start ();
        thread3.start ();
        thread4.start ();
        System.out.println ("====================" );

    }
}
