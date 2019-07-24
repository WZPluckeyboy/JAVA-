package 二叉树.OJ题.二叉树进阶习题;
public class 根据二叉树创建字符串 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
      public TreeNode(int x) {
            val = x;
        }
    }
    public static  void tree2strChild(TreeNode t,StringBuilder sb ){
        if(t==null){
            return;
        }
       sb.append(t.val);
        if(t.left==null){
            if(t.right==null)
                return;
        }
        else{
            sb.append ( "(" );
            tree2strChild ( t.left,sb );
            sb.append ( ")" );
        }
        if(t.right==null){
            return;
        }
        else {
            sb.append ( "(" );
            tree2strChild(t.right,sb);
            sb.append ( ")" );

        }
    }
    public static  String  tree2str(TreeNode t){
      StringBuilder sb=new StringBuilder (  );
      tree2strChild ( t,sb );
      return sb.toString ();
    }
    }

