package kuaishou;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

            int i;
            long s;

            s = 1;
            for (i = 2; i <= n; i++) {
                s *= i;
                while (s % 10 == 0) s /= 10;
                s = s % 100000;
            }
            System.out.println(s % 10);


    }

}
