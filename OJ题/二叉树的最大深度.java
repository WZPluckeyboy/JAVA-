package 二叉树.OJ题;
public class 二叉树的最大深度 {
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
    public int maxDept(TreeNode root){
        if(root==null){
            return 0;
        }

        return 1 + Math.max(maxDept(root.left), maxDept(root.right));
    }
}
