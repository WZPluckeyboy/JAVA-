package 顺序表和链表.OJ习题.反转单链表;
public class reverseList {
    class ListNode{
        private  int val;
        private ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public ListNode reverseList(ListNode head){
        ListNode reverseHead=null; //新的头节点
        ListNode cur=head;//当前结点
        ListNode prev=null;//前驱
        while(cur!=null){
            ListNode curNext=cur.next;
            if(curNext==null){
                reverseHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return reverseHead;
    }

}
