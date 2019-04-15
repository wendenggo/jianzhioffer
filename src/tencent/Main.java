package tencent;
import java.util.Scanner;

public class Main {

    public static int getLeastNum(int[] array, int n) {
        int lens = array.length;
        if(array == null || lens == 0)
            return 0;
        int[] dp = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            dp[i] = 0;
        }
        for (int i = 1; i < n+1; i++) {
            int min = 999999;
            for (int j = 0; j < lens; j++) {
                if(i - array[j] >= 0) {
                    int temp = dp[i - array[j]]+1;
                    if(temp < min)
                        min = temp;
                }

            }
            dp[i] = min;
        }
        return dp[n];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m;//面值
        int n;//行数
        m = scanner.nextInt();
        n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int min_count = 2*getLeastNum(array, m);
        System.out.println(min_count);

    }

}