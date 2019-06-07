package 多线程.多线程的常用操作方法.线程的停止方式;
class  MyThread6 implements  Runnable{
    @Override
    public void run() {
       for(int i=0;i<100;i++) {
           try {
               Thread.sleep ( 1000 );
           } catch (InterruptedException e) {
               e.printStackTrace ( );
           }
           System.out.println ( Thread.currentThread ( ).getName ( ) + " ,i=" + i );
       }
    }
}
public class stop方法 {
    public static void main(String[] args) throws InterruptedException {
        MyThread6 myThread6=new MyThread6 ();
        Thread thread=new Thread ( myThread6,"子线程" );
        thread.start ();
        Thread.sleep ( 2000 );
        thread.stop ();
        System.out.println ("代码结束" );
    }
}
