package toutiao;
/**贪心算法**/
import java.util.Scanner;

public class Main4 {
    private static int cityNumber;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         cityNumber = in.nextInt();
        int[][] distence = new int[cityNumber][cityNumber];
        int[] citybiaozhi = new int[cityNumber];
        int fax = 0;
        int[] distancelist = new int[cityNumber];
        for (int i = 0; i < cityNumber; i++) {
            for (int j = 0; j < cityNumber; j++)
            distence[i][j] = -in.nextInt();
        }
        for (int i=0;i<cityNumber;i++){
            distancelist[i]=distence[0][i];
        }



        int temCity = 0;
        int lastTemCity = 0;
        citybiaozhi[temCity] =1;

        while (sumall(citybiaozhi)!=cityNumber){
            lastTemCity = temCity;
            temCity = max(distence[temCity]);
            fax = fax+distence[lastTemCity][temCity];
            distence =changedistance(distence,lastTemCity);
            citybiaozhi[temCity] =1;

        }
            fax=fax+distancelist[temCity];
            System.out.println(-fax);

    }

    public static int max(int[] array) {
        int maxindex = 0;
        int maxValue = -999;
        for (int i = 0; i < array.length; i++) {

            if(array[i]!=0&&maxValue < array[i]){
                maxValue = array[i];
                maxindex = i;
            }
        }
        return maxindex;
    }
    private static int sumall(int[][] array) {
        int sum = 0;

        for (int[] array1:array) {
            for (int i:array1){
                sum= sum + i;
            }
        }
        return sum;
    }
    private static int sumall(int[] array) {
        int sum = 0;
            for (int i:array){
                sum= sum + i;
            }
        return sum;
    }
    private static int[][] changedistance(int[][] array,int temCity ){
        for(int i = 0;i<cityNumber;i++){
            array[i][temCity]=0;
            array[temCity][i]=0;
        }
        return array;
    }
}