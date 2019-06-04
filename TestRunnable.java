package 多线程.多线程的实现方式;
class MyRunnable implements Runnable{
    private  final   String title;

    public   MyRunnable(String title) {
        this.title = title;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            System.out.println (this.title+"="+i );
        }
    }

}
public class TestRunnable {
    public static void main(String[] args) {
    /*//方式一：Runnable runnable1=new MyRunnable ( "MyRunnable" );
     Thread thread1=new Thread ( runnable1 );
     Thread thread2=new Thread ( runnable1 );
     thread1.start ();
     thread2.start ();

    }*/
        //  方式二：使用内部类因为runnavble是个函数是接口
    /*Thread thread1=new  Thread ( new Runnable (){
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    System.out.println ("Thread1  "+i );
                }
            }
        } );
        Thread thread2=new  Thread ( new Runnable ( ) {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    System.out.println ("Thread2  "+i );
                }
            }
        } );
        thread1.start ();
        thread2.start ();
    }*/
    //方式三：lamdba表达式
        Thread thread1=new Thread (
            () ->{ for(int i=0;i<10;i++) {
            System.out.println ("Thread1  "+i );
        } });
        Thread thread2=new Thread (
                () ->{ for(int i=0;i<10;i++) {
                    System.out.println ("Thread2  "+i );
                } });
        thread1.start ();
        thread2.start ();
    }

}
