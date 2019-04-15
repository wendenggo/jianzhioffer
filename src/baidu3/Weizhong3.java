package baidu3;

import java.util.Scanner;


public class Weizhong3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        double a=in.nextInt();
        double b =in.nextInt();
        double c=in.nextInt();
        in.close();
        if(c>=a){
        System.out.print((long)Math.ceil(a*b/c));}
        else{
            System.out.print((long)Math.ceil(b));
        }
    }
}