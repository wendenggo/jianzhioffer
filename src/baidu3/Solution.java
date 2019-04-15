package baidu3;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        LinkedList<Integer> list1  = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        LinkedList<Integer> list2  = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        List<LinkedList> lists = new LinkedList<>();
        lists.add(list1);
        lists.add(list2);
        System.out.println(lists.get(0).get(1));
    }
}
