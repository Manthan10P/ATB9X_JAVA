package NOV.LAB21112024_LinkedList_Set_collectionFramework.LAB02;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {

        PriorityQueue PQ = new PriorityQueue();
        //FIFO
        PQ.offer("1");
        PQ.offer("2");
        PQ.offer("3");
        PQ.offer("4");
        System.out.println(PQ);
        System.out.println(PQ.peek());
        System.out.println(PQ);
        System.out.println(PQ.poll());
        System.out.println(PQ);


    }
}