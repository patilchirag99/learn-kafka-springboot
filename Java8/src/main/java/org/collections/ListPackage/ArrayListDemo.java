package org.collections.ListPackage;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(66);
        list.add(22);
        list.add(643);
        System.out.println(list.set(1,999));
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>(list);
        list2.addAll(list);
        System.out.println(list2.indexOf(2));
        System.out.println(list2);//[2, 999, 22, 643, 2, 999, 22, 643]

        List<Integer> sub = list2.subList(0,4); //shallow copy
        sub.set(1,100);
        System.out.println(list2);
        System.out.println("Sub :: " +sub);// [2, 999, 22, 643]

    }


}
