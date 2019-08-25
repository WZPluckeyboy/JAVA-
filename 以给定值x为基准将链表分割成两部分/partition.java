package 顺序表和链表.OJ习题.以给定值x为基准将链表分割成两部分;
//所有小于x的结点排在大于或等于x的结点之前。
public class partition {
    class ListNode{
        private  int val;
        private ListNode next;
        public ListNode(int x){
            this.val=x;
            this.next=null;
        }
    }
    private ListNode partition(ListNode pHead,int x){
      ListNode beforeStart=null;
      ListNode beforeEnd=null;
      ListNode afterStart=null;
      ListNode afterEnd=null;
      while(pHead !=null){
          ListNode next=pHead.next;
          pHead.next=null;
          if(pHead.val<x){
              if(beforeStart==null){
                  beforeStart=pHead;
                  beforeEnd=beforeStart;
              }
              else{
                  beforeEnd.next=pHead;
                  beforeEnd=pHead;
              }
          }else{
              if(afterStart==null){
                  afterStart=pHead;
                  afterEnd=afterStart;
              }else{
                  afterEnd.next=pHead;
                  afterEnd=pHead;
              }
          }
          pHead=next;
      }
        if (beforeStart == null){
            return afterStart;
        }
        beforeEnd.next = afterStart;
        return beforeStart;

    }

}
