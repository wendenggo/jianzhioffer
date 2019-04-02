package reConstructBinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Solution {
    public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = new TreeNode(pre[0]);
        TreeNode left =null;
        TreeNode right =null;
        int i = 0;
        while(in[i]!=pre[0]){
            ++i;
        }
        if (i!=0){
            int[] leftpre,leftin;
            leftpre = Arrays.copyOfRange(pre,1,i+1);
            leftin = Arrays.copyOfRange(in,0,i);
            left = reConstructBinaryTree(leftpre,leftin);
        }
        if(i!=in.length-1){
            int[] righpre,righin;
            righpre = Arrays.copyOfRange(pre,i+1,pre.length);
            righin = Arrays.copyOfRange(in,i+1,pre.length);
            right = reConstructBinaryTree(righpre,righin);
        }
        if(Objects.isNull(left)){
            root.right = left;
        }
        if(Objects.isNull(right)){
            root.right = right;
        }

        return root;
    }



    public static void main(String[] args) {
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};

        Traversal.lT(Solution.reConstructBinaryTree(pre,in));
    }
}
