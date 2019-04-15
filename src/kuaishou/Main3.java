package kuaishou;

import java.util.Scanner;

public class Main3 {

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



            while((n-m)!=0)
            {
                if(n%2==0&&n>m)
                {
                    n/=2;
                    sum++;
                }
                else
                {

                    if(m>=n)
                    {
                        sum+=m-n;
                        break;
                    }
                    n=(n+1)/2;
                    sum+=2;


                }
            }


        System.out.println(sum);


    }

}
