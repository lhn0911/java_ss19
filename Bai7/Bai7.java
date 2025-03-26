package ss19.Bai7;

import java.util.ArrayList;
import java.util.List;

public class Bai7 {
    public static void main(String[] args) {
        ListProcessor processor = new ListProcessorImpl();

        List<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(-2);
        list1.add(10);
        list1.add(0);
        list1.add(-7);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(6);
        list2.add(7);

        System.out.print("Danh sách 1: ");
        ListProcessor.printList(list1);
        if (processor.containsNegative(list1)) {
            System.out.println("Danh sách chứa số âm");
        } else {
            System.out.println("Danh sách không chứa số âm");
        }

        System.out.print("Danh sách 2: ");
        ListProcessor.printList(list2);
        if (processor.containsNegative(list2)) {
            System.out.println("Danh sách chứa số âm");
        } else {
            System.out.println("Danh sách không chứa số âm");
        }
    }
}
