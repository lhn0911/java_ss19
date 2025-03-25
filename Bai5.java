package ss19;

import java.util.ArrayList;
import java.util.List;

public class Bai5 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Alice");
        list.add("Andrew");
        list.add("Bob");
        list.add("Anna");
        list.add("Charles");

        List<String> list2 = new ArrayList<>();
        list2.add("Anna");
        list2.add("Alexandra");
        list2.add("Ashton");
        list2.add("Alfred");
        list2.add("Ariana");

        int count1 = 0, count2 = 0;
        for (String str : list) {
            if (str.startsWith("A") && str.length() >= 5) {
                count1++;
            }
        }

        for (String str : list2) {
            if (str.startsWith("A") && str.length() >= 5) {
                count2++;
            }
        }

        System.out.println("Số chuỗi hợp lệ trong list 1: " + count1);
        System.out.println("Số chuỗi hợp lệ trong list 2: " + count2);
    }
}
