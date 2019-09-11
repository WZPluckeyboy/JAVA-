package 栈和队列.队列;

public class TestMyQueueImp {
    public static void main(String[] args) {
        MyQueueImp myQueue=new MyQueueImp();
        myQueue.add(10);
        myQueue.add(20);
        myQueue.add(30);
        myQueue.add(40);
        myQueue.add(40);
        myQueue.add(50);
        System.out.println(myQueue.empty());
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.size());
    }
}
