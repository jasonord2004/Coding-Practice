
public class selectionSort{

    public static void main(String[] args){

        /* Selection Sort = Searches through an array and keeps track of the minimum valu during
         *                each iteration. At the end of each iteration, it swaps variables.
         *                Runtime Complexity: O(n^2)
         *                -- Okay with small data sets
         *                -- Bad with large data sets
         */

        int[] array = {2, 4, 1, 5, 3, 6, 9, 7, 8};
        
        selectionSort(array);

        for(int i: array){
            System.out.print(i);
        }

    }

    public static void selectionSort(int[] array){
        int min, temp;

        for(int i = 0; i < array.length-1; i++){
            //supposes the current element is the relative minimum
            min = i;
            for(int j = i+1; j < array.length; j++){
                //confirms relative minimum
                if(array[j] < array[min]){
                    min = j;
                }
            }
            //swaps the values of the relative beginning of the array and the value of the relative minimum
            temp = array[i];
            array[i] = array[min]; 
            array[min] = temp;
        }
    }
}
