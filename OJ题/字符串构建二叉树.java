package 二叉树.OJ题;
public class 字符串构建二叉树 {
    class TreeNode {
        char val;
        TreeNode left;
        TreeNode right;
        public TreeNode(char val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }
    public int i=0;
    public  TreeNode createTestTree(String s){
        TreeNode root=null;
        //1、如果对应字符不是#,那么创建一个根节点
        //2、如果是#，那么直接下标++
        if(s.charAt ( i )!='#'){
            root=new TreeNode ( s.charAt ( i ) );
            i++;
            root.left=createTestTree ( s );
            root.right=createTestTree ( s );
        }
        else{
            i++;
        }
        return  root;
    }
}
