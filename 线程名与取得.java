package 多线程.多线程的常用操作方法;
class Mythread implements  Runnable{
    @Override
    public void run() {
      for(int i=0;i<10;i++ ){
          Runnable runnable=new Mythread ();
          Thread thread=new Thread ( runnable,"线程_" );
          System.out.println ("当前线程一："+Thread.currentThread ().getName ()+" ,i=" +i );
      }
    }
}

public class 线程名与取得 {
    public static void main(String[] args) {
        Mythread mythread=new Mythread ();
        Thread thread=new Thread ( mythread );
        System.out.println ("=========================" );
        thread.start ();
        System.out.println ("=========================" );

    }
}
