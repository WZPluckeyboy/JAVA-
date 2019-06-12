package 多线程.生产者与消费者模型.生产者与消费者;
import java.util.Queue;
public class Consumer implements Runnable {
    private final Queue <Goods> queue;

    public Consumer(Queue <Goods> queue) {
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
                if (this.queue.isEmpty ( )) {
                    System.out.println ( Thread.currentThread ( ).getName ( ) + "容器已空，停止消息，加速生产" );
                    this.queue.notify ( );
                } else {
                    Goods goods = this.queue.poll ( );
                    System.out.println ( Thread.currentThread ( ).getName ( ) + "消费商品" + goods );
                }
            }
        }
    }
}
