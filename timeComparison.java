import java.util.ArrayList;
import java.util.LinkedList;

public class timeComparison{

    public static void main(String[] args){

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        long startTime;
        long endTime;
        long elapsedTime;
        
        for(int i = 0; i < 1000000; i++){
            linkedList.add(i);
            arrayList.add(i);
        }

        //LinkedList: Overall less efficient, however if using a larger dataset, may be more useful 

        startTime = System.nanoTime();
        //TESTS:
        // linkedList.get(0);
        // linkedList.get(500000);
        // linkedList.get(999999);
        // linkedList.remove(0);
        // linkedList.remove(500000);
        linkedList.remove(999999);


        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        
        System.out.println("Linked List time: " + elapsedTime + " ns");


        //ArrayList: Overall more efficient, however if using a larger dataset, may be less useful


        startTime = System.nanoTime();
        //TESTS:
        // arrayList.get(0);
        // arrayList.get(500000);
        // arrayList.get(999999);
        // arrayList.remove(0);
        // arrayList.remove(500000);
        // arrayList.remove(999999);

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;
        
        System.out.println("Array List time: " + elapsedTime + " ns");


    }
}