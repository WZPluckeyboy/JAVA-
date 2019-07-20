package 二叉树.OJ题;

import java.util.ArrayList;
import java.util.List;
//有返回值形式
public class 递归形式前序遍历 {
    public class TreeNode {
    int val;
    TreeNode left;
   TreeNode right;
    TreeNode(int x) {
        val = x;
    }
 }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result=new ArrayList ();
        if(root==null){
            return result;
        }
        result.add(root.val);
        result.addAll(preorderTraversal ( root.left ));
        result.addAll( preorderTraversal ( root.right));
        return result;
    }
}
