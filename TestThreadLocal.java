package 多线程.线程的同步与死锁;
public class TestThreadLocal {
    private  static  String  commStr;
    private  static  ThreadLocal<String> threadStr=new ThreadLocal <> ();
    public static void main(String[] args) throws InterruptedException {
        commStr="main";
        threadStr.set ( "main" );
        Thread thread=new Thread ( new Runnable ( ) {
            @Override
            public void run() {
                commStr="thread";
                threadStr.set ( "thread" );
            }
        } );
        thread.start ();
        thread.join ();
        System.out.println (threadStr.get ());
        System.out.println (thread.getName ());
    }
}
