package kuaishou;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String a=in.nextLine();
        String b=in.nextLine();
        in.close();
        System.out.println(minDistance(a,b));
    }

    public static int minDistance(String word1, String word2) {
        if(word1 == null || word1.length() == 0) {
            return word2 == null ? 0 : word2.length();
        }

        if(word2 == null || word1.length() == 0)
            return word1.length();

        int l1 = word1.length();
        int l2 = word2.length();

        int[][] res = new int[l1+1][l2+1];

        for(int i = 1; i <= l1; i++)
            res[i][0] = i;
        for(int i = 1; i <= l2; i++)
            res[0][i] = i;

        for(int i = 1; i <= l1; i++) {
            for(int j = 1; j <= l2; j++) {
                if(word1.charAt(i-1) == word2.charAt(j-1)) {
                    res[i][j] = Math.min(Math.min(res[i-1][j], res[i][j-1]) + 1, res[i-1][j-1]);
                } else {
                    res[i][j] = Math.min(res[i-1][j-1], Math.min(res[i-1][j], res[i][j-1])) + 1;
                }
            }
        }

        return  res[l1][l2];
    }

}