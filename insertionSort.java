
public class insertionSort{

    public static void main(String[] args){

        /* Insertion Sort = After comparing elements to the left, shifts the elements to the right
         *                to make room to insert a value.
         *                Runtime Complexity: O(n^2)
         *                -- Decent with small data sets
         *                -- Bad with large data sets
         * 
         * Preferable over bubble sort and Selection Sort.
         *  1. Has less steps than Bubble Sort
         *  2. Best case is O(n) compared to Selection Sort O(n^2)
         */

        int array[] = {2, 4, 1, 5, 3, 6, 9, 7, 8};

        insertionSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }

    }  

    public static void insertionSort(int[] array){
        int temp, j;
        for(int i = 1; i < array.length; i++){
            //stores the next element in the array
            temp = array[i];
            j = i - 1; 
            //compares the element before the stored element, if stored is less, then swap
            while(j>=0 && array[j] > temp){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = temp;
        }

    }

}
