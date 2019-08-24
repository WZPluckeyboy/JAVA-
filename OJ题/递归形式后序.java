package 二叉树.OJ题;

import 二叉树.二叉树的链式结构的实现.二叉树递归形式的遍历;

import java.util.ArrayList;
import java.util.List;

public class 递归形式后序 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList ();
        if(root==null){
            return result;
        }
        result.addAll(postorderTraversal ( root.left ));
        result.addAll( postorderTraversal ( root.right));
        result.add(root.val);
        return result;
    }

}
