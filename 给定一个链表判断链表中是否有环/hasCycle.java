package 顺序表和链表.OJ习题.给定一个链表判断链表中是否有环;
//给定一个链表，判断链表中是否有环
public class hasCycle {
    class ListNode{
        private  int val;
        private ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public boolean hasCycle(ListNode head){
     ListNode fast=head;
     ListNode slow=head;
     while (fast!=null&&fast.next!=null){
       slow=slow.next;
       fast=fast.next.next;
       if(slow==fast){
           break;
       }
     }
     if(fast==null||fast.next==null){
         return  false;
     }else{
         return true;
     }
    }
}
