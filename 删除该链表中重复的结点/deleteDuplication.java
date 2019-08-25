package 顺序表和链表.OJ习题.删除该链表中重复的结点;
/*在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
//重复的结点不保留，返回链表头指针*/
public class deleteDuplication {
    class ListNode{
        private  int val;
        private ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    public ListNode deleteDuplication(ListNode pHead){
        ListNode head=new ListNode(-1);
        //代替head,串联存放不重复的节点
        ListNode tmpHead=head;
        ListNode cur=pHead;//用来遍历单链表
        while(cur!=null){
            if(cur.next!=null&&cur.val==cur.next.val){
                // 说明找到了重复节点
                while(cur.next!=null&&cur.val==cur.next.val){
                    cur=cur.next;
                }
                cur=cur.next;
                tmpHead.next=cur;
            }else{
                tmpHead.next=cur;
                tmpHead=cur;
                cur=cur.next;
            }
        }
       return head.next;
    }


}
