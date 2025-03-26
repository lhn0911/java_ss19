package ss19.Bai8;

import java.util.ArrayList;
import java.util.List;

public class Bai8 {
    public static void main(String[] args) {
        ListProcessor processor = new ListProcessorImpl();

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(8);
        list.add(11);
        list.add(14);
        list.add(17);

        System.out.print("Danh sách: ");
        ListProcessor.printList(list);

        int sum = processor.sumOddNumbers(list);
        System.out.println("Tổng các số lẻ: " + sum);

        if (processor.checkOdd(list)) {
            System.out.println("Danh sách có chứa số lẻ.");
        } else {
            System.out.println("Danh sách không chứa số lẻ.");
        }
    }
}
