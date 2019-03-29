package RectCover;

public class Solution {
    public int RectCover(int target) {
        if (target==0){
            return 0;
        }
        else if(target==1){
            return 1;
        }else if (target==2){
            return 2;
        }else{
            int[] result = new int[target];
            result[0] = 1;
            result[1] = 2;
            for (int i=2;i<target;i++){
                result[i] = result[i-1]+result[i-2];
            }
            return result[target-1];
        }
    }
}