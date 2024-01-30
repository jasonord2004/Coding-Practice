import java.util.Queue;
import java.util.LinkedList;

public class queue{
    
    public static void main(String[] args){

        /* Queue = FIFO data structure --> First-In First-Out
         *       Stores objects like a "line of objects"
         *       A collection designed for holding elements prior to processing
         *       Linear data structure
         * 
         * Applications of Queues:
         *  1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
         *  2. Printer Queue (Print jobs should be completed in order)
         *  3. Used in Linked Lists, PriorityQueues, Breadth-first search
         */

        /*
        * Cannot use new Queue<String>() when initializing a queue because "Queue" is actually an interface (like a template)
        * In order to utilize Queues, we must use a class that implements Queue. Either LinkedList or PriorityQueue
        */
        Queue<String> queue = new LinkedList<String>();

        /* queue.isEmpty checks if the queue is empty and returns a boolean
        *  .isEmpty is from the Collection class, but is inherited by the Queue class 
        *  because the Queue class extends the collection class
        */
        System.out.println("EMPTY? " + queue.isEmpty());

        /* Enqueues an object to the tail of a queue
         * or use add("Karen"); --> The difference is that add() will cause an exception if the queue is empty
         */
        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println("EMPTY? " + queue.isEmpty());

        //queue.size finds and returns the numerical size of the queue. Originally part of collection class
        System.out.println("SIZE: " + queue.size());

        //queue.contains checks and returns if the object is found in the queue. Does not return the index of the location of the object
        System.out.println("Chad in queue? " + queue.contains("Chad"));
        
        //queue.peek() will check what is at the head of the queue, and will return that object without removing it
        System.out.println("Who's first? " + queue.peek());

        /* 
         * Dequeues an object from the head of the queue, assigning the head to the next object, and also shifts the tail
         * or use remove(); --> The difference is that remove() will cause an exception if it is unable to dequeue
         */
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        //Usually can use queue.element();, however, in this case it will cause an exception since the queue is empty
        queue.peek();

        System.out.println("Who's left? " + queue);

    }
}