package 二叉树.二叉树的链式结构的实现;

import java.util.Stack;

//二叉树的前序遍历非递归
public class 二叉树非递归形式的便利 {
    class  TreeNode{
        char val ;
        TreeNode left;
        TreeNode right;
        public TreeNode(char var){
            this.val=val;
            this.left=null;
            this.right=null;
        }
    }
    // 二叉树的非递归前序遍历
    public void binaryTreePreOrderNonR(TreeNode root){
      Stack<TreeNode> stack=new Stack<> ();
      TreeNode cur=root;
      TreeNode top=null;
      while (cur!=null||!stack.empty ()){
         while(cur!=null) {
             System.out.print (cur.val+" " );
             stack.push ( cur );
             cur=cur.left;
          }
          top=stack.pop ();
         cur=top.right;
      }
      }
    //二叉树的非递归中序遍历
    public  void binaryTreeInOrderNonR(TreeNode root){
        Stack<TreeNode> stack=new Stack <> ();
        TreeNode cur=root;
        TreeNode top=null;
        while(cur!=null||!stack.empty ()){
            while(cur!=null){
                stack.push ( cur );
                cur=cur.left;
            }
            top=stack.pop ();
            System.out.println (top.val );
            cur=top.right;
        }
    }
    //二叉树的非递归后序遍历
    public void binaryTreePostOrderNonR(TreeNode root){
        Stack<TreeNode> stack=new Stack <> ();
        TreeNode cur=root;
        TreeNode pre=null;
        while (cur!=null||!stack.empty ()){
            while (cur!=null) {
                stack.push ( cur );
                cur=cur.left;
            }
            cur=stack.peek ();
            if(cur.right==null||cur.left==pre){
                System.out.print (cur.val+" " );
                stack.pop ();
                pre=cur;
                cur=null;
            }
            else{
                cur=cur.right;
            }
        }
    }
}
