
public class mergeSort{

    public static void main(String[] args){

        /* Merge Sort = Recursively divides the array in 2, sorts them, and merges them together
         *            Runtime Complexity = O(nlog(n))
         *            Space Complexity = O(n)
         * 
         * Better runtime complexity than insertion, selection, and bubble sort.
         * Worse space complexity than insertion, selection, and bubble sort.
         *  -- Uses up more memory to create subarrays
         */

        int array[] = {2, 4, 1, 5, 3, 6, 9, 7, 8};

        mergeSort(array);

        for(int i : array){
            System.out.print(i + " ");
        }

    }

    private static void mergeSort(int[] array){

        int length = array.length;
        if(length <= 1) return; // base case

        //finds the middle and splits original array into left and right subarrays
        int middle = length/2;

        int[] leftArray = new int[middle];
        int[] rightArray = new int[length - middle];

        //to keep track of which elements are being compared in the left and right subarrays
        int i = 0; //left array
        int j = 0; //right array

        //populates the left array then right array
        for(; i < length; i++){
            if(i<middle){
                leftArray[i] = array[i];
            } else {
                rightArray[j] = array[i];
                j++;
            }
        }
        
        //splits the left subarray
        mergeSort(leftArray);
        //splits the right subarray
        mergeSort(rightArray);
        //combines leftArray and rightArray into the original array
        merge(leftArray, rightArray, array);

    }

    private static void merge(int[] leftArray, int[] rightArray, int[] array){

        //assigns lengths to variables
        int leftSize = array.length/2;
        int rightSize = array.length - leftSize;
        int i = 0, l = 0, r = 0; // indices

        //checks the conditions for merging
        while(l < leftSize && r < rightSize){
            //if left element is less than right element, then it goes into the array first
            if(leftArray[l] < rightArray[r]){
                array[i] = leftArray[l];
                i++;
                l++;
            } else { //if right element is less than left element, then it goes into the array first
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }
        //if there are any elements left in the left array, then put them into the original array
        while(l < leftSize){
            array[i] = leftArray[l];
            i++;
            l++;
        }
        //if there are any elements left in the right array, then put them into the original array
        while(r < rightSize){
            array[i] = rightArray[r];
            i++;
            r++;
        }

    }

}
