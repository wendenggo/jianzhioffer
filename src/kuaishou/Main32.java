package kuaishou;

import java.util.Scanner;

public class Main32 {
    public static void main(String[] args)
    {
        int sum=0;
        Scanner scanner = new Scanner(System.in);
        String[] str = scanner.nextLine().split(",");
        int m = Integer.parseInt(str[0]);
        int n = Integer.parseInt(str[1]);

        if(m>n){
            sum=m;
            m=n;
            n=sum;
            sum=0;
        }

        while ((n-m)!=0){
            if(Math.abs(n-m)<Math.abs(n/2-m)){
                sum+=Math.abs(n-m);
                break;
            }
            if(n%2==0&&n>m)
            {
                n/=2;
                sum++;
            }
            else
            {


                if(m>n/2){
                    n=(n+1)/2;
                }else {
                    n=(n-1)/2;
                }
                sum+=2;


            }
        }
        System.out.println(sum);


    }

}
