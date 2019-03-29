package JumpFloorII;

public class Solution {

    public static void main(String[] args) {
        Solution solution = new Solution();
        int target = 6;
        System.out.println(solution.JumpFloorII(target));
        System.out.println(solution.JumpFloorIII(target));
    }
    public int JumpFloorII(int target) {
        if(target==0){
            return 0;
        }
        int[] ints = new int[target];
        ints[0] = 1;
        ints[1] = 2;
        for (int i = 2;i<target;i++){
            ints[i] = ints[i-1]+ints[i-2];
        }
        int result[] = new int[target];
        result[0] = 1;
        result[1] = 2;
        for (int i =2;i<=target-1;i++){
            result[i]+=ints[i-1]+1+result[i-1];
        }
        return result[target-2];//
    }

    public int JumpFloorIII(int target) {
        if(target == 0) {
            return 0;
        }

        int[] dp = new int[target + 1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2;i <= target;i++) {
            dp[i] = 0;
            for(int j = 0;j < i;j++) {
                dp[i] += dp[j];
            }
        }

        return dp[target];
    }
}
