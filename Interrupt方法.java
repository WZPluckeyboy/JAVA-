package 多线程.多线程的常用操作方法.线程的停止方式;

public class Interrupt方法 {
    public static void main(String[] args) throws InterruptedException {
        MyThread6 myThread6=new MyThread6 ();
        Thread thread=new Thread ( myThread6,"子线程" );
        thread.start ();
        Thread.sleep ( 2000 );
        thread.interrupt ();
        System.out.println ("代码结束" );
    }

}
