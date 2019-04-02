package hello;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextLine()){
        String string = scanner.nextLine();
        System.out.println(Main.reverse(string));
        }
    }
    public static String reverse(String s) {
        int pos = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                pos = 0;
            }
            else if ((c >=33&&c<=47)||
                    (c >=58&&c<=64)||
                    (c >=91&&c<=96)||
                    (c >=123&&c<=126)) {
                pos = 0;
            }
            sb.insert(pos, c);
            if (!((c == ' ')||(c >=33&&c<=47)||
                    (c >=58&&c<=64)||
                    (c >=91&&c<=96)||
                    (c >=123&&c<=126))) {
                pos++;
            }
        }
        return sb.toString();
    }
}
