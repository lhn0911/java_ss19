package ss19.Bai6;

import java.util.List;

@FunctionalInterface
public interface StringProcessor {
    String processString(String input);

    default void printList(List<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
