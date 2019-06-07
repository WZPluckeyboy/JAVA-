package 多线程.多线程的常用操作方法.线程的停止方式;
class  MyThread5 implements  Runnable{
    private boolean flag=true;
    @Override
    public void run() {
        int i=0;
        while(flag){
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
            System.out.println (Thread.currentThread ().getName ()+" ,i="+i );
                i++;
        }

    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public boolean isFlag() {
        return flag;
    }
}
public class 设计标记为使线程停止 {
    public static void main(String[] args) throws InterruptedException {
        MyThread5 myThread5=new MyThread5 ();
        Thread thread=new Thread ( myThread5,"子线程" );
        thread.start ();
       Thread.sleep ( 2000 );
        myThread5.setFlag ( false );
        System.out.println ("代码结束" );
    }
}
