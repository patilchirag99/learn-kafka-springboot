package org.collections.ListPackage;

import java.util.*;

public class MapsDemo {
    public static void main(String[] args) {
//        Map<String , Integer> map =  new HashMap<>();
//        map.put("Chirag",2);
//        map.put("Patil",1);
//        map.put("Ram",3);
//        map.put("Shaym",4);
//        Set<Map.Entry<String,Integer>> set = map.entrySet();
//        for(Map.Entry<String,Integer> x: set){
//            System.out.println(x.getKey() + "," + x.getValue());
//        }

        //Keys sorted -> treemap
        NavigableMap<Integer , String> treeMap =  new TreeMap<>();
        treeMap.put(2,"Chirag");
        treeMap.put(5,"Patil");
        treeMap.put(3,"Ram");
        treeMap.put(8,"Shaym");
        Set<Map.Entry<Integer,String>> treeSet = treeMap.entrySet();
//        for(Map.Entry<Integer,String> x: treeSet){
//            System.out.println(x.getKey() + "," + x.getValue());
//        }
//        System.out.println(treeMap.ceilingKey(2));
//        System.out.println(treeMap.pollFirstEntry());
//        System.out.println(treeMap.pollLastEntry());
//        System.out.println(treeMap.ceilingEntry(4));

        treeMap.entrySet().stream().sorted((o1,o2) -> o2.getKey() - o1.getKey() ).forEach(System.out::println);



    }

}
