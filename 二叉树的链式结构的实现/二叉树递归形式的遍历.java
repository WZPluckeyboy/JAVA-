package 二叉树.二叉树的链式结构的实现;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;

public class 二叉树递归形式的遍历 {
    //一个二叉树节点的元素
    class TreeNode{
        char val;
        TreeNode left;
        TreeNode right;
        public  TreeNode(char var){
            this.val=val;
            this.right=null;
            this.left=null;
        }
    }
    //二叉树的前序遍历
    public  void binaryTreePrevOrder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" " );
        binaryTreePrevOrder ( root.left );
        binaryTreePrevOrder ( root.right );
    }
    //二叉树的中序遍历
    public  void binaryTreeInOrder(TreeNode root){
        if(root==null){
            return ;
        }
        binaryTreeInOrder ( root.left );
        System.out.print (root.val+" " );
        binaryTreeInOrder ( root.right );
    }
    //二叉树的后序遍历
    public  void binaryTreePostOrder(TreeNode root){
        if(root==null){
            return;
        }
        binaryTreePostOrder ( root.left );
        binaryTreePostOrder ( root.right );
        System.out.print (root.val+" " );
    }
}
