package 多线程.生产者与消费者模型.生产者与消费者;

import java.util.LinkedList;
import java.util.Queue;

public final class ProducerConsumerLauncher {
    private  ProducerConsumerLauncher(){}
    public static  void run(int producers,int consumers){
        System.out.println("生产者：" + producers + " 消费者：" + consumers);
        Queue<Goods> queue=new LinkedList<> ( );
        Runnable produce=new producer ( queue );
        Runnable consumer=new Consumer ( queue );
        for(int i=0;i<producers;i++){
            new Thread ( produce,"生产者-"+i ).start ();
        }
        for(int i=0;i<consumers;i++){
            new Thread ( consumer,"消费者-"+i ).start ();
        }
    }

}
