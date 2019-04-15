package jingdong;

import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int[] b = new int[(a-1)*2];
        int answer =0;
        for(int i=0;i<(a-1)*2;i++){
            b[i]=in.nextInt();
        }
         int[] indexOf1 = getIndex(b,1);
        if(indexOf1[1]==-1){
            answer = a-1;
        }else{
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


        }
        System.out.println(answer);
    }
    public static int[] getIndex(int[] arr, int value) {
        int[] a={-1,-1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                if(a[0]==-1){
                    a[0]=i;
                }else {
                    a[1]=i;
                    return a;
                }
            }
        }
        return a;//如果未找到返回-1
    }
    public static int[] getListIndex(List<Integer> arr, int value) {
        int[] a={-1,-1};

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == value) {
                if(a[0]==-1){
                    a[0]=i;
                }else {
                    a[1]=i;
                    return a;
                }
            }
        }
        return a;//如果未找到返回-1
    }


    public void getnumber(int[] arr, int value) {

        List<Integer> getnumberList = new LinkedList<>();
        int lefttree =-1;
        int rightnode=-1;
        for(int i=0;i<arr.length;i++){
            getnumberList.add(arr[i]);
        }
        int[] geted=getListIndex(getnumberList,value);


        while (geted[0]!=-1||geted[1]!=-1){
            if(geted[1]%2==1){
                 lefttree = getnumberList.get(geted[1]-1);
                ((LinkedList<Integer>) getnumberList).remove(geted[1]-1);
                ((LinkedList<Integer>) getnumberList).remove(geted[1]-1);
            }else {
                lefttree = getnumberList.get(geted[1]+1);
                ((LinkedList<Integer>) getnumberList).remove(geted[1]+1);
                ((LinkedList<Integer>) getnumberList).remove(geted[1]+1);
            }
            if(geted[0]%2==1){
                rightnode = getnumberList.get(geted[0]-1);
                ((LinkedList<Integer>) getnumberList).remove(geted[0]-1);
                ((LinkedList<Integer>) getnumberList).remove(geted[0]-1);
            }else {
                rightnode = getnumberList.get(geted[0]+1);
                ((LinkedList<Integer>) getnumberList).remove(geted[0]+1);
                ((LinkedList<Integer>) getnumberList).remove(geted[0]+1);
            }
            geted=getListIndex(getnumberList,lefttree);
        }




    }


}
