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
        int result = 1;
        for(target = target-1;target>0;target--){
            result = result*2;
        }
        return result;
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

        return dp[target];//
    }
}
