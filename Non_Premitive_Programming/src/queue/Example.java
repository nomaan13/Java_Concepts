package queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example {
    public static void main(String[] args) {

        Queue q1  = new LinkedList();
        q1.offer(52);
        q1.add("Nomaan");
        q1.add('M');

        System.out.println(q1);
        System.out.println("Size of Queue :" +q1.size());

        PriorityQueue q2 = new PriorityQueue();
        q2.offer('q');
        q2.offer('o');
        q2.offer('a');
        q2.offer('h');
        q2.offer('e');


        System.out.println(q2);

      


    }
}
