package org.example;

import java.util.HashSet;
import java.util.Set;

public final class ImmutableClass {
    private final int id;
    private final String name;
    private final Set<Integer> set;

    public ImmutableClass(int id, String name, Set<Integer> set) {
        this.id = id;
        this.name=name;
        this.set=new HashSet<>(set);
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Set<Integer> getSet() {
        return new HashSet<>(set);
    }
}



class MainMethod{
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(3);
        ImmutableClass immutableClass = new ImmutableClass(1,"Chirag",set);

        Set<Integer> set1 = immutableClass.getSet();
        set1.add(4);
        System.out.println(set1);
        System.out.println(immutableClass.getSet());
        System.out.println(immutableClass.getId());
        System.out.println(immutableClass.getName());
    }
}
