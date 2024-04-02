package org.collections;

import java.util.Iterator;

public class MainForGeneric {
    public static void main(String[] args) {
        MyGenericList<Integer> intList = new MyGenericList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        Iterator<Integer> listIterator = intList.iterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }
    }
}
