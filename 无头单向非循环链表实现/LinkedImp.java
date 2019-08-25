package 顺序表和链表.无头单向非循环链表实现;
public class LinkedImp implements ILinked {
    static class Node{
        int data;
        Node next;
        public  Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    private  Node head;
    public LinkedImp() {
        this.head = null;
    }

    @Override
    public void addFirst(int data) {
        Node node=new Node(data);
      if(this.head==null){
          this.head=node;
      }
      else{
          node.next=this.head;
          this.head=node;
      }
    }

    @Override
    public void addLast(int data) {
     Node node=new Node(data);
     if(this.head==null){
       this.head=node;
     }
     else{
         Node cur=this.head;
         while (cur.next!=null){
             cur=cur.next;
         }
         cur.next=node;
     }
    }
//检查的合法性Index
    private  void checkIndex(int index){
        if(index<0||index>getLength ()){
            throw new UnsupportedOperationException ( "Index不合法" );
        }
    }
    //找到index-1的位置，函数返回该节点的引用
      private  Node searchIndex(int index){
        int count =0;
        Node cur=this.head;
        while(count<index-1){
            cur=cur.next;
            count++;
        }
        return cur;
      }
    @Override
    public boolean addindex(int index, int data) {
       checkIndex ( index );
       if(index==0){
           addFirst ( data );
           return true;
       }
       Node node =new Node(data);
       Node cur=searchIndex ( index );
       node.next=cur.next;
       cur.next=node;
       return true;
    }

    @Override
    public boolean contains(int key) {
        Node cur=this.head;
        while(cur!=null){
            if(cur.data==key){
                return  true;
            }
            cur=cur.next;
        }
        return false;
    }
    //查找关键字Key的前驱
    //如果找不到返回null
    private  Node searchPre(int key){
        Node pre=this.head;
        if(pre.data==key){
            return this.head;
        }
        while (pre.next!=null){
            if(pre.next.data==key){
                return pre;
            }
            pre=pre.next;
        }
        return null;
    }
    @Override
    public int remove(int key) {
        int oldData=0;
        Node pre=searchPre ( key );
        if(pre==null){
            throw new UnsupportedOperationException ( "不存在key结点" );
        }
        if(pre==head&&pre.data==key){
            oldData=this.head.data;
            this.head=this.head.next;
            return oldData;
        }
        Node del=pre.next;
        oldData=del.data;
        pre.next=del.next;
        return oldData;
    }

    @Override
    public void removeAllKey(int key) {
      if(this.head==null){
          return;
      }
      Node pre=this.head;
      Node cur=this.head.next;
      while(cur!=null){
          if(cur.data==key){
              pre.next=cur.next;
              cur=cur.next;
          }
          else{
              pre=cur;
              cur=cur.next;
          }
      }
      if(this.head.data==key){
          this.head=this.head.next;
      }
    }

    @Override
    public int getLength() {
        int count=0;
        Node cur=this.head;
        while (cur!=null){
            count++;
            cur=cur.next;
        }
       return count;
    }

    @Override
    public void display() {
    Node cur=this.head;
    while(cur!=null){
    System.out.print(cur.data+" " );
    cur=cur.next;
     }
        System.out.println ( );
    }
    @Override
    public void clear() {
   while(this.head!=null){
       Node cur=this.head.next;
       this.head.next=null;
       this.head=cur;
   }
    }
    //单链表的逆置
    public Node reverseList(){
        Node cur=this.head;
        Node prev=null;
        Node reverseHead=null;
        while(cur!=null){
            Node curNext=cur.next;
            if(curNext==null){
                reverseHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return reverseHead;
    }
    //反转单链表的打印
    public void show(Node resHead){
        Node cur=resHead;
        while(cur!=null){
            System.out.print (cur.data+" " );
            cur=cur.next;
        }
        System.out.println ( );
    }
}
