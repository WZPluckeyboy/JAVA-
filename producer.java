package 多线程.生产者与消费者模型.生产者与消费者;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.UUID;
public class producer implements Runnable {
    private final Queue <Goods> queue;
    public producer(Queue <Goods> queue) {
        this.queue = queue;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep ( 1000 );
            } catch (InterruptedException e) {
                e.printStackTrace ( );
            }
            synchronized (this.queue) {
                if (queue.size ( ) > 10) {
                    System.out.println ( "容器已满，请加快消费！" );
                    try {
                        this.queue.wait ( );
                    } catch (InterruptedException e) {
                        e.printStackTrace ( );
                    }
                } else {
                    String id =String.valueOf ( UUID.randomUUID ( ) );
                    Goods goods = new Goods ( id, "包子", new Random ( ).nextDouble ( ) );
                    this.queue.add ( goods );
                }
            }
        }
    }
}
