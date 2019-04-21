import java.util.Scanner;
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class ¿ìÀÖÊý{
    public ListNode FindKthToTail(ListNode head,int k) {
        if(head==null){
            return null;
        }
        int count=1;
        ListNode cur=head;
        while(head.next!=null){
            head=head.next;
            count++;
        }
        if(k>count){
            return null;
        }
        for(int i=0;i<count-k;i++){
            cur=cur.next;
        }
        return cur;
    }
    
}