package 四大并发工具类的使用;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

class  SemaphoreDemo implements Runnable{
  private  int num;
  private Semaphore semaphore;
  public SemaphoreDemo(int num,Semaphore semaphore){
      this.num=num;
      this.semaphore=semaphore;
  }
    @Override
    public void run() {
        try {
            semaphore.acquire ();
            System.out.println ("人工"+this.num+" 占用一台设备在生产" );
            TimeUnit.SECONDS.sleep ( 3 );
            System.out.println (" 工人"+this.num+"释放设备" );
            semaphore.release ();
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
    }
}
public class TestSemaphore {
    public static void main(String[] args) {
 int worker=8;
 Semaphore semaphore=new Semaphore ( 5 );
 for(int i=0;i<worker;i++){
     new Thread ( new SemaphoreDemo ( i,semaphore ) ).start ();
 }

    }
}
