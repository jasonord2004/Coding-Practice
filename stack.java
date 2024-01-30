import java.util.Stack;

public class stack{

    public static void main(String[] args){
        
        /* stack = LIFO data structure --> Last-In First-Out
         *       Stores objects into a "vertical tower"
         *       push() to add to the top; pop() to remove from the top
         * 
         * Applications of Stacks:
         *  1. undo/redo features in text editors
         *  2. moving back/forward through browser history
         *  3. backtracking algorithms (maze, file directories)
         *  4. calling functions (call stack) --> Calling a function adds a frame to the call stack . . . 
         */
        Stack<String> stack = new Stack<String>();

        //stack.empty() returns a boolean to check if the stack is empty
        System.out.println("EMPTY? " + stack.empty());
         
        /*pushs items within stack
        * you can run out of memory when pushing too many items within a stack, due to Java's heap stack
        */
        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");
        System.out.println("EMPTY? " + stack.empty());

        //stack.pop() removes the top of the stack. Returns the object popped
        String favGame = stack.pop();
        
        System.out.println("This is my favorite game: " + favGame);
        System.out.println("The rest of the stack: " + stack);

        //stack.peek() returns the top most item in the stack without removing it from the stack
        System.out.println("Whats at the top? " + stack.peek());

        System.out.println("The rest of the stack: " + stack);

        /* stack.search("x") will search the stack for x, and will return with its position from the top
        * range: -1 --> Not within the stack; 1 to length of stack --> position within the stack
        */
        System.out.println("Position of Skyrim: " + stack.search("Skyrim"));

    }

}