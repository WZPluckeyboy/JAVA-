package 多线程.线程的同步与死锁;
//方法一：全局锁
/*class Sync{
    public    void test() {
        synchronized(Sync.class){
        System.out.println ( "test方法开始，当前线程为：" + Thread.currentThread ( ).getName ( ) );
        try {
            Thread.sleep ( 1000 );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        System.out.println ( "test方法结束，当前线程为：" + Thread.currentThread ( ).getName ( ) );
    }
    }
}
class  Mythread10 extends Thread{
    private final Sync sync;
    public Mythread10(Sync sync){
        this.sync=sync;
    }
    @Override
    public void run() {
        sync.test ();

    }
}
public class 全局锁 {
    public static void main(String[] args) {
        Sync sync=new Sync ();
        for(int i=0;i<5;i++){
            Thread thread=new Mythread10(sync);
            thread.setName ( "Thread-"+i);
            thread.start ();
        }

    }
}*/
//方法二：传入对象参数
class Sync{
    public void test() {
        synchronized(this){
            System.out.println ( "test方法开始，当前线程为：" + Thread.currentThread ( ).getName ( ) );
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
            System.out.println ( "test方法结束，当前线程为：" + Thread.currentThread ( ).getName ( ) );
        }
    }
}
class  Mythread10 extends Thread{
    private final Sync sync;
    public Mythread10(Sync sync){
        this.sync=sync;
    }
    @Override
    public void run() {
      this.sync.test ();

    }
}
public class 全局锁 {
    public static void main(String[] args) {
        Sync sync=new Sync ();
        for(int i=0;i<5;i++){
            Thread thread=new Mythread10(sync);
            thread.setName ( "Thread-"+i);
            thread.start ();
        }

    }
}
