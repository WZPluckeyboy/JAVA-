package 二叉树.OJ题;

public class 根据中后序遍历创建二叉树 {
        public  static int posIndex=0;
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

        public static TreeNode buildTreeChild(int[] inorder,int[] postorder,int begin,int end){
            if(begin>end){
                return null;
            }
            TreeNode root=new TreeNode ( postorder[posIndex] );
            int rootIndex=FindIndex ( inorder,postorder[posIndex],begin,end );
            posIndex++;
            root.left=buildTreeChild ( inorder,postorder,rootIndex+1,end );
            root.right=buildTreeChild (inorder,postorder,begin,rootIndex-1);
            return root;
        }
        public  static TreeNode buildTree(int[] inorder, int[] postorder) {
            if (inorder == null || postorder == null) {
                return null;
            }
            posIndex=postorder.length-1;
            TreeNode tree = buildTreeChild ( inorder,  postorder, 0, inorder.length - 1 );
            return tree;
        }

        public static void main(String[] args) {
            int[] preoder={3,9,20,15,7};
            int[] inorder={3,9,20,15,7};
            System.out.println (buildTree (preoder,inorder  ) );
        }

    }

