package ss19.Bai8;

import java.util.List;

public interface ListProcessor {
    int sumOddNumbers(List<Integer> list);

    default boolean checkOdd(List<Integer> list) {
        for (int num : list) {
            if (num % 2 != 0) {
                return true;
            }
        }
        return false;
    }

    static void printList(List<Integer> list) {
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
