package home.amit.dynamic.recursion;

public class IsValidBinaryTree {
    public boolean isValidBST(TreeNode root) {

        if (root==null )
        {
            return true;
        }
        if ( (root.left!=null && root.val<=root.left.val) ||  (root.right!=null && root.val>=root.right.val))
            {
                return false;
            }

        return isValidBST(root.left) && isValidBST(root.right);

    }


    public static void main(String[] args) {
        //           50
        //         40    70
        //      30    42 68  72

        TreeNode root= new TreeNode(40);
        root.left=new TreeNode(40);
        root.right=new TreeNode(40);
//        root.left.left=null;
//        root.left.right=null;
//        root.right.left=new TreeNode(68);
//        root.right.right=new TreeNode(12);
        IsValidBinaryTree isValidBinaryTree= new IsValidBinaryTree();
       boolean result= isValidBinaryTree.isValidBST(root);
        System.out.println(result);


    }

}
