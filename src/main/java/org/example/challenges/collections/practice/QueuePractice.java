package src.main.java.org.example.challenges.collections.practice;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueuePractice {

    public static void main(String[] args) {
        Queue<Integer> deque = new PriorityQueue(Comparator.reverseOrder());

        deque.add(1);
        deque.add(5);
        deque.add(2);
        deque.add(3);

        System.out.println(deque);

        System.out.println(deque.peek());
        System.out.println(deque.poll());

        System.out.println(deque);

        Queue<Integer> deque1 = new PriorityQueue(Comparator.reverseOrder());
        System.out.println(deque1.poll());

        Queue<Integer> deque2 = new PriorityQueue(Comparator.reverseOrder());
        System.out.println(deque2.peek());
    }

}
