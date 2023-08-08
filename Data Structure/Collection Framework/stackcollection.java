import java.util.*;

public class stackcollection {
    public static void main(String[] args) {

        // stack : Last in first out (LIFO)

        // Stack<Integer> s = new Stack<>();
        // s.push(1);ṇ
        // s.push(34);
        // s.push(3341);
        // s.push(1);
        // s.push(132);
        // s.push(567);

        // System.out.println(s);
        // s.pop();
        // System.out.println(s.peek());

        // Queue

        // Queue<Integer> q = new LinkedList<Integer>();
        // q.offer(1);
        // q.offer(2);
        // q.offer(1);
        // q.offer(3);
        // q.offer(4);
        // q.offer(2);
        // q.add(8);

        // System.out.println(q);
        // System.out.println(q.remove());
        // System.out.println(q.poll());
        // System.out.println(q);
        // System.out.println(q.peek());

        // array Deque
        // Deque<Integer> adq = new ArrayDeque<Integer>();

        // adq.offer(10);
        // adq.offer(20);
        // adq.offerLast(30);
        // adq.poll();
        // adq.offerFirst(40);
        // adq.pollFirst();
        // adq.pollLast();
        // System.out.println(adq);

        // Priority queue :-- Mean heap

        // PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        // pq.offer(12);
        // pq.add(3);
        // pq.add(4);
        // pq.offer(2);
        // System.out.println(pq);

        // Max heap :---

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
        pq.offer(123);
        pq.add(3);
        pq.add(4);
        pq.offer(2);
        System.out.println(pq.peek());
        System.out.println(pq);
    }
}
