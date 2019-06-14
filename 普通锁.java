package 多线程.线程的同步与死锁;

public class 普通锁 {
    public static void main(String[] args) {
  final  Object object=new Object ();
  new Thread ( new Runnable ( ) {
      @Override
      public void run() {
       synchronized (object){
           System.out.println (Thread.currentThread ().getName ()+"开始执行" );
           try {
               Thread.sleep ( 1000 );
           } catch (InterruptedException e) {
               e.printStackTrace ( );
           }
           System.out.println (Thread.currentThread ().getName ()+"执行结束" );
       }

      }
  },"线程一" ).start ();
        new Thread ( new Runnable ( ) {
            @Override
            public void run() {
                synchronized (object){
                    System.out.println (Thread.currentThread ().getName ()+"开始执行" );
                    try {
                        Thread.sleep ( 1000 );
                    } catch (InterruptedException e) {
                        e.printStackTrace ( );
                    }
                    System.out.println (Thread.currentThread ().getName ()+"执行结束" );
                }

            }
        },"线程三" ).start ();
        new Thread ( new Runnable ( ) {
            @Override
            public void run() {
                synchronized (object){
                    System.out.println (Thread.currentThread ().getName ()+"开始执行" );
                    try {
                        Thread.sleep ( 1000 );
                    } catch (InterruptedException e) {
                        e.printStackTrace ( );
                    }
                    System.out.println (Thread.currentThread ().getName ()+"执行结束" );
                }

            }
        },"线程二" ).start ();
    }
}
