package baidu3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int a =scanner.nextInt();
        int b = scanner.nextInt();
        yuesefu(a, b);
    }

    public static void yuesefu(int totalNum, int countNum) {
        // 初始化人数
        List<Integer> start = new ArrayList<Integer>();
        for (int i = 1; i <= totalNum; i++) {
            start.add(i);
        }
        //从下标为K开始计数
        int k = 0;
        while (start.size() >2) {

            //第m人的索引位置
            k = (k + countNum) % (start.size()) - 1;
            // 判断是否到队尾  到队尾时候k=-1
            if (k < 0) {
                System.out.print(start.get(start.size()-1)+" ");
                start.remove(start.size() - 1);
                k = 0;
            } else {
                System.out.print(start.get(k)+" ");
                start.remove(k);

            }
        }
        k = (k + countNum) % (start.size()) - 1;
        // 判断是否到队尾  到队尾时候k=-1
        if (k < 0) {
            System.out.print(start.get(start.size()-1));
            start.remove(start.size() - 1);
            k = 0;
        } else {
            System.out.print(start.get(k));
            start.remove(k);

        }
        System.out.println();
        System.out.println(start.get(0));
    }
}