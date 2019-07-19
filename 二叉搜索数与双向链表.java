package 二叉树.OJ题;
//采用中序遍历
public class 二叉搜索数与双向链表 {
    public static class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
   TreeNode prev=null;
    public  void ConvertChild(TreeNode pCur){
        if(pCur==null){
            return ;
        }
        ConvertChild ( pCur.left );
        pCur.left=prev;
        if(prev!=null){
            prev.right=pCur;
        }
        prev=pCur;
        ConvertChild ( pCur.right );


    }
    public  TreeNode Convert(TreeNode pRootOfTree) {
        ConvertChild(pRootOfTree);
        TreeNode head=pRootOfTree;
        while(head!=null&&head.left!=null){
            head=head.left;
        }
        return head;
    }
}
