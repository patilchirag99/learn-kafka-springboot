package org.collections.ListPackage;

import java.util.*;

public class QueueAndStackDemo {
    //Queue -> fifo -> use linked list
    //Stack -> lifo -> use stack/dequeue
    public static void main(String[] args) {

        //FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);

//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        Iterator<Integer> iterator = queue.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }


        //LIFO
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
//        Iterator<Integer> iterator = stack.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        System.out.println(stack.peek());
//        System.out.println(stack.pop());
//        System.out.println(stack.peek());

        //Dequeue
        Deque<Integer> deque = new ArrayDeque<>();
//        deque.offerFirst(1);
//        deque.offerFirst(2);
//        deque.offerFirst(3);
//        System.out.println(deque);
//        System.out.println(deque.pollLast());

        //Priority Queue
//        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
//        priorityQueue.offer(1);
//        priorityQueue.offer(2);
//        priorityQueue.offer(0);
//        priorityQueue.offer(100);
//        System.out.println("Pq::" + priorityQueue);
//        List<Integer> top2 = new ArrayList<>();
//        int index=0;
//        while (!priorityQueue.isEmpty()){
//            if(index==2){
//                break;
//            }
//            top2.add(priorityQueue.poll());
//            index++;
//        }
//        System.out.println("top2 :: " + top2);
//        System.out.println(priorityQueue);

        PriorityQueue<StudentMarks> pq  = new PriorityQueue<>();
        pq.offer(new StudentMarks(70,80));
        pq.offer(new StudentMarks(38,10));
        pq.offer(new StudentMarks(100,45));
        pq.offer(new StudentMarks(40,88));
        pq.offer(new StudentMarks(97,80));
//        pq.stream().sorted().forEach(System.out::println);
//        List<StudentMarks> top3 = new ArrayList<>();s
//        int index=0;
//        while (!pq.isEmpty()){
//            if(index==2){
//                break;
//            }
//            top3.add(pq.poll());
//            index++;
//        }
//        System.out.println(top3);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(((o1, o2) -> o2-o1));
        priorityQueue.offer(1);
        priorityQueue.offer(29);
        priorityQueue.offer(0);
        priorityQueue.offer(100);
        System.out.println("Pq::" + priorityQueue);
        List<Integer> top2 = new ArrayList<>();
        int index=0;
        while (!priorityQueue.isEmpty()){
            if(index==2){
                break;
            }
            top2.add(priorityQueue.poll());
            index++;
        }
        System.out.println("top2 :: " + top2);
        System.out.println(priorityQueue);


    }
}
