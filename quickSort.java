
public class quickSort{

    public static void main(String[] args){

        /* Quick Sort = Moves smaller elements to left of a pivot. Recursively divides
         *            array into 2 partitions (sections).
         *            Runtime complexity = Best Case: O(nlog(n)); Average Case: O(nlog(n)); Worst Case: O(n^2) (if the array is sorted);
         *            Space Complexity = O(log(n)) due to recursion (adds frames to the call stack)
         */

        int array[] = {2, 4, 1, 5, 3, 6, 9, 7, 8};

        quickSort(array, 0, array.length-1);

        for(int i : array){
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int start, int end){

        if(end <= start) return; //base case

        //determines the pivot point for the subarrays
        int pivot = partition(array, start, end);
        quickSort(array, start, pivot - 1);
        quickSort(array, pivot + 1, end);

    }
    //returns the index of the pivot
    private static int partition(int[] array, int start, int end){
        
        //the first pivot point starts at the end (other variations can start and beginning or middle)
        int pivot = array[end];
        int temp;
        //this integer will be used to follow the indexes of elements less than the pivot element
        int i = start - 1;
        for(int j = start; j <= end - 1; j++){
            //if the element is less than the pivot point, they are swapped into the location of i
            if(array[j] < pivot){
                i++;
                temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        //shifts i into the true location of the pivot point
        i++;
        //swap the pivot point into position
        temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        //returns the pivot point for future calls
        return i;

    }

}
