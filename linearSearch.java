
public class linearSearch{
    public static void main(String[] args){

        /* Linear Search = Iterates thorugh a collection, one element at a time
         *               Runtime complexity: O(n)
         * 
         * Advantages:
         * 1. Fast for searches of small to medium data sets
         * 2. Does not need to be sorted
         * 3. Useful for data structures that do not have random access (such as LinkedLists)
         * 
         * Disadvantages:
         * 1. Slow for large data sets
         */

         int[] array = {9, 2, 4, 6, 3, 1, 7, 5, 8};

         int index  = linearSearch(array, 0);

         if(index != -1){
            System.out.println("Element found at index: " + index);
         } else {
            System.out.println("Element not found");
         }

    }

    private static int linearSearch(int[] array, int value){
        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
}
