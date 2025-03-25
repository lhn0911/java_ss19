package ss19.Bai6;

import java.util.ArrayList;
import java.util.List;

public class Bai6 {
    public static void main(String[] args) {
        List<String> inputStrings = new ArrayList<>();
        inputStrings.add("java");
        inputStrings.add("lambda");
        inputStrings.add("stream");
        inputStrings.add("functional");
        StringProcessor processor = input -> input.toUpperCase() + "-TECHNICAL";

        List<String> processedStrings = new ArrayList<>();
        for (int i = 0; i < inputStrings.size(); i++) {
            processedStrings.add(processor.processString(inputStrings.get(i)));
        }

        processor.printList(processedStrings);
    }
}
