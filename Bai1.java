package ss19;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Bai1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Java");
        list.add("");
        list.add("Labda");
        list.add("Stream");
        list.add("");
        list.add("Functional");
        Predicate<String> isEmpty = new  Predicate<String>() {
            @Override
            public boolean test(String s) {
                return !s.isEmpty();
            }
        };
        List<String> list2 =  new ArrayList<>();
        for(String s: list){
            if(isEmpty.test(s)){
                list2.add(s);
            }
        }
        System.out.println(list2);
    }
}