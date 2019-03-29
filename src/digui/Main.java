package digui;

public class Main {
    public static void main(String[] args) {

        System.out.println(Main.fei(11));
    }

    public static int fei(int in){
        if(in == 2||in==1){
            return 1;
        }
        else
            return fei(in-1)+fei(in-2);
    }

}
