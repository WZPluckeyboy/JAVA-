package 多线程;
class MyThread extends Thread{
    private  String title;
    public MyThread(String title){
        this.title=title;
    }
    @Override
   public void run(){
        for(int i=0;i<10;i++){
            System.out.println (this.title+"="+i );
        }
    }
}
public class TestThread {
    public static void main(String[] args) {
       MyThread myThread1=new MyThread ( "mythread1" ) ;
       MyThread myThread2=new MyThread ( "mythread2" );
       MyThread myThread3=new MyThread ( "mythread3" );
       myThread1.start ();
       myThread2.start ();
       myThread3.start ();
    }
}
