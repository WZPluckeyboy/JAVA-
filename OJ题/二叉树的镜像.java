package 二叉树.OJ题;
//操作给定的二叉树，将其变换为源二叉树的镜像。
public class 二叉树的镜像 {
    class TreeNode{
        char val;
        TreeNode left;
        TreeNode right;
        public TreeNode(char var){
            this.val=val;
        }
    }
    public void Mirror(TreeNode  root){
        if(root==null){
            return;
        }
        if(root.left==null&&root.right==null){
            return;
        }
        TreeNode pTemp=root.left;
        root.left=root.right;
        root.right=pTemp;
        if(root.left!=null){
            Mirror ( root.left );
        }
        if(root.right!=null){
            Mirror ( root.right );
        }
    }

}
