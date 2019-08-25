package 顺序表和链表.OJ习题.返回链表的中间结点;
/*
给定⼀个带有头结点 head 的⾮空单链表，返回链表的中间结点。如果有两个中间结点，则返回第
一个中间结点。
* */
public class middleNode {
    class ListNode{
        private  int val;
        private ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public  ListNode middleNode(ListNode head){
        ListNode cur=head;
        int count=0;
        while(cur!=null){
            count++;
            cur=cur.next;
        }
        int len=count/2+1;
        for(int i=1;i<len;i++){
            cur=cur.next;
        }
        return  cur;
    }

}
