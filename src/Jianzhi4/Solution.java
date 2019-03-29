package Jianzhi4;

public class Solution {
    public  void run(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        Solution solution = new Solution();
        TreeNode treeNode = solution.reConstructBinaryTree(pre,in);
        System.out.println(treeNode.val);
    }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode treeNode = new TreeNode(pre[0]);
        for(int i=0;i<pre.length;i++){
            for(int j=1;j<pre.length;j++){
                if(pre[j]!=in[i]){
                    temp
                }
            }
        }
    }



}