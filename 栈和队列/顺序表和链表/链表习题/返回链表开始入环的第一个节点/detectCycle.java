package 顺序表和链表.OJ习题.返回链表开始入环的第一个节点;
/*
给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 NULL
*/

public class detectCycle {
    class ListNode{
        private  int val;
        private ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public ListNode detectCycle(ListNode head){
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&& fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                break;
            }
        }
        if(fast==null ||fast.next==null){
            return null;
        }
        slow=head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        if(fast==slow){
            return  slow;
        }
        return  null;
    }
}
