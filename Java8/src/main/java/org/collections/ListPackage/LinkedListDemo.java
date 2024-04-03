package org.collections.ListPackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(66);
        linkedList.add(22);
        linkedList.add(643);
        ListIterator<Integer> integerListIterator = linkedList.listIterator();
        System.out.println("Peek : " + linkedList.offer(999));
        //next -> return and then increment
        //prec -> decrement and then return
//        System.out.println(integerListIterator.next());
//        System.out.println(integerListIterator.next());
//        System.out.println(integerListIterator.previous());
//        System.out.println(integerListIterator.next());
        Iterator<Integer> integerIterator = linkedList.descendingIterator();
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }

        //Convert to array
        System.out.println("printing arrray :: ");
        Integer[] array = linkedList.toArray(new Integer[0]);
        for(int x:array){
            System.out.println(x);
        }
    }
}
