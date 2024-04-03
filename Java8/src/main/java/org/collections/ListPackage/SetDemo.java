package org.collections.ListPackage;

import java.util.*;

public class SetDemo {

    public static void main(String[] args) {
            List<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(66);
            list.add(22);
            list.add(643);
//        Set<Integer> set = new HashSet<>();
//        set.add(1);
//        set.add(66);
//        set.add(14);
//        set.add(31);
//        System.out.println("before :: " + set);
//        set.retainAll(list);
//        System.out.println("After :: " + set);


        NavigableSet<Integer> sort = new TreeSet<>();
        sort.addAll(list);
        System.out.println(sort);
        System.out.println(sort.floor(2));
        System.out.println(sort.ceiling(65));
        System.out.println(sort.higher(66));
        System.out.println(sort.lower(65));
    }
}
