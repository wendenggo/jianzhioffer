package reConstructBinaryTree;

public  class  BuildTree {
    public TreeNode buildTree(){
        TreeNode root = new TreeNode(1);
        TreeNode a = new TreeNode(2);
        root.left = a;
        TreeNode b = new TreeNode(3);
        root.right = b;
        TreeNode c =  new TreeNode(4);
        TreeNode d = new TreeNode(5);
        root.left.left = c;
        root.left.right = d;


        return root;
    }
}
