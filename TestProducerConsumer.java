package 多线程.生产者与消费者模型.生产者与消费者;
import java.util.LinkedList;
import java.util.Queue;
public class TestProducerConsumer {
    public static void main(String[] args) {
        //方法一：不灵活
       /* Queue<Goods> queue=new LinkedList <> ( );
        Runnable produce=new producer ( queue );
        Runnable consumer=new Consumer ( queue );
        for(int i=0;i<5;i++){
            new Thread ( produce,"生产者-"+i ).start ();
        }
        for(int i=0;i<2;i++){
            new Thread ( consumer,"消费者-"+i ).start ();
        }*/
       //方法二：输命令行参数测试
      int defaultProducers=5;
      int defaultConsumers=5;
      int producers=defaultProducers;
      int consumers=defaultConsumers;
      if(args.length==1){
          producers=Integer.parseInt ( args[0] );
      }
      if(args.length==2){
          producers=Integer.parseInt ( args[0] );
          consumers=Integer.parseInt ( args[1] );
      }
      if(producers<0){
          producers=defaultProducers;
      }
      if(consumers<0){
          consumers=defaultConsumers;
      }
      ProducerConsumerLauncher.run ( producers,consumers );

    }
}
