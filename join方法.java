package 多线程.多线程的常用操作方法;

import 代理设计模式.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

class  MyThread4 implements  Runnable{
    @Override
    public void run() {
        System.out.println ("主线程睡眠前的时间" );
        join方法.printTime ();
        try {
            Thread.sleep ( 2000 );
        } catch (InterruptedException e) {
            e.printStackTrace ( );
        }
        for(int i=0;i<10;i++){
            System.out.println (Thread.currentThread ().getName ()+" ,i="+i );
        }
        System.out.println ("睡眠结束的时间" );
        join方法.printTime ();
    }
}

public class join方法 {
    public static void main(String[] args) throws InterruptedException {
MyThread4 myThread4=new MyThread4 ();
Thread thread=new Thread ( myThread4 ,"thread");
thread.start ();
        System.out.println (Thread.currentThread ().getName () );
        thread.join();
        System.out.println ("代码结束" );
    }
    public static void printTime(){
        Date date=new Date();
        DateFormat format=new SimpleDateFormat ( "yyy-MM-dd HH:mm:ss" );
        String time=format.format(date);
        System.out.println (time );
    }
}
