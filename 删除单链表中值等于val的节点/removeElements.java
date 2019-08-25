package 顺序表和链表.OJ习题.删除单链表中值等于val的节点;

public class removeElements {
    class ListNode{
        private  int val;
        private  ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public ListNode removeElements(ListNode head,int val){
        ListNode pre=head;
        ListNode cur=head.next;
        while (cur!=null){
            if(cur.val==val){ //找到了
               pre.next=cur.next;
               cur=pre.next;
            }else{
                pre=cur;
                cur=cur.next;
            }
        }
        if(head.val==val){
            head=head.next;
        }
        return head;
    }
}
