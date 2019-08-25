package 顺序表和链表.OJ习题.输入两个链表找出它们的第一个公共结点;
//输入两个链表，找出它们的第一个公共结点
public class getIntersectionNode {
    class ListNode {
        private int val;
        private ListNode next;

        public ListNode(int x) {
            this.val = x;
            this.next = null;
        }
    }

    public ListNode getIntersecttionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        int headALength = 0;
        int headBLength = 0;
        ListNode pL = headA;
        ListNode pS = headB;
        while (pL != null) {
            ++headALength;
            pL = pL.next;
        }
        while (pS != null) {
            ++headBLength;
            pS = pS.next;
        }

        int myLen = headALength - headBLength;
        if (myLen < 0) {
            pL = headB;
            pS = headA;
            myLen = headBLength - headALength;
        }

        for (int i = 0; i < myLen; i++) {
            pL = pL.next;
        }

        while (pL != null && pS != null && pL != pS) {
            pL = pL.next;
            pS = pS.next;
        }
        if (pL == pS && pL != null && pS != null) {
            return pL;
        }
        return null;
    }
}
