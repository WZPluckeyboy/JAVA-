package 多线程.线程的同步与死锁;
class Mythread4 implements Runnable{
    private  int ticket=10;
    @Override
    public void run() {
    for(int i=0;i<10;i++){
        this.sale ();
    }
    }
    public synchronized  void sale(){
        if(this.ticket>0){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
            System.out.println (Thread.currentThread ().getName ()+",还有"+this.ticket--+"张票" );
        }
    }
}
public class 同步方法 {
    public static void main(String[] args) {
        Mythread4 mythread4=new Mythread4 ();
        Thread thread1=new Thread ( mythread4,"黄牛A" );
        Thread thread2=new Thread ( mythread4,"黄牛B" );
        Thread thread3=new Thread ( mythread4,"黄牛C" );
        thread1.start ();
        thread2.start ();
        thread3.start ();

    }
}
