
public class DynamicArray {
    
    int size;
    int capacity = 10;
    Object[] array;

    //creates an empty dynamic array
    public DynamicArray() {
        this.array = new Object[capacity];
    }
    //creates a dynamic array with a given capacity
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    //adds a certain object within the dynamic array
    public void add(Object data) {
        if (size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    //inserts a certain object at a certain location in the dynamic array
    public void insert(int index, Object data){   
        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i-1];
        }
        array[index] = data;
        size++;
    }   
    //deletes a certain object within the dynamic array
    public void delete(Object data){ 
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                for(int j = 0; j < size-i-1; j++){
                    array[i+j] = array[i+j+1];
                }
                array[size-1] = null;
                size--;
                if(size <= (int)(capacity/3)){
                    shrink();
                }
                break;
            }
        }
    }
    /*
    * searches for a certain object within the dynamic array, 
    * returns the index of the object or returns -1 if not found
    */
    public int search(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data) {
                return i;
            }
        }

        return -1;
    }
    //increases capacity of the dynamic array by twice the size if more objects than array length
    private void grow(){
        
        int newCapacity = (int)(capacity*2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    //decreases capacity of the dynamic array by half the size if objects are less than 1/3 the array length
    private void shrink(){
        int newCapacity = (int)(capacity/2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    //returns whether or not the size of the dynamic array is 0
    public boolean isEmpty(){
        return size == 0;
    }
    //converts the contents of the dynamic array into a string and returns
    public String toString(){

        String string = "";

        for(int i = 0; i < capacity; i++){
            string += array[i] + ", ";
        }
        if(string != ""){
            string = string.substring(0, string.length() - 2);
        }

        return "[" + string + "]";
    }
}