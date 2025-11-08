package Collections.CW;
import java.util.*;

public class LinkedListToStack {
    public static void main(String[] args) {
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack elements: " + stack);
        System.out.println("Popped element= " + stack.pop());
        System.out.println("Stack after pop: " + stack);
    }
}

