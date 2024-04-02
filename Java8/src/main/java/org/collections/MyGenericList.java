package org.collections;

import java.util.Iterator;

public class MyGenericList<T> implements Iterable{
    private T [] items;
    private int size;

    public  MyGenericList(){
        this.size =0;
        this.items = (T[]) new Object[1000];
    }
    public void add(T item){
        items[size++] = item;
    }
    public  T getItem(int index){
        return items[index];
    }

    @Override
    public Iterator iterator() {
        return new MyGenericListIterator(this);
    }

    private class MyGenericListIterator implements  Iterator<T>{
        private MyGenericList<T> list;
        int index=0;
        public MyGenericListIterator(MyGenericList<T> list){
            this.list=list;
        }
        @Override
        public boolean hasNext() {
            return index < list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }
}
