import java.util.*;

public class hashTable{

    public static void main(String[] args){

        /* Hashtable = A data structure that stores unique keys to values (ex. <Integer, String>)
         *           Each key/value pair is known as an Entry
         *           Runtime Complexity: Best Case O(1); Worst Case O(n)
         *           -- Not ideal with small data sets
         *           -- Great with large data sets
         * 
         * Advantages:
         *  1. Fast Insertion
         *  2. Fast look up
         *  3. Fast deletion of key/value pairs
         * 
         * Hashing = Takes a key and computes an integer (formula based on key&data type)
         *         In a Hashtable, we use the hash % capacity to find the index number:
         *                          key.hashCode() % capacity = index
         * 
         * Bucket = An indexed storage location for one or more Entries
         *        Can store multiple Entries in case of a collision (linked like a LinkedList)
         * 
         * Collision = Hash function generates the same index for more than one key
         *           Less collision = more efficiency
         */

        Hashtable<String, String> table = new Hashtable<>(10);

        //.put(key, value); uses the key to calculate where the value is located in the hashtable
        //if the keys are integers, then the hash will be the same key, and %10 to get the index
        //if the keys are strings, a different hashing formula is used, and %10 to get the index
        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        //.remove(key); will remove the entry with that key
        table.remove(777);

        //.keySet(); take all of the keys and will put them into a set, a set is something you can iterate over
        for(String key : table.keySet()){
            //.get(key); finds what is stored in the location calculated by key
            //.hashCode(); will return the integer hash thats is represented by the "Key" we pass in
            System.out.println(key.hashCode() % 10 + "\t" + key + "\t" + table.get(key));

        }

    }

}

