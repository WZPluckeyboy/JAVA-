package 多线程.多线程的常用操作方法;
class  Mythread1 implements  Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
            System.out.println ("当前线程"+Thread.currentThread ().getName ()+"  ,i=" +i);
        }
    }
}
public class 线程休眠方法 {
    public static void main(String[] args) {
        Mythread1 mythread1=new Mythread1 ();
        Thread thread1=new Thread ( mythread1,"thread1" );
        Thread thread2=new Thread ( mythread1,"thread2" );
        Thread thread3=new Thread ( mythread1,"thread3" );
        System.out.println ("当前线程1"+Thread.currentThread ().getName () );
        thread1.start ();
        thread2.start ();
        thread3.start ();


    }
}
