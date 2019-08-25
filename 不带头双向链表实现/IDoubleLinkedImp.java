package 顺序表和链表.不带头双向链表实现;

public class IDoubleLinkedImp implements IDoubleLinked {
    static  class Node{
        private  int data;
        private Node next;
       private Node pre;
       public  Node(int data){
           this.data=data;
       }
    }
    private  Node head;
    private  Node last;
    public IDoubleLinkedImp(){
        this.head=null;
        this.last=null;
    }
    @Override
    public void addFirst(int data) {
      Node node=new Node(data);
      if(this.head==null){
          this.head=node;
          this.last=node;
      }else{
          node.next=this.head.next;
          this.head.pre=node;
          this.head=node;
      }
    }

    @Override
    public void addLast(int data) {

    }

    @Override
    public boolean addIndex(int index, int data) {
        return false;
    }

    @Override
    public boolean contains(int key) {
        return false;
    }

    @Override
    public int remove(int key) {
        return 0;
    }

    @Override
    public void removeAllKey(int key) {

    }

    @Override
    public int getLength() {
        return 0;
    }

    @Override
    public void display() {

    }

    @Override
    public void clear() {

    }
}
