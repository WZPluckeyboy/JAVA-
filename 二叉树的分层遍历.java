package 二叉树.OJ题.二叉树进阶习题;
import sun.reflect.generics.tree.Tree;
import java.util.*;
public class 二叉树的分层遍历 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static List<List<Integer>> levelOrder(TreeNode root) {
            Queue <TreeNode> queue = new LinkedList <> ( );
            List<List<Integer>> res=new ArrayList <> (  );
            List<Integer>  list=new ArrayList <> (  );
            if(root==null){
                return  res;
            }
            if(root!=null){
              queue.offer ( root );
            }
          while(!queue.isEmpty ()){
                TreeNode cur=queue.peek ();
             list.add(cur.val);
              queue.poll ();
              if(cur.left!=null){
                  queue.offer ( root.left );
              }
              if(cur.right!=null){
                  queue.offer ( root.right );
              }
              res.add ( list );
          }
         return res;
        }
    }
