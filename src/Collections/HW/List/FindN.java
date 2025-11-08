package Collections.HW.List;

import java.util.*;

public class FindN {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int N = 2;
        System.out.println("LinkedList: " + list);
        String result = findNthFromEnd(list, N);
        System.out.println(N + "th element from the end= " + result);
    }
    public static <T> T findNthFromEnd(LinkedList<T> list, int N) {
        Iterator<T> slow = list.iterator();
        Iterator<T> fast = list.iterator();
        for (int i = 0; i < N; i++) {
            if (fast.hasNext()) {
                fast.next();
            } else {
                throw new IllegalArgumentException("N larger than the list size!!");
            }
        }
        while (fast.hasNext()) {
            slow.next();
            fast.next();
        }
        return slow.next();
    }
}
