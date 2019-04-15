package baidu3;

import java.util.*;

public class chongfu {



    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0 ;i<10;i++){
            hashSet.add(i);
        }
        System.out.println(hashSet.size());
        List<Integer> neibu = new ArrayList<>();
        neibu.add(1);
        neibu.add(2);
        List waibu = new ArrayList();
        waibu.add(neibu);
        Object integers = waibu.get(0);
        System.out.println(integers.get(0));
    }
}
