package 二叉树.OJ题;
public class 二叉树的子树 {
    public class TreeNode {
    char val;
    TreeNode left;
    TreeNode right;
    TreeNode(char x) {
       this.val = x;
      }
    }
    //判断是否为相同二叉树
    public boolean isSameTree(TreeNode p,TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if((p==null&&q!=null)||(p!=null&&q==null)){
            return false;
        }
        if(p.val==q.val){
            return isSameTree ( p.left,q.left )&&isSameTree ( p.right,q.right );
        }
        return false;
    }
   public boolean isSubtree(TreeNode s,TreeNode t ){
        if(isSameTree ( s,t )){
            return true;
        }
    if(s==null||t==null){
            return false;
    }
    return isSubtree ( s.right,t )&&isSubtree ( s.left,t );
    }
}
