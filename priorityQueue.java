import java.util.*;

public class priorityQueue{
    public static void main(String[] args){

        /* Priority Queue = FIFO data structure that serves elements with the highest
         *                priority first before elemnets with lower priority
         * Note that when initializing, PriorityQueue<> is used instead of LinkedList<>, making the
         * queue ordered.
         */
        Queue<String> queue = new PriorityQueue<>();

        //enqueue elements into the queue
        queue.offer("B");
        queue.offer("C");
        queue.offer("A");
        queue.offer("F");
        queue.offer("D");

        //while the queue is not empty, 
        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
        
        //Collections.reverseOrder() will make the Priority in reverse order
        Queue<Double> queue2 = new PriorityQueue<Double>(Collections.reverseOrder());

        //enqueue elements into the queue
        queue2.offer(3.0);
        queue2.offer(2.5);
        queue2.offer(4.0);
        queue2.offer(1.5);
        queue2.offer(2.0);

        //while the queue is not empty, 
        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }
}