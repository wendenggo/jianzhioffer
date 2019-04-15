package jingdong;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int[] b = new int[(a - 1) * 2];
        int answer = 0;
        for (int i = 0; i < (a - 1) * 2; i++) {
            b[i] = in.nextInt();
        }
        int[] indexOf1 = getIndex(b, 1);
        if (indexOf1[1] == -1) {
            answer = a - 1;
        } else {
            int lefttree=-1;
            int rightnode=-1;
            if(indexOf1[0]%2==1){
                lefttree = b[indexOf1[0]-1];
            }else {
                lefttree = b[indexOf1[0]+1];
            }
            if(indexOf1[1]%2==1){
                rightnode = b[indexOf1[1]-1];
            }else {
                rightnode = b[indexOf1[1]+1];
            }
            Set<Integer> set1= new HashSet<>();
            Set<Integer> set2= new HashSet<>();
            set1.add(lefttree);
            set2.add(rightnode);

            while (sumall(b)!=b.length*(-1)){
                for(int i=0;i<a-1;i++){
                    if(set1.contains(b[2*i])){
                        b[2*i]=-1;
                        if( b[2*i+1]!=1) set1.add(b[2*i+1]);
                        b[2*i+1]=-1;
                    }
                    if(set2.contains(b[2*i])){
                        b[2*i]=-1;
                        if( b[2*i+1]!=1)  set2.add(b[2*i+1]);
                        b[2*i+1]=-1;
                    }
                    if(set1.contains(b[2*i+1])){
                        b[2*i+1]=-1;
                        if( b[2*i]!=1) set1.add(b[2*i]);
                        b[2*i]=-1;
                    }
                    if(set2.contains(b[2*i+1])){
                        b[2*i+1]=-1;
                        if( b[2*i]!=1) set2.add(b[2*i]);
                        b[2*i]=-1;
                    }
                }

            }
            int c= set1.size();

            int d =set2.size();

            answer=Math.max(c,d);


        }
        System.out.println(answer);
    }

    public static int sumall(int[] arr) {
        int sum=0;

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        return sum;//如果未找到返回-1
    }
    public static int[] getIndex(int[] arr, int value) {
        int[] a = {-1, -1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                if (a[0] == -1) {
                    a[0] = i;
                } else {
                    a[1] = i;
                    return a;
                }
            }
        }
        return a;//如果未找到返回-1
    }
}