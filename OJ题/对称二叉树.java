package 二叉树.OJ题;
public class 对称二叉树 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public  static boolean isSymmetricChild(TreeNode leftTree,TreeNode rightTree) {
       if((leftTree==null&&rightTree!=null)||
               (leftTree!=null&&rightTree==null)){
               return false;
       }
       if(leftTree==null&&rightTree==null) {
              return true;
       }
       if((leftTree.val==rightTree.val)&&isSymmetricChild ( leftTree.left,rightTree.right )&&
               isSymmetricChild ( leftTree.right,rightTree.left )){
           return true;
       }
       else{
           return false;
       }
    }
        public static boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean a=isSymmetricChild ( root.left,root.right );
        return a;
        }



}
