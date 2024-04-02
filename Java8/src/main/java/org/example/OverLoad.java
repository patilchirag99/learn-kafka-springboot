package org.example;

public class OverLoad {
    public void add(int a,long b){
        System.out.println("int long : " + (a+b));
    }
    public void add(long a,int b){
        System.out.println("long int : " + (a+b));
    }
}
