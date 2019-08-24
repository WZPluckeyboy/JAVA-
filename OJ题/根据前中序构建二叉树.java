package 二叉树.OJ题;
public class 根据前中序构建二叉树 {
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
    public static  int FindIndex(int[] inorder,int val,int begin,int inend) {
        for (int i = begin; i <= inend; i++) {
            if (val == inorder[i]) {
                return i;
            }
        }
        return -1;
    }
    public  static int preIndex=0;
     public static TreeNode buildTreeChild(int[] preorder,int[] inorder,int begin,int end){
        if(begin>end){
            return null;
        }
     TreeNode root=new TreeNode ( preorder[preIndex] );
    int rootIndex=FindIndex ( inorder,preorder[preIndex],begin,end );
         preIndex++;
    root.left=buildTreeChild ( preorder,inorder,begin,rootIndex-1 );
    root.right=buildTreeChild ( preorder,inorder,rootIndex+1,end );
    return root;
     }
     public  static TreeNode buildTree(int[] preorder, int[] inorder) {
         if (preorder == null || inorder == null) {
             return null;
         }
         TreeNode tree = buildTreeChild ( preorder,  inorder, 0, inorder.length - 1 );
         return tree;
     }

    public static void main(String[] args) {
        int[] preoder={3,9,20,15,7};
        int[] inorder={3,9,20,15,7};
        System.out.println (buildTree (preoder,inorder  ) );
    }


}
