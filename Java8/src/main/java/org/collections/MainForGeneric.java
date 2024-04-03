package org.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class MainForGeneric {
    public static void main(String[] args) {
        MyGenericList<Integer> intList = new MyGenericList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
//        Iterator<Integer> listIterator = intList.iterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
        for(Object x: intList){
            System.out.println(x);
        }

        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(34);
        list.add(45);
        list.add(6);
        System.out.println(list);
        list.set(1,999);
        System.out.println(list);

    }
}
