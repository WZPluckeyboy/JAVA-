package 多线程.线程的同步与死锁;
class Sync{
    public void test()  {
        synchronized (this) {
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
public class 全局锁 {
    public static void main(String[] args) {

    }
}
