public interface ICLinked {
    //头插法
    void addFirst(int data);
    //尾插法
    void addLast(int data);
    //任意位置插入,第一个数据节点为0号下标
    boolean addindex(int index,int data);
    //查找是否包含关键字key是否在单链表当中
    boolean contains(int key);
    //删除第一次出现关键字为key的节点
    int remove(int key);
    //删除所有值为key的节点
    void removeAllKey(int key);
    //得到单链表的长度
    int getLength();
    void display();
    void clear();
}
public class HeadSingleListImp implements ICLinked {
    //节点类
    class Node{
        private int data;
        private  Node next;
        //头结点
        public Node(){
            this.data=-1;
        }
        //数据节点
        public Node(int data){
            this.data=data;
        }
    }
    private  Node head;
    public  循环链表的实现(){
        this.head=new Node();
        this.head.next=this.head;
    }
    @Override
    public void addFirst(int data) {
        Node node=new Node(data);
        node.next=this.head.next;
        this.head.next=node;
    }

    @Override
    public void addLast(int data) {
        Node node=new Node ( data );
        Node cur=this.head;
        while(cur.next!=this.head){
            cur=cur.next;
        }
        node.next=cur.next;
        cur.next=node;
    }
    //先找index-1的位置
    private Node searchIndex(int index){
        checkIndex ( index );
        Node cur=this.head;
        for(int i=0;i<index;i++){
            cur=cur.next;
        }
        return cur;

    }
    private  void checkIndex(int index){
        if(index<0||index>getLength ()){
            throw new UnsupportedOperationException ( "不合法" );
        }

    }

    @Override
    public boolean addindex(int index, int data) {
       Node pre= searchIndex ( index );
       Node node=new Node ( data );
       node.next=pre.next;
       pre.next=node;
        return true;
    }

    @Override
    public boolean contains(int key) {
        Node cur=this.head.next;
        while(cur!=this.head){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
private  Node searchPre(int key){
        Node pre=this.head;
        while (pre.next!=this.head){
            if(pre.next.data==key){
                return pre;
            }
            pre=pre.next;
        }
        return null;
}
    @Override
    public int remove(int key) {
        Node pre=searchPre ( key );
        if(pre==null){
            throw new UnsupportedOperationException ( "不合法" );
        }
        Node del=pre.next;
        int oldData=del.data;
        pre.next=del.next;
        return oldData;
    }

    @Override
    public void removeAllKey(int key) {
Node pre=this.head;
Node cur=this.head.next;
while(cur!=this.head){
    if(cur.data==key){
        pre.next=cur.next;
        cur=pre.next;
    }
    else {
        pre=cur;
        cur=cur.next;
    }
}
    }
    @Override
    public int getLength() {
        int count=0;
        Node cur=this.head.next;
        while(cur!=this.head){
            count++;
            cur=cur.next;
        }
        return count;
    }
    @Override
    public void display() {
        Node cur=this.head.next;
        while (cur != this.head) {
            System.out.print( cur.data + " " );
            cur = cur.next;
        }
        System.out.println ( );
    }
    @Override
    public void clear() {
while(this.head.next!=this.head){
    Node cur=this.head.next;
    this.head.next=cur.next;
}
this.head=null;
    }
}
public class Test {
    public static void main(String[] args) {
        循环链表的实现  headSingle=new 循环链表的实现();
        headSingle.addFirst ( 10 );
        headSingle.addFirst ( 20 );
        headSingle.addFirst ( 30 );
        headSingle.addFirst ( 40 );
        headSingle.addFirst ( 50 );
        headSingle.addLast ( 80 );
        headSingle.addLast ( 90 );
        headSingle.addindex (4,20 );
        headSingle.addindex ( 3,60 );
        headSingle.display ();
    }
}


