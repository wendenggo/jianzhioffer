package alibaba;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

/** 请完成下面这个函数，实现题目要求的功能 **/
    /** 当然，你也可以不按照这个模板来作答，完全按照自己的想法来 ^-^  **/
    static String calculate(int m, int k) {
        int y1 = 2,y2=3,y3=4,tem1=0,tem2=0;
        int[] shuzu = new int[m];
        int[] shuzu2 = new int[m];
        shuzu[0]=2;
        shuzu[1]=3;
        shuzu[2]=4;
        if(m<=3){
            if(m==1)
                y3=2;
            if(m==2)
                y3=3;
        }else{
        for(int i=3;i<m;i++){
            tem1=y3;
            y3=y1+y2;
            y1=y2;
            y2=tem1;
            shuzu[i]=y3;
        }
        }
       ff: for (;tem2<m;tem2++){
            if(m<=shuzu[tem2+2]){
                break ff;
            }
        }

        for(int i=0;i<m;i++){
            shuzu2[i] = reverse(shuzu[i]);
        }
        Arrays.sort(shuzu2);
        int shunxu = Arrays.binarySearch(shuzu,reverse(shuzu2[m-k]));


        String str = String.valueOf(y3)+","+String.valueOf(tem2+2018)+","+String.valueOf(shunxu+1);
        return str;

    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String[] line = in.nextLine().split(",");
        int m = Integer.valueOf(line[0]);
        int k = Integer.valueOf(line[1]);;
        System.out.println(calculate(m, k));

    }
    static int reverse(int a) {
        int rs = 0;
        while (a > 0) {
            rs *= 10;
            rs += a % 10;
            a /= 10;
        }
        return (rs);
    }
}