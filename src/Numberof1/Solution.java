package Numberof1;

public class Solution {
    public static int NumberOf1(int n) {
        int count = 0;
        int flag = 1;
        while (flag != 0) {
            if((n&flag)!=0){
                count++;
            }
            flag = flag<<1;
        }
        return count;
    }
    public static void main(String[] args) {
        //使用n=10,二进制形式为1010，则1的个数为2；
        int n = 10;
        System.out.println(n + "的二进制中1的个数：" + NumberOf1(n));
    }
}
