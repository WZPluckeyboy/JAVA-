package 二叉树.OJ题;

public class 二叉树的最近公共祖先 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    //LCA   最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null){
          return null;
          }
          if(root==null){
            return null;
          }
          if(root==p||root==q){
            return root;
          }
          TreeNode left=lowestCommonAncestor ( root.left,p,q );
         TreeNode right=lowestCommonAncestor ( root.right,p,q );
          if(left!=null&&right!=null){
              return  root;
          }
          if(left==null&&right!=null){
              return  right;
          }
          if(left!=null&&right==null){
              return  left;
          }
          return null;
    }
}
