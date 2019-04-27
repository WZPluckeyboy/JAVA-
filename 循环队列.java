class MyCircularQueue {
    private  int front ;
    private  int rear;
    private int[] elem;
    private  int length;
    public MyCircularQueue(int k){
        this.front=0;
        this.rear=0;
        this.elem=new int[k];
        this.length=k+1;
    }
   //入队
    public boolean enQueue(int value) {
        if(isFull ()){
            return false;
        }
        else
            elem[rear]=value;
            rear=(rear+1)%length;
            return true;
    }
   //出队
    public boolean deQueue() {
        if(isEmpty ()){
            return false;
        }
        else
            front=(front+1)%length;
        return true;
    }
   //得到队头
    public int Front() {
        if(isEmpty ()){
            return -1;
        }
        else return elem[front];
    }
    //得到队尾
    public int Rear() {
        if(isEmpty ()){
            return  -1;
        }
            int index=rear==0?length-1 :(rear-1);
            return elem[index];
    }
   //判断是否为空
    public boolean isEmpty() {
        return front==rear;

    }
    //判断是否为满
    public boolean isFull() {
return (this.rear+1)%length==front;
    }
}
public class 循环队列 {
    public static void main(String[] args) {
        MyCircularQueue obj=new MyCircularQueue (  3);
        System.out.println(obj.enQueue(1));
        System.out.println(obj.enQueue(2));
        System.out.println(obj.enQueue(3));
        System.out.println(obj.enQueue(4));
        System.out.println(obj.Rear());
        System.out.println(obj.isFull());
        System.out.println(obj.deQueue());
        System.out.println(obj.Rear());
    }
}