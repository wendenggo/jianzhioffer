import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        List<String> list = new ArrayList<>();
        while (in.hasNextLine()) {
            String ac = in.nextLine();
            if (ac.equals("")) {
                break;
            }
            list.add(ac);
        }
        int b = list.size();
        String[] split = list.get(0).split(" ");
        int c = split.length;
        int[][] a = new int[b][c];
        int k = 0;
        for(String s:list) {
            String[] split2 = s.split(" ");
            for (int j = 0; j < split2.length; j++) {
                a[k][j] = Integer.parseInt(split2[j]);
            }
            k++;
        }
        in.close();


        zhuanhuan(a);
        if (i == 0) {
            System.out.println(-1);
        }else {
            System.out.println(i);
        }


    }
    static int i = 0;
    public static void zhuanhuan(int[][] arr) {
        boolean flag = false;
        int row = arr.length-1;
        int col = arr[0].length-1;
        int[][] temp = new int[row+1][col+1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (temp[i][j] != 2) {
                    temp[i][j] = arr[i][j];
                }

                if (arr[i][j] == 2) {
                    if ((i-1)>=0) {
                        if (arr[i-1][j]!=0) {
                            temp[i-1][j] = 2;
                        }

                    }
                    if ((j+1)<=col) {
                        if (arr[i][j+1]!=0) {
                            temp[i][j+1] = 2;
                        }
                    }
                    if ((j-1)>=0) {
                        if (arr[i][j-1]!=0) {
                            temp[i][j-1] = 2;
                        }
                    }
                    if ((i+1)<=row) {
                        if (arr[i+1][j]!=0) {
                        }}}}}}}