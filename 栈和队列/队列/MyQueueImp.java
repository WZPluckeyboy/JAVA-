package 栈和队列.队列;

public class MyQueueImp implements  IMyQueue {
    class Node{
        private  Node next;
        private  int data;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    private Node front;//队列头
    private Node rear;//队列尾
    private  int usedSize;
    public MyQueueImp(){
        this.front=null;
        this.rear=null;
        this.usedSize=0;
    }
    @Override
    public boolean empty() {
        return this.usedSize==0;
    }
    //返回队首元素但不出队
    @Override
    public int peek() {
       if(empty()){
           throw new IllegalArgumentException("不好意思队列为空");
       }
       return this.front.data;
    }

    @Override
    public int poll() {
        if(empty()){
            throw new IllegalArgumentException("不好意思队列为空");
        }
       int data=this.front.data;
        this.front=this.front.next;
        return data;
    }

    @Override
    public void add(int item) {
     if(empty()){
      this.front=new Node(item) ;
      this.rear=this.front;
     }else{
         this.rear.next=new Node(item);
         this.rear=this.rear.next;
     }
     this.usedSize++;
    }

    @Override
    public int size() {
       return this.usedSize;
    }
}
