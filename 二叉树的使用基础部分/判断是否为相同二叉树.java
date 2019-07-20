package 二叉树.OJ题;

public class 判断是否为相同二叉树 {
    public class TreeNode {
   char val;
    TreeNode left;
   TreeNode right;
    TreeNode(char x) {
        val = x;
    }
   }
    public boolean isSameTree(TreeNode p,TreeNode q ){
        if((p==null&&q!=null)||p!=null&&q==null){
            return false;
        }
        if(p==null&&q==null){
            return true;
        }
        if(p.val==q.val){
           return isSameTree ( p.left,q.left )&&isSameTree ( p.right,q.right );
        }
        return false;
    }
}
