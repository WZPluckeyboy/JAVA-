package 二叉树.OJ题;

import sun.reflect.generics.tree.Tree;

//给定一个二叉树，判断其是否为一个高度平衡的二叉树
public class 判断一棵二叉树是否是平衡二叉树 {
    public class TreeNode{
        char val;
        TreeNode left;
        TreeNode right;
        public TreeNode(char val){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    //首先求二叉树的深度
    public  int maxDepth(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=maxDepth ( root.left );
        int rightHeight=maxDepth ( root.right );
        return  leftHeight>rightHeight?leftHeight+1:rightHeight+1;
    }
    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        else{
            int leftHeight=maxDepth ( root.left );
            int righHeight=maxDepth ( root.right );
          return Math.abs(leftHeight-righHeight) <2&&isBalanced ( root.left ) &isBalanced ( root.right );
        }
    }
}
