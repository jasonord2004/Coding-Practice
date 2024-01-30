import java.util.LinkedList;

public class linkedList{
    public static void main(String[] args){

        /* LinkedList = stores Nodes in 2 parts (data + address)
         *            Nodes are in non-consectuve memory locations
         *            Elements are linked using pointers
         *                  
         *                        Singly Linked List:
         *           Node                Node                Node
         *      [data | address] -> [data | address] -> [data | address]
         * 
         *                        Doubly Linked List:
         *                 Node                           Node
         *      [address | data | address] <-> [address | data | address]
         * 
         * Advantages of LinkedLists:
         *  1. Dynamic Data Structures (allocates needed memory while running)
         *  2. Insertion and Deletion of Nodes is easy. O(1)
         *  3. No/Low memory waste
         * 
         * Disadvantages of LinkedLists:
         *  1. Greater memory usage (additional pointer)
         *  2. No random access of elements (no index[i])
         *  3. Accessing/searching elements is more time consuming. O(n)
         * 
         * Applications of LinkedLists:
         *  1. Implement Stacks/Queues
         *  2. GPS navigation
         *  3. Music playlist
         */
        
        LinkedList<String> linkedList = new LinkedList<String>();

        //using .push and .pop to treat the linkedlist like a stack
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        System.out.println("As a stack: \nPush: " + linkedList);

        linkedList.pop();

        System.out.println("Pop: " + linkedList);

        //using .offer and .poll to treat the linked list like a queue
        LinkedList<String> linkedList2 = new LinkedList<String>();

        linkedList2.offer("A");
        linkedList2.offer("B");
        linkedList2.offer("C");
        linkedList2.offer("D");
        linkedList2.offer("F");
        System.out.println("As a queue: \nEnqueue: " + linkedList2);

        linkedList2.poll();
        System.out.println("Dequeue: " + linkedList2);

        //.add(index, obj); adds an object at a specific part of the linkedlist
        linkedList2.add(0, "A");
        linkedList2.add(4, "E");

        System.out.println("Adding objects: " + linkedList2);

        //.remove(obj); removes the specified object
        linkedList2.remove("E");

        System.out.println("Removing objects: " + linkedList2);

        //.indexOf(obj); finds the index of the specified object
        System.out.println("Index of 'F': " + linkedList2.indexOf("F"));

        //.peekFirst and .peekLast finds the head and the tail of the linkedlist
        System.out.println("First: " + linkedList2.peekFirst());
        System.out.println("Last: " + linkedList2.peekLast());

        //.addFirst and .addLast adds new nodes to the beginning and end respectively to the linkedlist
        linkedList2.addFirst("0");
        linkedList2.addLast("G");

        System.out.println(linkedList2);
        
        //.removeFirst and .removeLast removes the head and tail node from the linkedlist
        String head = linkedList2.removeFirst();
        String tail = linkedList2.removeLast();

        System.out.println("Head: " + head + "; Tail: " + tail);

    }
}