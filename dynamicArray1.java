
public class dynamicArray1{

        public static void main(String[] args){

            /* Dynamic Array = ArrayList
             *               A dynamic array is an array that changes it's length based on how many
             *               elements are added/removed from the array.
             *               Unlike a static array, the arraylist can change sizes but can also create
             *               a lot of memory wastage
             * 
             */

            //creates a dynamic array of capacity 5
            DynamicArray dynamicArray = new DynamicArray(5);

            //adds objects into the dynamic array in order
            dynamicArray.add("A");
            dynamicArray.add("B");
            dynamicArray.add("C");
            dynamicArray.add("D");

            //inserts an object at a specific spot, shifts the other objects
            dynamicArray.insert(0, "X");
            
            //searches and deletes the object, shifts the other objects 
            dynamicArray.delete("A");

            //searches and returns the index of the desired object
            System.out.println("Index of 'C': " + dynamicArray.search("C"));
            System.out.println(dynamicArray);

            //returns the numerical size (how many elements) of the array
            System.out.println("Size: " + dynamicArray.size);

            //returns the numerical capacity (length) of the array
            System.out.println("Capacity: " + dynamicArray.capacity);

            //returns if the array is empty or not
            System.out.println("Empty: " + dynamicArray.isEmpty());

            dynamicArray.insert(1,"A");

            //Adding this element forces the arraylist to increase in capacity since size > capacity after this line
            dynamicArray.add("E");
            System.out.println(dynamicArray);

            //Deleting these element forces the arraylist to decrease in capacity since size < capacity/3 
            dynamicArray.delete("A");
            dynamicArray.delete("B");
            dynamicArray.delete("C");
            dynamicArray.delete("D");
            System.out.println(dynamicArray);

        }

}