package toutiao;


import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tashu = in.nextInt();
        int[] tadenengliang = new int[tashu];
        int[] bianhuahou= new int[tashu+1];

        for (int i = 0; i <tashu; i++) {
            tadenengliang[i] = in.nextInt();
        }
        for(int e=1;e<1000;e++){
            bianhuahou[0]=e;
            for (int j=0;j<tashu;j++){
                bianhuahou[j+1]=bianhuahou[j]-jisuan(bianhuahou[j],tadenengliang[j]);
            }

            if(min(bianhuahou)>=0){
                System.out.println(e);
                break;
            }
        }

    }

    public static int jisuan(int E,int Hk1) {
        int result = 0;
        if(Hk1>E){
            result = Hk1-E;
            return result;
        }else {
            result = E-Hk1;
            return result;
        }
    }

    public static int min(int[] array) {
        int minIndex = array[0];
        for (int i = 0; i < array.length; i++) {

            if(minIndex > array[i]){
                minIndex = array[i];
            }
        }
       return minIndex;
    }

}
