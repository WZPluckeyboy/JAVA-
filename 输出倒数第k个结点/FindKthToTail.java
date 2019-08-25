package 顺序表和链表.OJ习题.输出倒数第k个结点;
//输入一个链表，输出该链表中倒数第k个结点。
public class FindKthToTail {
    class ListNode{
        private  int val;
        private ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public  ListNode  FindKthToTail(ListNode head,int k){
        ListNode node1=head;
        if(head==null||k<0){
            throw  new IllegalArgumentException("参数不合法");
        }
        ListNode node2=head;
        while(k-1>0){
            if(node2.next!=null){
                node2=node2.next;
                --k;
            }else{
                return null;
            }
        }
        while(node2.next!=null){
            node2 =node2.next;
            node1=node1.next;
        }
        return  node1;
    }
}
