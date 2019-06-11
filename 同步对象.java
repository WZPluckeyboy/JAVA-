package 多线程.线程的同步与死锁;
class Mythread implements Runnable {
    private int ticket = 20;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (this) {
                if (this.ticket > 0) {
                    try {
                        Thread.sleep ( 20 );

                    } catch (InterruptedException e) {
                        e.printStackTrace ( );
                    }
                    System.out.println ( Thread.currentThread ( ).getName ( ) + "还有" + ticket-- + "张票" );
                }
            }
        }
    }
}
public class 同步对象 {
    public static void main(String[] args) {
      Mythread mythread=new Mythread ();
      Thread thread1=new Thread ( mythread,"黄牛A" );
        Thread thread2=new Thread ( mythread,"黄牛B" );
        Thread thread3=new Thread ( mythread,"黄牛C" );
        thread1.setPriority ( Thread.MAX_PRIORITY );
        thread2.setPriority ( Thread.MIN_PRIORITY );
        thread3.setPriority ( Thread.MAX_PRIORITY );
        thread1.start ();
        thread2.start ();
        thread3.start ();
    }
}
