package 二叉树.OJ题;

import java.util.ArrayList;
import java.util.List;

public class 递归形式中序 {
        public class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x) {
                val = x;
            }
        }
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList ();
        if(root==null){
            return result;
        }
        result.addAll(inorderTraversal ( root.left ));
        result.add(root.val);
        result.addAll( inorderTraversal ( root.right));
        return result;
    }
}
