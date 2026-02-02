package List;

import java.util.*;

public class ReverseLinkedList {
    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> reversed = new LinkedList<>();

        for (Integer val : list) {
            reversed.addFirst(val);
        }
        return reversed;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(List.of(1, 2, 3, 4, 5));
        list = reverse(list);
        System.out.println(list); // [5, 4, 3, 2, 1]
    }
}
