import java.util.Arrays;

public class binarySearch{

    public static void main(String[] args){

        /* Binary Search = A search algorithm that finds the position of a target value
         *               within a SORTED array. Half of the array is eliminated during each
         *               "step"
         */
        
        int array[] = new int[1000000];
        int target = 777777;

        for(int i = 0; i < array.length; i++){
            array[i] = i;
        }

        //Using built-in binary search method
        int index = Arrays.binarySearch(array, target);
        System.out.println("Built-in Method: ");

        if(index == -1){
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at: " + index);
        }

        System.out.println("Created Method: ");
        int index2 = binarySearch(array, target);

        if(index2 == -1){
            System.out.println(target + " not found");
        } else {
            System.out.println("Element found at: " + index2);
        }

    }

    private static int binarySearch(int[] array, int target){
        
        int low = 0;
        int high = array.length - 1;

        while(low <= high){

            int middle = low+ (high-low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if(value < target){
                low = middle + 1;
            } else if (value > target){
                high = middle - 1;
            } else {
                return middle; // target found
            }
        }
        return -1; // target not found
    }
}