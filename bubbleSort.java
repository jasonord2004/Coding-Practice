
public class bubbleSort{

    public static void main(String[] args){
        
        /* Bubble Sort = Pairs of adjacent elements are compared, and the elements are 
         *             swapped if they are not in order
         *             Runtime Complexity: O(n^2)
         *              -- Okay with small data sets
         *              -- Bad with large data sets
         */

        int array[] = {9, 4, 2, 3, 1, 6, 7, 5, 8};

        bubbleSort(array);

        for(int i: array){
            System.out.println(i);
        }

    }

    public static void bubbleSort(int[] array){
        
        int temp;
        for(int i = 0; i < array.length - 1; i++){
            for(int j = 0; j < array.length - i - 1; j++){
                //compares the current number to the next number
                //if the current number is less than the next number, swap them
                if(array[j] < array[j+1]){ //array[j] > array[j+1] for ascending order
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }
}
