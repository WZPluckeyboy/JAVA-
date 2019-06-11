package 多线程.多线程的常用操作方法;
class  MyThread implements  Runnable{
    @Override
    public void run() {
    for(int i=0;i<10;i++) {
        System.out.println ("当前线程："+Thread.currentThread ().getName ()+" ,i=" +i);
    }
    }
}
public class 现成的优先级 {
    public static void main(String[] args) {
        MyThread myThread=new MyThread ();
        Thread thread1=new Thread ( myThread,"1" );
        Thread thread2=new Thread ( myThread,"2" );
        Thread thread3=new Thread ( myThread,"3" );
        thread1.setPriority ( Thread.MAX_PRIORITY );
        thread2.setPriority ( Thread.MIN_PRIORITY );
        thread3.setPriority ( Thread.MAX_PRIORITY );
thread1.start ();
thread2.start ();
thread3.start ();

    }
}
