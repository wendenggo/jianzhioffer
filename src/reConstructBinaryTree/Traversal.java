package reConstructBinaryTree;

public class Traversal {
    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();
        TreeNode treeNode = buildTree.buildTree();
        //Traversal.preT(treeNode);
        //Traversal.inT(treeNode);
        Traversal.lT(treeNode);
    }

    public static void preT(TreeNode treeNode){
        System.out.println(treeNode.val);
        if(treeNode.left!=null){
            preT(treeNode.left);
        }
        if (treeNode.right!=null){

            preT(treeNode.right);
        }
    }

    public static void inT(TreeNode treeNode){
        if (treeNode.left!=null){
            inT(treeNode.left);

        }
        System.out.println(treeNode.val);
        if(treeNode.right!=null){
            inT(treeNode.right);

        }
    }

    public static void lT(TreeNode treeNode){
        if (treeNode.left!=null){
            lT(treeNode.left);

        }

        if(treeNode.right!=null){
            lT(treeNode.right);

        }
        System.out.println(treeNode.val);
    }
}
