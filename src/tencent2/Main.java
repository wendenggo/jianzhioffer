package tencent2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        long[] value=new long[n];
        long[] cost=new long[n];
        for (int i=0;i<n;i++){
            value[i]=in.nextInt();
        }
        for (int i=0;i<n;i++){
            cost[i]=in.nextInt();
        }
        in.close();
        long zhandouli=0;
        long jinbi=0;
        for (int i=0;i<n;i++){
            if (zhandouli<value[i]){
                zhandouli+=value[i];
                jinbi+=cost[i];
            }

        }
        System.out.println(jinbi);
    }
}