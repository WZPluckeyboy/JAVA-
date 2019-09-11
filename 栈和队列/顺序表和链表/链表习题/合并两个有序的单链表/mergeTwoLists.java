package 顺序表和链表.OJ习题.合并两个有序的单链表;
//合并两个有序的单链表
public class mergeTwoLists {
    class ListNode{
        private  int val;
        private ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public ListNode mergeTowLists(ListNode l1,ListNode l2){
        ListNode head=new ListNode(0);
        ListNode r=head;
        while (l1!=null&&l2!=null){
            if(l1.val>l2.val){
                r.next=l2;
                r=l2;
                l2=l2.next;
            }else{
                r.next=l1;
                r=l1;
                l1=l1.next;
            }
        }
        return head.next;
    }

}
